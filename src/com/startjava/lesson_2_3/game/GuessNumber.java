package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumber {

	Scanner in = new Scanner(System.in);
	String prod = "Y";

	public void guess() {
			do {
				Player plOne = new Player("Вася", 30);
				Player plTwo = new Player("Алёша", 75);
				int compNumber =  (int) (1 + Math.random()*100);
				int x = plOne.getNumber();
				int y = plTwo.getNumber();
				

				
				while (x!=compNumber && y!=compNumber) {
		
					System.out.println(plOne.getName() + " загадал " + x + ", а "+ plTwo.getName() + " загадал " + y);
		
					if ( x < compNumber) {
						x++;
					} else if (x > compNumber) {x--;}
		
					if (y < compNumber) {
						y++;
					} else if (y > compNumber) {y--;}
		
				}
				if (x == compNumber) {System.out.println(plOne.getName() + " загадал " + x + " и победил!");}
				if (y == compNumber) {System.out.println(plTwo.getName() + " загадал " + y + " и победил!");}
				do {
		 			System.out.println("Хотите продолжить? [Y/N]: ");
		 			prod = in.next();
		 			
		 			if (prod.equalsIgnoreCase("N")){break;}

		 		} while (!prod.equalsIgnoreCase("Y"));

			} while (prod.equalsIgnoreCase("Y"));
	}
	
}