package com.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style=Style.DOCUMENT,use=Use.LITERAL)//Encoded is not in use
public class MobilePhones {

	//We have directly written all logic here coz we just wanna see Phone datatype in wsdl
	@WebMethod
	@WebResult(name="Phone",partName="Phone1")
	public List<Phone> getPhones(@WebParam(name="PriceParam",partName="withinPrice") BigDecimal amount) throws Exception{
		
		if(amount.compareTo(BigDecimal.ZERO)==0){
			throw new Exception ("Amount cannot be zero");
		}
		Phone p1= new Phone();
		p1.setModel("Samsung J7");
		p1.setPrice(new BigDecimal(7658.89));
		Phone p2= new Phone();
		p2.setModel("Redmi");
		p2.setPrice(new BigDecimal(5678.45));
		List<Phone> phones =new ArrayList<Phone>();
		phones.add(p1);
		phones.add(p2);
		return phones;
	}
}
