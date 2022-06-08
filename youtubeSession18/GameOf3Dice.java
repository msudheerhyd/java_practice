package com.practice.youtubeSession18;

import java.util.Random;
import java.util.Scanner;

public class GameOf3Dice {
	
	public static void main(String[] args) {
		int numDice = 3, trails = 5;
		int playerPoints = 0, computerPoints = 0;
		Random choice = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your target number:");
		int playerTarget = scan.nextInt();
		Game player = new Game(numDice, trails);
		playerPoints = player.play("Player", playerTarget);
		int computerTarget = choice.nextInt(6) + 1;
		System.out.println("Computer's target is " + computerTarget);
		Game computer = new Game(numDice, trails);
		computerPoints = computer.play("Computer", computerTarget);
		if (playerPoints > computerPoints) {
			System.out.println("You win");
		}
		else if (playerPoints < computerPoints) {
			System.out.println("Computer wins");
		}
		else System.out.println("Draw");
		scan.close();
	}
}
