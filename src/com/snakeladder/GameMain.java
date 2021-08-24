package com.snakeladder;

import java.util.Random;

public class GameMain {
	
	static final int No_Play = 1;
	static final int Ladder = 2;
	static final int Snake = 3;
	static int count = 0;
	static int die_number = 0;
	static Random rand = new Random();
	
	public static int play(int position) {
		if(position < 0) {
			position =0;
		}
		die_number =  rand.nextInt(7-1)+1; // random number between 1-6
		count++;
		System.out.println("Die number is : "+ die_number);
		
		int choice = rand.nextInt(4-1)+1;  //select choice between 1-3
		switch (choice) {
		case No_Play :
			System.out.println("No play, please roll again");
			break;
		case Ladder :
			position+=die_number;
			System.out.println("Ladder!! you inclined by "+die_number);
			position = play(position);
			break;
		case Snake :
			position-=die_number;
			System.out.println("Snake!! You declined by "+ die_number);
			break;
		}
		if (position > 100) {
			position -= die_number;
		}
		return position;
	}

	
	public static void main(String[] args) {
		
		System.out.println("Welcome to snake and ladder game!");
		int person1position = 0, person2position = 0;; // start position
		
		while(person1position !=100 && person2position !=100) {
			System.out.println("Person 1 is playing");
			person1position = play(person1position);
			System.out.println("Position of person 1 is: "+ person1position);
			System.out.println("Person 2 is playing");
			person2position = play(person2position);
			System.out.println("Position of person 2 is: "+ person2position);
		}
		
		if(person1position == 100) {
			System.out.println("Congrats! Person 1 is the winner!!");
		}
		else {
			System.out.println("Congrats! Person 2 is the winner!!");
		}
		System.out.println("Die has been rolled "+count+" times!");
	}
		
}
