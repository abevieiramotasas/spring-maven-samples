package com.abe;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	/**
	 * Argumentos
	 * Object : bean
	 * String : nome do bean no xml
	 * espera que se retorne o bean, para continuar o processamento
	 */
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("PostProcessor after : " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("PostProcessor before : " + arg1);
		return arg0;
	}

}
