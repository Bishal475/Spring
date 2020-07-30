package com.wp.handson5;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlayerDOA pl = new PlayerDOA();
		
		List<Player> players = pl.getAllPlayers();
		System.out.println("List of All The Players");
		for(Player p : players) {
			System.out.println(p);
		}
		System.out.println("Enter Country Name or Exit to exit");
		String country = sc.next();
		while(!country.toLowerCase().equals("exit")) {
			List<Player> result = pl.getPlayersByCountry(country);
			if(result.isEmpty()) {
				System.out.println("No Players from "+country);
			}else {
				System.out.println("List of All The Players From " + country);
				for(Player p : result) {
					System.out.println(p);
				}
			}
			System.out.println("Enter Country Name or Exit to exit");				
			country = sc.next();
		}
		
		sc.close();
	}
}
