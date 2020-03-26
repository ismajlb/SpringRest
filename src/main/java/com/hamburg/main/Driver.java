package com.hamburg.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		
		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read JSON from file and map/convert to JAVA POJO
			Student theStudent = mapper.readValue(new File("data/sample-full.json"),Student.class);

			System.out.println("First name = " + theStudent.getFirstName() + ".");
			System.out.println("Last name = " + theStudent.getLastName() + ".");
			
			
			// print out address: street and city
			Address tempAdress = theStudent.getAddress();
			System.out.println("Street: " + tempAdress.getCity() + ".");
			
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}

}
