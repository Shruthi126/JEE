package com.spring;

import java.util.List;

public class Line {
	
	List<Point> points;
	
	
	public Line(){}
	
	public Line(List<Point> points) {
		super();
		this.points = points;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw(){
		points.stream().forEach(a-> System.out.println("Point co-ordinates "+a.getA()+","+a.getB()));
	}
	
}
