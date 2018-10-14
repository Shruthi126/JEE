package org.shruthi.rest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.shruthi.rest.DB.DB;
import org.shruthi.rest.model.Comment;
import org.shruthi.rest.model.Message;

public class CommentService {
	
	
	private static Map<Long,Message> messagesDB= DB.getMessages();
	
	public static List<Comment> getAllComments(Long messageID){
		Map<Long, Comment> comments = messagesDB.get(messageID).getComments();
		return new ArrayList<Comment>(comments.values());
	}

	public Comment getcomment(Long commentId, Long messageId) {
		Map<Long, Comment> commentsMap = messagesDB.get(messageId).getComments();
		return commentsMap.get(commentId);
	}

	public Comment addComment(Long messageId,Comment comment) {
		Map<Long, Comment> com=  messagesDB.get(messageId).getComments();
		comment.setCommentID(Long.valueOf(com.size()+1));
		com.put(comment.getCommentID(), comment);
		messagesDB.get(messageId).setComments(com);
		return comment;
	}
}
