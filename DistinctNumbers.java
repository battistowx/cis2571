import java.util.Scanner;

/*
 * Author: Chris Battisto
 * Date: 2/25/15
 * File: DistinctNumbers.java
 * Descr:
 * This program takes an input of 10 integers and displays how many
 * integers are different and displays those distinct numbers.
 */
public class DistinctNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] inputList=new int[10];
		boolean[] distinctions=new boolean[10];
		System.out.print("Enter ten numbers seperated by Enter: ");
		for(int i = 0; i < 10; i++) {
		    inputList[i] = input.nextInt();
		    distinctions[i]=testDistinct(inputList, inputList[i]);
		    System.out.println("Next integer: ");
		}
		     	
	}
	
	public static testDistinct(int[] inputList, int currentItem) {
		for(int i=0; i<inputList.length; i++) {
			
		}
	}
	return;

}
