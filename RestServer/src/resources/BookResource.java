package resources;

import java.util.Collections;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import objects.Book;
import dao.AuthorDAO;
import dao.BookDAO;

@Stateless
@Path("/books")
public class BookResource {
	
	@EJB
	private BookDAO bookDAO;
	
	@GET
	public Response getAllBooks(){
		List<Book> books= Collections.emptyList();
		books=bookDAO.getAll();
		
		GenericEntity<List<Book>> bookEntity =new GenericEntity<List<Book>>(books){};
		
		return Response.ok().entity(bookEntity).build();
		
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Response createBook(Book book){
		
		Book bookWrappr=bookDAO.createBook(book);
				
		return Response.ok(bookWrappr).build();
		
	}

}
