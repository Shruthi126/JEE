package org.shruthi.rest.model;

public class Comment {

	private long commentID;
	private String author;
	private String commentMessage;
	
	
	public Comment(){}
	public Comment(long commentID, String author, String commentMessage) {
		super();
		this.commentID = commentID;
		this.author = author;
		this.commentMessage = commentMessage;
	}
	public long getCommentID() {
		return commentID;
	}
	public void setCommentID(long commentID) {
		this.commentID = commentID;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCommentMessage() {
		return commentMessage;
	}
	public void setCommentMessage(String commentMessage) {
		this.commentMessage = commentMessage;
	}
	
	
}
