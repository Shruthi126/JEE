package com.spring.another;

import java.util.Map;


public class GeographicPlaces {
	
	private Map<String,String> cities;
	
	public GeographicPlaces(){}
	
	public GeographicPlaces(Map<String, String> cities) {
		super();
		this.cities = cities;
	}

	public Map<String, String> getCities() {
		return cities;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

	public void showCities(){
		cities.values().stream().forEach(System.out::println);
		
	}
	
}
