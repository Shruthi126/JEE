package com.action;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.service.ProductCatlogInterface;

@WebService(name="ShoppingCatlog",portName="ShoppingCatlogPort",serviceName="ShoppingCatlogService",
targetNamespace="www.shoppingmart.com",endpointInterface="com.service.ProductCatlogInterface")
//These tags should be not be  present in ProductCatlogInterface. See Java brains 14th video starting

public class ProductCatlog implements ProductCatlogInterface {
	ProductServiceImpl productServiceImpl= new ProductServiceImpl();
	/*This should have had interface but that not the goal of this project and there is one 
	 * more webservice interface. Two interfaces can be confusing.
	*/
	
	
	@Override
	@WebMethod(operationName="Categories")
	public List getCategories(){
		return productServiceImpl.getCategories();
			
		}
	
		@Override
		public List getProducts(String prodType){
			return productServiceImpl.getProducts(prodType);
				
			}

}
