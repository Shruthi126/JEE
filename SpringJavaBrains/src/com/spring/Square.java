package com.spring;

public class Square {

	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	
	public Square(Point pointA, Point pointB, Point pointC, Point pointD) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		this.pointD = pointD;
	}
	
	public Square(){}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Point getPointD() {
		return pointD;
	}
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	public void draw(){
		System.out.println("Joining all 4 points");
		System.out.println("First Point " +pointA.toString());
		System.out.println("Second Point "+pointB.toString());
		System.out.println("Third Point "+pointC.toString());
		System.out.println("Fourth Point "+pointD.toString());
		
	}
	
}
