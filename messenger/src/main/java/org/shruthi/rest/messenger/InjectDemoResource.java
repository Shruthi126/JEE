package org.shruthi.rest.messenger;

import java.util.Map;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.shruthi.rest.messenger.bean.MessageBeanParam;


@Path("injectDemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoResource {
	
	@GET
	@Path("/ParamAnnotate")
	//If we know which parameter to get then this is methid is fine
	public String getParamsUsingAnnotations(@MatrixParam("matrixP") String matrixParam,
											@HeaderParam("authToken") String authToken,
											@CookieParam("cookie") String cookie){
		
		return " Matrix Param "+matrixParam +" Header Param "+ authToken +" Cookie Param "+cookie ;
	}
	
	@GET
	@Path("/UseContext")
	public String useContext(@Context UriInfo uri, @Context HttpHeaders header ){
		
		String path = uri.getAbsolutePath().toString();
		String headertype=header.getHeaderString("authToken");
		
		return "Path "+path +"MediaType "+headertype;
	}
	
	@GET
	@Path("/BeanParam")
	/*Use this http://localhost:8080/messenger/webapi/injectDemo/BeanParam;matrixP=hhhh?year=2018
	 * Also give header value*/
	
	public String useContext(@BeanParam MessageBeanParam mfb){
		
		int year = mfb.getYear();
		String matrix=mfb.getMatrixParam();
		String header=mfb.getAuthToken();
		return "Year"+year +"Auuth "+header;
	}

}
