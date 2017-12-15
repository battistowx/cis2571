/*
 * Author: Chris Battisto
 * Date: 2/23/15
 * File: Test2DArray.java
 * Descr:
 * This program uses and manipulates 2D array structures
 */
public class Test2DArray {

	public static void main(String[] args) {
		//create and init array option #1
		int[][] numbers;
		numbers=new int [2][3]; //creates 2 rows and 3 columns
		numbers[0][0]=1; //first row
		numbers[0][1]=2;
		numbers[0][2]=3; 
		numbers[1][0]=4; //second row
		numbers[1][1]=5;
		numbers[1][2]=6;
		//create and init array option #2
		int[][] numbers2={{1, 2, 3}, {4, 5, 6}};
		//display array elements
		System.out.println("Printing numbers...");
		printArray(numbers);
		System.out.println("Printing numbers2...");
		printArray(numbers2);
	}
	
	//method to print out all array elements of 2D integer array
	public static void printArray(int[][] matrix) {
		//outer loop goes over each row
		for (int row=0; row<matrix.length; row++) {
			//inner loop goes over each column in row
			for (int col=0; col<matrix[row].length; col++)
				System.out.print(matrix[row][col] + " ");
			System.out.print("\n");
		}

	}
	
	//method to sum elements by column
	public static void sumByCol(int[][] matrix) {
		//outer loop goes over each column
		for (int col=0; col<matrix[0].length; col++) {
			int colTotal=0;
			//inner loop goes over each row in column
			for (int row=0; row<matrix.length; row++)
				colTotal+=matrix[row][col];
			System.out.println("Sum for col " + col + " is " + colTotal);
		}
	}
}        

/**
OUTPUT
Printing numbers...
1 2 3 
4 5 6 
Printing numbers2...
1 2 3 
4 5 6 
**/