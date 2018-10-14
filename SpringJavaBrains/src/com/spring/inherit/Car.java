package com.spring.inherit;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.spring.Point;


public class Car implements InitializingBean, DisposableBean  {
	
	private String mileage;
	private String bodyType;
	
	private String transmission;
	private String ac;
	private List<String> models;
	private Point autowiring;
	
	@Autowired //This is written just to shown autowired annotations
	public void setAutowiring(Point autowiring) {
		this.autowiring = autowiring;
	}	
	public Point getAutowiring() {
		return autowiring;
	}
	
	public String getMileage() {
		return mileage;
	}
	@Required 
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	
	
	public List<String> getModels() {
		return models;
	}
	public void setModels(List<String> models) {
		this.models = models;
	}
	public String toString(){
		System.out.println("Models available: ");
		models.stream().forEach(System.out::println);
		return "Car details: Mileage- "+mileage+", Body type-"+bodyType+", Trns-"+transmission+", Ac present-"+ac ;
		
	}
	//These are methods from interface
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method of DisposableBean");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method of InitializingBean");
		
	}
	
	//these are own init and destroy method and they have to mentioned in config file
	public void clean() throws Exception {
		System.out.println("clean method ");
		
	}
	
	public void init() throws Exception {
		System.out.println("init method ");
		
	}
	
	
}
