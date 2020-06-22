package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {
	
	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		for(int i=0; i<10; i++) {
			System.out.println(encoder.encode("password@123@#!"));
		}
		
	}

}
