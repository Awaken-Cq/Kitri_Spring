package com.kitri.hello3;

public class HelloServiceEng implements HelloService {

	public HelloServiceEng() {
		System.out.println("Call HelloServiceEng Constructor");
	}

	@Override
	public String hello(String name) {
		
		return "Hello, " +  name + " \r\nWelcome:)";
	}
	
}