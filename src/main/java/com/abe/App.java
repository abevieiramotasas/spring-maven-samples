package com.abe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"spring.xml");

		Exemplo porProperty = (Exemplo) context.getBean("exemploProperty");
		Exemplo porConstructor = (Exemplo) context.getBean("exemploConstructor");
		Exemplo innerBean = (Exemplo) context.getBean("exemploInnerBean");
		Exemplo listBean = (Exemplo) context.getBean("exemploList");
		Exemplo mapBean = (Exemplo) context.getBean("exemploMap");
		Exemplo autowireBean = (Exemplo) context.getBean("exemploAutowiringByName");
		System.out.println(porProperty);
		System.out.println(porConstructor);
		System.out.println(innerBean);
		System.out.println(listBean);
		System.out.println(mapBean);
		System.out.println(autowireBean);
		
	}
}
