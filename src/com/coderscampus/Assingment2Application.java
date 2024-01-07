package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assingment2Application {

	public static void main(String[] args) {
		Random random = new Random();
		random.nextInt(1, 101);
		System.out.println("Pick a number from 1 to 100");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(input);
		
		if 

	}

}


/*////////  Assigment 2  //////////
 
 Higher / Lower Guessing Game
 
 a random number will be generated >>>>>>> random.nextInt(1, 101);
 
 players guess a number from 1 to 100 >>>>>>> System.out.println("Pick a number from 1 to 100");
 
 Note: should only generate int values (don’t use floats / doubles)
 
 If the number chosen is outside of this range, an error message displays saying: 
 “Your guess is not between 1 and 100, please try again”
 
 Note: an invalid input should not affect the number of guesses the player has left 
 (so do not remove a guess from the player if they enter a number outside of the 1 - 100 range)
 (Don’t worry about trying to validate any input other than int values; 
 ie. Don’t worry about decimals or words)
 
 When the player enters a valid guess (a number between 1 and 100), 
 the game should prompt the player with one of three messages:
1. “Please pick a higher number” (if the number they chose is lower than the randomly generated number), or
2. “Please pick a lower number” (if the number they chose is higher than the randomly generated number), or
3. “You win!” (if they guess the correct number)

The player only gets 5 chances to guess the number.

If they haven’t guessed the correct number after 5 tries, 
then the game is over and the outputted message should read 
“You lose, the number to guess was theRandomNumber” 
(where theRandomNumber is the actual value of the variable generated at the beginning of the game)

Once the user fails to guess the number, or if they correctly guess the number, 
the game is over and the application ends.

 
 */