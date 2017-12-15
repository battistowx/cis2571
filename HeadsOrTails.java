/*
 * File: HeadsOrTails.java
 * Author: Chris Battisto
 * Date: 1/28/15
 * Descr:
 * This program uses a random number generator to play the game of heads or tails.
 */

public class HeadsOrTails {

	public static void main(String[] args) {
		//Named constants
		final int HEADS=0, TAILS=1;
		//Get computer's guess using random number generator
		int compGuess=(int)(Math.random()*2);
		//Get the user's guess
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Guess Heads or Tails " + "\n\tEnter 0 for Heads and 1 for Tails: " );
		int userGuess=Integer.parseInt(input.next());
		//Check the computer and user's guess
		if (userGuess==compGuess)
			System.out.println("Correct guess--You win!");
		else if (userGuess==TAILS && compGuess==HEADS)
			System.out.println("Sorry, you guessed tails and the computer "
					+ "guessed heads");
		else if (userGuess==HEADS && compGuess==TAILS)
			System.out.println("Sorry, you guessed heads and the computer "
					+ "guessed tails");
		else
			System.out.println("Choose 0 or 1");
		//close input stream
		input.close();
		
		
		

	}

}
