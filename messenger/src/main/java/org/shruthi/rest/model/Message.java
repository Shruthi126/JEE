package org.shruthi.rest.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

public class Message {
	
	private long Id;
	private Date date;
	private String author;
	private String message;
	private Map<Long, Comment> comments = new HashMap<Long, Comment>();
	private List<Link> links= new ArrayList<>();
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@XmlTransient	
	public Map<Long, Comment> getComments() {
		return comments;
	}
	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
	
	
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public Message(long id, Date date, String author, String message) {
		super();
		Id = id;
		this.date = date;
		this.author = author;
		this.message = message;
	}
	public Message(){}
	
}
