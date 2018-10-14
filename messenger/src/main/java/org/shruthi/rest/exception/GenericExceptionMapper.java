package org.shruthi.rest.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.shruthi.rest.model.ErrorMessage;
@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		System.out.println(exception.getMessage());
		ErrorMessage err= new ErrorMessage(Status.INTERNAL_SERVER_ERROR.toString(),"Error");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(err).build();
		 
	}

}
