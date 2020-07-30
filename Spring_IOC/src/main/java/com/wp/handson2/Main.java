package com.wp.handson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		ConstructorMessage m = context.getBean(ConstructorMessage.class);
		m.display();
		
		((ConfigurableApplicationContext)context).close();
	}
}
