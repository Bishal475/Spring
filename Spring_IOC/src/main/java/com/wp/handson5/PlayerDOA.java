package com.wp.handson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerDOA {
	
	ApplicationContext context;
	
	public List<Player> getAllPlayers(){
		context = new ClassPathXmlApplicationContext("bean5.xml");
		List<String> beans = Arrays.asList(context.getBeanDefinitionNames());
		
		List<Player> players = new ArrayList<Player>(); 
		
		for(String beanName : beans) {
			if(context.getBean(beanName).getClass().toString().split(" ")[1].equals("com.wp.handson5.Player")) {
				Player p = (Player) context.getBean(beanName);
				players.add(p);
			}
		}
		return players;
	}
	
	public List<Player> getPlayersByCountry(String countryName){
		context = new ClassPathXmlApplicationContext("bean5.xml");
		List<String> beans = Arrays.asList(context.getBeanDefinitionNames());
		
		List<Player> players = new ArrayList<Player>(); 
		
		for(String beanName : beans) {
			if(context.getBean(beanName).getClass().toString().split(" ")[1].equals("com.wp.handson5.Player")) {
				Player p = (Player) context.getBean(beanName);
				players.add(p);
			}
		}
		
		List<Player> result = new ArrayList<Player>();
		
		for(Player p : players) {
			if(p.getCountry().getCountryName().toLowerCase().equals(countryName.toLowerCase())) {
				result.add(p);
			}
		}
		return result;
	}
}
