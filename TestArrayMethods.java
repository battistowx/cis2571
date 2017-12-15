import java.util.Scanner;

/*
 * Author: Chris Battisto
 * Date: 2/16/15
 * File: TestArrayMethods.java
 * Descr:
 * This program creates an array and uses various methods with arrays
 */
public class TestArrayMethods {

	public static void main(String[] args) {
		//prompt user for size of array
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int size=input.nextInt();
		//create array reference variable, declare list:
		int[] list = new int[size];
		//assign values to array from index 0 to the size of the list, increment i each time
		for (int i=0; i<list.length; i++) {
			System.out.println("Enter an integer: ");
			list[i]=input.nextInt();
		}
		//use for-each loop to display values at each index (iVal)
		for (int iVal: list)
			System.out.println("Element "+iVal);
		//use loop to find the smallest and index of the smallest item
		int min=list[0]; //initialize the minimum
		int minIndex=0; //initialize index of minimum
		for(int i=1; i<list.length; i++)
			if (list[i]<min) {
				min=list[i];
				minIndex=i;
			}
		//display the smallest and its index
		System.out.println("The minimum number: "+min+
				" located at index "+ minIndex);
		//create a copy of the list
		int[] listCopy=new int[size];
		//listCopy=list; refers to memory location
		System.arraycopy(list, 0, listCopy, 0, list.length);
		for (int iVal: listCopy)
			System.out.println("Copied Element "+iVal);
		//insert the number 500 into first item index
		listCopy[0]=500;
		System.out.print("Original list: ");
		printArray(list);
		System.out.print("Copied list: ");
		printArray(listCopy);
		swapFirstTwoElements(list);
		System.out.print("Swapped list: ");
		printArray(list);
		System.out.print("Anonymous Array: ");
		printArray(new int[] {90, 80, 70, 60, 50});
		int[] reversedArray=reverse(list);
		System.out.print("Reversed array: ");
		printArray(reversedArray);
		
		//close input
		input.close();

	}
	
	//general method to print the contents of a passed integer array
	public static void printArray(int[] array) {
		//using for-each loop
		for (int iVal: array)
			System.out.print(iVal + " ");
		System.out.print("\n");
	}
	
	//method to change first two values in the passed array
	public static void swapFirstTwoElements(int[] array) {
		int temp=array[0];
		array[0]=array[1];
		array[1]=temp;
	}
	
	//method to return reversed array of passed array
	public static int[] reverse(int[] array) {
		int[] revArray=new int[array.length];
		//copy elements from passed array
		for (int i=0, j = array.length - 1; i < array.length; i++, j--)
			revArray[i]=array[j];
		return revArray;
	}
}
/**
Enter the number of items: 
3
Enter an integer: 
10
Enter an integer: 
20
Enter an integer: 
30
Element 10
Element 20
Element 30
The minimum number: 10 located at index 0
Copied Element 10
Copied Element 20
Copied Element 30
Original list: 10 20 30 
Copied list: 500 20 30 
Swapped list: 20 10 30 
Anonymous Array: 90 80 70 60 50 
Reversed array: 30 10 20 
**/
