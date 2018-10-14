package org.shruthi.rest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.shruthi.rest.DB.DB;
import org.shruthi.rest.model.Profile;

public class ProfileService {
	
private static Map<String,Profile>  profileDB =DB.getMessages();
	
	public ProfileService() {
		profileDB.put("Shruthi",new Profile("Shruthi",1L,new Date(),"Employee"));
		profileDB.put("Mona" ,new Profile("Mona",2L, new Date(),"Student"));
		
	}
	
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profileDB.values());
	}

	public Profile getProfile(String name){
		Profile profile= (Profile) profileDB.get(name);
		return profile ;
	}
	
	public boolean updateMessage(Profile profile){
		String name=profile.getName();
		
		if(name!=null){
			profileDB.put(name, profile);
			return true;
		}
			return false;
	}
	public Profile addMessage(Profile profile){
		Long id= Long.valueOf(profileDB.size()+1);
		profile.setId(id);
		profileDB.put(profile.getName(),profile);
		return profile;
	}
	
	public boolean removeMessage(String name){
		
		profileDB.remove(name);
		
		return true;
	}

}
