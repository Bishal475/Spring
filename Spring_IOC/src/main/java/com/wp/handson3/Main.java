package com.wp.handson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
		SetterMessage m = context.getBean(SetterMessage.class);
		System.out.println(m.getMsg());
		
		((ConfigurableApplicationContext)context).close();
	}
}
