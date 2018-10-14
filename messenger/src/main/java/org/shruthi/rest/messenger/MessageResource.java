package org.shruthi.rest.messenger;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.shruthi.rest.model.Link;
import org.shruthi.rest.model.Message;
import org.shruthi.rest.service.MessageService;


@Path("messages")
public class MessageResource {
	MessageService ms= new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam("year") int year,
									@QueryParam("start") int start,
									@QueryParam("size") int size,@Context UriInfo uriInfo){
		if(year>0){
			return ms.getAllMessagesForYear(year);//http://localhost:8080/messenger/webapi/messages?year=2015
		}
		List<Message> mss= ms.getAllMessages();
		mss = getUriForSelf(uriInfo, mss);
		mss=getUriForProfile(uriInfo, mss);
		mss=getUriForComments(uriInfo, mss);
		
		return mss;
	}

		
	@GET
	@Path("/{messsageId}")
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})// Both can be supported at a time
	
	public Message getMessage(@PathParam("messsageId")Long messageID, @Context UriInfo uriInfo) {
		Message m=ms.getMessage(messageID);
		m.getLinks().add(new Link("self",uriInfo.getAbsolutePathBuilder().toString()));
		return m;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message){
		return ms.addMessage(message);
	}
	
	@POST
	@Path("/Post2")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMessage2(Message message){
		Message m= ms.addMessage(message);
		return Response.status(Status.CREATED).entity(m).build();
	}
	@POST
	@Path("/Post3")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMessage3(Message message, @Context UriInfo uri){
		Message m= ms.addMessage(message);
		return Response.created(uri.getAbsolutePathBuilder().path(String.valueOf(m.getId())).build()).entity(m).build();
		//This is enchanced way of creating 201 response along with URI location
	}
	
	@PUT
	@Path("/{messsageId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public boolean updateMessage(Message message,@PathParam("messsageId")Long messageID){
		message.setId(messageID);
		return ms.updateMessage(message);
	}

	@DELETE
	@Path("/{messsageId}")
	@Produces(MediaType.TEXT_PLAIN)// Both can be supported at a time
	public boolean removeMessage(@PathParam("messsageId")Long messageID){
		return ms.removeMessage(messageID);
	}
	
	//No need of path forsub resource as it will be defined in sub resource class
	@Path("/{messageId}/comments")
	public CommentResource comments(){
		return new CommentResource();
	}
	
	
	private List<Message> getUriForSelf(UriInfo uriInfo, List<Message> mss) {
		mss=mss.stream().map(a->{a.getLinks().add(new Link("self",uriInfo.getBaseUriBuilder().
																	path(MessageResource.class).
																	path(String.valueOf(a.getId())).
																	build().toString()));
							return a;}
				).collect(Collectors.toList());
		return mss;
	}
	private List<Message> getUriForProfile(UriInfo uriInfo, List<Message> mss) {
		mss=mss.stream().map(a->{a.getLinks().add(new Link("profile",uriInfo.getBaseUriBuilder().
																	path(ProfileResource.class).
																	path(a.getAuthor()).
																	build().toString()));
							return a;}
				).collect(Collectors.toList());
		return mss;
	}
	private List<Message> getUriForComments(UriInfo uriInfo, List<Message> mss) {
		mss=mss.stream().map(a->{a.getLinks().add(new Link("profile",uriInfo.getBaseUriBuilder().
																			path(MessageResource.class).
																			path(MessageResource.class,"comments").
																			resolveTemplate("messageId", a.getId()).
																			build().toString()));
							return a;}
				).collect(Collectors.toList());
		return mss;
	}
}
