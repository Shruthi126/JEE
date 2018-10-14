package com.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Circle implements ApplicationEventPublisherAware {
	private String area;
	private ApplicationEventPublisher publisher;
	//We can create our own Publisher. But this object has to be injected there as well.
	
	public Circle(){}
	public Circle(String area) {
		super();
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	public void draw(){
		MyEvent me= new MyEvent(this);
		publisher.publishEvent(me);
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
	this.publisher=publisher;
		
	}
}
