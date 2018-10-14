package com.spring;

public class Triangle {
	
	private String type;
	private int height;
	
	public Triangle(){}
	
	public Triangle(String type) {
		super();
		this.type = type;
	}


	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public String getType() {
		return type;
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setType(String type) {
		this.type = type;
	}


	public void draw(){
		System.out.println(getType()+"Triangle"+" Height: "+height);
	}

}
