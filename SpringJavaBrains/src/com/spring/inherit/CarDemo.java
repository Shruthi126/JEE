package com.spring.inherit;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDemo {
	
	public static void main(String args[]){
		AbstractApplicationContext ap= new ClassPathXmlApplicationContext("inherit.xml");
		//All instantiation initialization of bean factory and beans are done in that one line. see the output below
		/*Inside post Process Bean Factory
		In postProcessBeforeInitialization
		afterPropertiesSet method of InitializingBean
		init method 
		In postProcessAfterInitialization
		In postProcessBeforeInitialization
		afterPropertiesSet method of InitializingBean
		init method 
		In postProcessAfterInitialization*/
		System.out.println("after app context");
		ap.registerShutdownHook();// for this we need to use AbstractApplicationContext
		Car car= (Car)ap.getBean("volkswagenX");
		System.out.println(car);
		
	}

}
