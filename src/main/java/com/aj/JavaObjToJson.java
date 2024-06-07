package com.aj;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaObjToJson {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Address addr = new Address();
		addr.setCity("Akola");
		addr.setState("MH");
		addr.setCountry("Inida");
		Customer custoemr = new Customer();
		custoemr.setId(101);
		custoemr.setName("ajay");
		custoemr.setEmail("ajay@mail.com");
		
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"),custoemr);
		System.out.println("Json File Created");
		
	}

}
