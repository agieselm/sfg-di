package com.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

	@Override
	public String greet() {
		return "Hello World - Setter";
	}
}
