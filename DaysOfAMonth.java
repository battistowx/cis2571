/**
	File: DaysOfAMonth.java
	Author: Chris Battisto
	Date: 2/4/15
	Descr:
	This program takes an input of a year and a month and displays the amount of days in that month of that
	particular year
*/

import java.util.Scanner;

public class DaysOfAMonth {
	public static void main(String[] args) {
		//Create variables to hold input values
		System.out.println("Enter a year: ");
		Scanner yearInput=new Scanner(System.in);
		int year=yearInput.nextInt();
		System.out.println("Enter a month: ");
		Scanner monthInput=new Scanner(System.in);
		String month=new String(monthInput.next());
		boolean l;
		//Test for leap year using modulo
		if (year % 4==0) {
			l=true;
		} else {
			l=false;
		}
		int days = 0;
		//Switch month day values based on user input and leap year
		switch (month) {
			//31 days
			case "Jan": 
			case "Mar": 
			case "May":
			case "Jul": 
			case "Aug": 
			case "Oct": 
			case "Dec":
				days=31;
				break;
			//30 days
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
				days=30;
				break;
			//February length accounting for leap year
			case "Feb":
				if (l) {
					days=29;
				} else {
					days=28;
				} break;
			default:
				System.out.println("ERROR: Invalid Month Input");
				break;
		}
		System.out.println("There were " + days + " days in " + month + " of " + year);
		
	}
}

/**
*OUTPUT*
Enter a year: 
2015
Enter a month: 
Feb
There were 28 days in Feb of 2015
**
Enter a year: 
1996
Enter a month: 
Feb
There were 29 days in Feb of 1996
**
Enter a year: 
1966
Enter a month: 
Sep
There were 30 days in Sep of 1966
**
Enter a year: 
2003
Enter a month: 
February
ERROR: Invalid Month Input
There were 0 days in February of 2003
*/