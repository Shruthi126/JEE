package org.shruthi.rest.messenger;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shruthi.rest.model.Comment;
import org.shruthi.rest.service.CommentService;

@Path("/")
public class CommentResource {
	CommentService cs = new CommentService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comment> getAllComments(@PathParam("messageId")Long messageId){
		return cs.getAllComments(messageId);
	}
	
	@GET
	@Path("/{commentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Comment getComment(@PathParam("commentId")Long commentId,@PathParam("messageId")Long messageId){
		return cs.getcomment(commentId,messageId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Comment addComment(@PathParam("messageId")Long messageId,Comment comment){
		return cs.addComment(messageId, comment);
	}
}
