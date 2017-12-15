/*
 * Author: Chris Battisto
 * File: Dec2Bin.java
 * Date: 2/9/15
 * Descr:
 * This program takes an integer input of a base 10 number
 * and converts it to binary format.
 */
public class Dec2Bin {

	public static void main(String[] args) {
		//Declare variables
		int numInput=0, remain=0;
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.println("Input a base-10 number: ");
		numInput=Integer.parseInt(input.nextLine());
		if (numInput<0) {
			System.out.println("Please enter a number greater than zero");
		}
		if (numInput==0) {
			System.out.println("0");
		}
		System.out.println("Decimal Input: " + numInput);
		String binOutput = "";
		//Loop through binary digits
		while (numInput>0) {
			remain=numInput % 2;
			binOutput=remain+binOutput;
			numInput=numInput/2;
		}
		System.out.println("Binary Output: " + binOutput);
	}
}
/*
 * OUTPUT *
 * Input a base-10 number: 
 * 99
 * Decimal Input: 99
 * Binary Output: 1100011
 * 
 * 
 * 
 * 
 */ 
