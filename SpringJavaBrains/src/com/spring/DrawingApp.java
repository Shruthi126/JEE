package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle t= new Triangle();
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle t= (Triangle)context.getBean("triangle");
		t.draw();
		
		Square s= context.getBean(Square.class);
		s.draw();
		
		Line l = (Line) context.getBean("line");
		l.draw();
				

	}

}
