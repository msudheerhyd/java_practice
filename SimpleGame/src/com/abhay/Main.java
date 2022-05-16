package com.abhay;

public class Main {
	
	public static void main(String[] args) {
		
		Player1 player = new Player1("Abhay", "Sword", 100);
//		System.out.println(player.getName());	
//		System.out.println(player.getHealth());	
//		System.out.println(player.getWeapon());	
		
		player.damageByGun1();
		player.damageByGun1();
		player.damageByGun2();
		player.heal();
		
		
		Player2 betterPlayer = new Player2("Sam", "machine gun", 80, false);
		betterPlayer.damageByGun1();
		
	}
}
