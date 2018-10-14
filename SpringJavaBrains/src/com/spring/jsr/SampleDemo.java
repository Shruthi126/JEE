package com.spring.jsr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SampleDemo {

	public static void main(String[] args) {
		AbstractApplicationContext ap= new ClassPathXmlApplicationContext("jsrSpring.xml");
		ap.registerShutdownHook();
		Sample sp= (Sample)ap.getBean("sample");
		SampleDependency sd= (SampleDependency) ap.getBean("samDep");
		System.out.println(sd.getDunnoWhat());
		System.out.println(sp.getSamDep().getDunnoWhat());
	}

}
