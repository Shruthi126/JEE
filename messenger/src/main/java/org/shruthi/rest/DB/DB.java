package org.shruthi.rest.DB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.shruthi.rest.model.Comment;
import org.shruthi.rest.model.Message;
import org.shruthi.rest.model.Profile;

public class DB {
	
	private static Map<Long,Message>  messages = new HashMap<Long,Message>();
	private static Map  profiles = new HashMap<String,Profile>();
	private static Map<Long,Comment>  comments = new HashMap<Long,Comment>();
	
	public static Map getMessages() {
		return messages;
	}
	public static void setMessages(Map messages) {
		DB.messages = messages;
	}
	public static Map getProfiles() {
		return profiles;
	}
	public static void setProfiles(Map profiles) {
		DB.profiles = profiles;
	}
	public static Map getComments() {
		return comments;
	}
	public static void setComments(Map comments) {
		DB.comments = comments;
	}
	
	
	
	
	
}
