package com.beansEjemplos.beansxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansEjemplosApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/beansEjemplos/beansxml/beans.xml");
		Persona p = appContext.getBean(Persona.class);
		System.out.println(p.toString());
	}

}
