package com.action;


import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {

	
	public List getCategories() {
		
		List<String> catList= new ArrayList<String>();
		catList.add("Movies");
		catList.add("Books");
		catList.add("Series");
		return null;
		// TODO Make hibernate hit here
		
	}

	
	public List getProducts(String prodType) {
		List<String> prodList= new ArrayList<String>();
		switch(prodType){
		case "Movies":
			prodList.add("Hachiko");
			prodList.add("Barfi");
			prodList.add("DeadPool");
			break;
		case "Books":
			prodList.add("Many lives Many masters");
			prodList.add("The wings of Fire");
			prodList.add("The three thousand stitches");
			break;
		case "Series":
			prodList.add("F.R.E.I.N.D.S");
			prodList.add("GOT");
			prodList.add("Sherlock");
			break;
		}
	
		return prodList;
	}

	
	
}
