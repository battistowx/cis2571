/*
 * Name: Chris Battisto
 * File: HeadsOrTailsLoop.java
 * Date: 2/4/15
 * DescrL:
 * This program uses a random number generator to
 * toss a coin a user-specified number of times.
 */
public class HeadsOrTailsLoop {

	public static void main(String[] args) {
		//Named constants
		final int HEADS=0, TAILS=1;
		int numTosses=0, numHeads=0, numTails=0;
		//Determine how nany times to toss the coin
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("How many times to toss the coin? ");
		int totalTosses=Integer.parseInt(input.nextLine());
		//loop until number of tosses have been met 
		//using pretest while loop
/*		while (numTosses<totalTosses) {
			//Toss the coin
			int coinToss=(int)(Math.random()*2);
			//Increment number of heads/tails
			if (coinToss==HEADS) 
				numHeads++;
			else 
				numTails++;
			//Increment number of tosses
			numTosses++;
		}
*/
		//using do-while loop
		do {
			//Toss the coin
			int coinToss=(int)(Math.random()*2);
			//Increment number of heads/tails
			if (coinToss==HEADS) 
				numHeads++;
			else 
				numTails++;
			//Increment number of tosses
			numTosses++;
		} while (numTosses<totalLosses);
		//Output the results
		System.out.printf("Total number of tosses = %d with %d heads and %d tails. \n", numTosses, numHeads, numTails);
		
		//close input stream
		input.close();

	}

}
