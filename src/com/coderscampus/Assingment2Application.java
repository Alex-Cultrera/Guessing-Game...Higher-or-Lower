package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assingment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		int theRandomNumber = random.nextInt(1, 101);
		Scanner scanner;
		String input;
		int convertedInput;
		System.out.println("Pick a number from 1 to 100");
		
		int guess = 1;
		while (guess < 6) {
			scanner = new Scanner(System.in);
			input = scanner.nextLine();
			convertedInput = Integer.parseInt(input);
			if (convertedInput >= 1) 
			{
				if (convertedInput == theRandomNumber) {
					System.out.println("You win!");
					System.exit(0); 
				}
				else if (convertedInput < 101) {
					if (convertedInput < theRandomNumber) {
						System.out.println("Please pick a higher number");
					}
					else if (convertedInput > theRandomNumber) {
						System.out.println("Please pick a lower number");
					}
				}
				else if (convertedInput > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again");
					System.out.println("Pick a number from 1 to 100");
					guess--;
				}
					
			}
			else if (convertedInput < 1) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				System.out.println("Pick a number from 1 to 100");
				guess--;
			}
		guess++;
		
		}
		System.out.println("You Lose!");
		System.out.println("The number to guess was: " + theRandomNumber);
		
	}
}
