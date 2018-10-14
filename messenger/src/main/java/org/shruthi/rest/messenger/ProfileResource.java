package org.shruthi.rest.messenger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shruthi.rest.model.Profile;
import org.shruthi.rest.service.ProfileService;

@Path("profile")
public class ProfileResource {
	ProfileService ps = new ProfileService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getAllProfiles(){
		return ps.getAllProfiles();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile getProfiles(Profile profile){
		return ps.addMessage(profile);
	}
	
	@GET
	@Path("/{profileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getAllProfiles(@PathParam("profileName") String profileName){
		return ps.getProfile(profileName);
	}

}
