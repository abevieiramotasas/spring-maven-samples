package com.abe;

public class ConstructorInjection {
	
	private String name;
	
	private ConstructorInjection(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println("Hello " + this.name);
	}

}
