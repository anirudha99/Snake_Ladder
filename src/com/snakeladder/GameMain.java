package com.snakeladder;

import java.util.Random;

public class GameMain {
	static final int No_Play = 1;
	static final int Ladder = 2;
	static final int Snake = 3;

	public static void main(String[] args) {
		System.out.println("Welcome to snake and ladder game!");
		int pos = 0; // start position
		Random rand = new Random();
		while(pos != 100) {
			int die_number = rand.nextInt(7-1)+1; // random number between 1-6
			System.out.println("Dies number is :"+ die_number);
			int choice = rand.nextInt(4-1)+1;
		switch (choice) {
		case No_Play :
			System.out.println("No play, please roll again");
			break;
		case Ladder :
			System.out.println("Ladder!! you go up by "+die_number);
			pos+=die_number;
			System.out.println("Current position is "+pos);
			break;
		case Snake :
			System.out.println("Snake!! You go down by "+ die_number);
			pos-=die_number;
			System.out.println("Current position is "+pos);
			break;
		}
		if (pos < 0)
			pos =0;
			System.out.println("Position reset to 0!!");
		}

	}

}
