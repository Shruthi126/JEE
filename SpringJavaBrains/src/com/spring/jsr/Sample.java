package com.spring.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Sample {
	
	private SampleDependency samDep;

	public SampleDependency getSamDep() {
		return samDep;
	}
	
	@Resource(name="samDep")
	public void setSamDep(SampleDependency samDep) {
		this.samDep = samDep;
	}
	
	@PreDestroy
	public void clean() throws Exception {
		System.out.println("clean method ");
		
	}
	@PostConstruct
	public void init() throws Exception {
		System.out.println("init method ");
		
	}
	
	
}
