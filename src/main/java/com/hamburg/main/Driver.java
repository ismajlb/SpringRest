package com.hamburg.main;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		
		try {
			
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read JSON from file and map/convert to JAVA POJO
			Student myStudent = mapper.readValue(new File("data/sample-full.json"),Student.class);

			System.out.println("First name = " + myStudent.getFirstName());
			System.out.println("Last name = " + myStudent.getLastName());
			
		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}

}
