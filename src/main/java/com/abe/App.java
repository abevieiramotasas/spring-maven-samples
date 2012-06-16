package com.abe;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new FileSystemXmlApplicationContext(
				"spring.xml");
		context.registerShutdownHook();

		Exemplo porProperty = (Exemplo) context.getBean("exemploProperty");
		Exemplo porConstructor = (Exemplo) context.getBean("exemploConstructor");
		Exemplo innerBean = (Exemplo) context.getBean("exemploInnerBean");
		Exemplo listBean = (Exemplo) context.getBean("exemploList");
		Exemplo mapBean = (Exemplo) context.getBean("exemploMap");
		Exemplo autowireBean = (Exemplo) context.getBean("exemploAutowiringByName");
		Exemplo inheritanceBean = (Exemplo) context.getBean("exemploInheritance");
		Exemplo initDestroyBean = (Exemplo) context.getBean("beanComInitializerDestroyerPorXML");
		Exemplo comPropertyFile = (Exemplo) context.getBean("exemploPropertyFile");
		System.out.println(porProperty);
		System.out.println(porConstructor);
		System.out.println(innerBean);
		System.out.println(listBean);
		System.out.println(mapBean);
		System.out.println(autowireBean);
		System.out.println(inheritanceBean);
		System.out.println(initDestroyBean);
		System.out.println(comPropertyFile);
		
	}
}
