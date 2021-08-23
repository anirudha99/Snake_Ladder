package com.snakeladder;

import java.util.Random;

public class GameMain {

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game!");
		int pos = 0;
		 
		Random rand = new Random();
		int die_number = rand.nextInt(7-1)+1;
		System.out.println(die_number);

	}

}
