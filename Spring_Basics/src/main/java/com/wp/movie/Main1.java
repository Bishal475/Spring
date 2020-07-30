package com.wp.movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		DefaultMessage m = context.getBean(DefaultMessage.class);
		
		System.out.println(m.getMessage());
		((ConfigurableApplicationContext)context).close();
	}
}
