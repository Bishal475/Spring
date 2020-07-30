package com.wp.handson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShape {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Shape m = (Shape)context.getBean("tri");
		m.draw();
		
		((ConfigurableApplicationContext)context).close();
	}
}
