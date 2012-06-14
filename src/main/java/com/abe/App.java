package com.abe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"spring.xml");

		PropertyInjection obj = (PropertyInjection) context.getBean("propertyInjection");
		ConstructorInjection ci = (ConstructorInjection) context.getBean("constructorInjection");
		obj.printHello();
		ci.printName();
	}
}
