package org.shruthi.rest.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.shruthi.rest.DB.DB;
import org.shruthi.rest.exception.DataNotFoundException;
import org.shruthi.rest.model.Message;

public class MessageService {

	private static Map<Long, Message>  messagesDB =DB.getMessages();
	
	public MessageService() {
		messagesDB.put(1L ,new Message(1L,new Date(),"Shruthi","Yayy, We did it!"));
		messagesDB.put(2L ,new Message(2L,new Date(),"Mona","Dankanak"));
		
	}
	
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messagesDB.values());
	}

	public Message getMessage(Long id){
		Message message= (Message) messagesDB.get(id);
		if(message==null){
			throw new DataNotFoundException("Message not found");
		}
		return message ;
	}
	
	public boolean updateMessage(Message message){
		Long id= message.getId();
		
		if(id>0){
			messagesDB.put(id, message);
			return true;
		}
			return false;
	}
	public Message addMessage(Message message){
		Long id= Long.valueOf(messagesDB.size()+1);
		message.setId(id);
		messagesDB.put(id,message);
		return message;
	}
	
	public boolean removeMessage(Long id){
		
		messagesDB.remove(id);
		
		return true;
	}

	public List<Message> getAllMessagesForYear(int year) {
		List<Message> messageList = new ArrayList<Message>();
		Calendar cal= Calendar.getInstance(); 
		for(Message m:messagesDB.values()){
			cal.setTime(m.getDate());
			if(cal.get(Calendar.YEAR)==year){
				messageList.add(m);
			}
		}
		return messageList;
	}
} 
