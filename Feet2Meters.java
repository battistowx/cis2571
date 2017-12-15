/**
	File: Feet2Meters.java
	Author: Chris Battisto
	Date: 1/26/15
	Descr:
	This program takes an input of feet and converts it to meters.
*/

import java.util.Scanner;

public class Feet2Meters {
	public static void main(String[] args) {
		//create constant for meters in 1 foot
		final double METER=0.3048;
		//variables to hold feet input and result
		float feet, result;
		System.out.println("Please input a value in feet: ");
		Scanner input=new Scanner(System.in);
		feet=input.nextFloat();
		//calculate/display conversion
		result=feet*(float)METER; 
		System.out.println("There are " + result + " meters in " + feet + " feet"  );
		
	}
}
	
/* OUTPUT
C:\Users\Christopher\JavaFiles>java Feet2Meters
Please input a value in feet:
10
There are 3.048 meters in 10.0 feet
*/