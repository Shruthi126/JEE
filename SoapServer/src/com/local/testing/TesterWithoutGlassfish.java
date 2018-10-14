package com.local.testing;

import javax.xml.ws.Endpoint;

import com.action.ProductCatlog;

public class TesterWithoutGlassfish {

	public static void main(String[] args){
		
		Endpoint.publish("http://192.168.43.252:1234/ShoppingCatlogService", new ProductCatlog());
	}
}
