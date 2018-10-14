package com.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AllEventListener implements ApplicationListener {

	
	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println(arg0.toString());
		
	}

}
