package org.shruthi.rest.exception;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String reason;
	
	public DataNotFoundException(String reason){
		super(reason);
	}

}
