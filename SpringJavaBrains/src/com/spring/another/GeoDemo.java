package com.spring.another;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GeoDemo {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("springGeo.xml");
		GeographicPlaces gp=ap.getBean(GeographicPlaces.class);
		gp.showCities();
	}

}
