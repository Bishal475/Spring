package com.wp.movie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Movie m = context.getBean(Movie.class);
		
		System.out.println(m.toString());
		((ConfigurableApplicationContext)context).close();
	}
}
