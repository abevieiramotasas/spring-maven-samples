package com.abe;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ExemploApplicationContextAware implements ApplicationContextAware{
	
	// TODO ver como usar hehe
	private ApplicationContext appContext;
	
	

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.appContext = arg0;
		
	}

}
