import java.util.Arrays;
import java.util.Scanner;

/*
 * Author: Chris Battisto
 * Data: 2/25/15
 * File: ColumnSorting.java
 * Descr:
 * This program takes a user input of a 3x3 matrix and sorts it by columns
 */
public class ColumnSorting {

	public static void main(String[] args) {
		double[][] array;
		array=new double[3][3];
		java.util.Scanner input=new Scanner(System.in);
		System.out.println("Enter a 3x3 matrix row by row:");
		for (int r=0; r<3; r++) {
			array[0][r]=input.nextDouble();
		}
		for (int c=0; c<3; c++) {
			array[1][c]=input.nextDouble();
		}
		for (int t=0; t<3; t++) {
			array[2][t]=input.nextDouble();
		}
		sortColumns(array);
		input.close();
	}
	
	public static void sortColumns(double[][] array) {
		System.out.println("The original array:");
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		System.out.println("The column-sorted array:");
		double[] c1=array[0];
		double[] c2=array[1];
		double[] c3=array[2];
		Arrays.sort(c1);
		Arrays.sort(c2);
		Arrays.sort(c3);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		System.out.println(Arrays.toString(c3));
	}

}
/**
OUTPUT
Enter a 3x3 matrix row by row:
0.15
0.875
0.375
0.55
0.005
0.225
0.30
0.12
0.4
The original array:
[0.15, 0.875, 0.375]
[0.55, 0.005, 0.225]
[0.3, 0.12, 0.4]
The column-sorted array:
[0.15, 0.375, 0.875]
[0.005, 0.225, 0.55]
[0.12, 0.3, 0.4]
**/