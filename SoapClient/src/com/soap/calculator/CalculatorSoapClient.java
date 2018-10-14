package com.soap.calculator;

import org.tempuri.*;

public class CalculatorSoapClient {
	
	public static void main(String args[]){
		Calculator cal= new Calculator(); 
		CalculatorSoap calSoap = cal.getCalculatorSoap();
		Integer sum=calSoap.add(4, 5);
		Integer divide=calSoap.divide(5, 0);
		System.out.println(sum+" "+divide);
		
	}

}
