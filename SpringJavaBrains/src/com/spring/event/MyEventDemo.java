package com.spring.event;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyEventDemo {

	public static void main(String[] args) {
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("eventSpring.xml");
		//If you have code till last line. It will show  framework related events : Output ContextRefreshedEvent
		Circle c= (Circle) ap.getBean("circle");
		c.draw();
		
		
	}

}
