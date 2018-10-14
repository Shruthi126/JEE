package com.service;

import java.util.List;

import javax.jws.WebService;

//This is a interface for Webservice Contract
@WebService
public interface ProductCatlogInterface {

	public abstract List getCategories();

	public abstract List getProducts(String prodType);
}

