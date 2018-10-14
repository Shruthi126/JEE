package com.java.enumer;

public enum EnumConstants {
	IT("it"),BT("bt"),CT("ct"),GT("gt");
	
	private String x;
	private EnumConstants(String x){
		this.x=x;
	}
	
	/*public constructor is not allowed
		Think of Enums as a class with a finite number of instances. There can never be any different instances
	    beside the ones you initially declare.
	
		Thus, you cannot have a public or protected constructor, because that would allow more instances to be created.
	*/	
}
