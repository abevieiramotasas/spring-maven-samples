package com.abe;

public class PropertyInjection {

	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello "+this.name);
	}
}
