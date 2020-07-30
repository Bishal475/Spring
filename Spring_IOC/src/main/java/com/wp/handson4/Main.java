package com.wp.handson4;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
		
		List<String> beans = Arrays.asList(context.getBeanDefinitionNames());
		for(String beanName : beans) {
			if(context.getBean(beanName).getClass().toString().split(" ")[1].equals("com.wp.handson4.Student")) {
				Student s = (Student) context.getBean(beanName);
				System.out.println(s);
			}
		}
		
		((ConfigurableApplicationContext)context).close();
	}
}
