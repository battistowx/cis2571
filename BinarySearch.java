/*  
   Name:   Chris Battisto
   File:   BinarySearch.java
   Date:   2/18/15
   Class:  CIS2571-001
   Descr:
   This program demonstrates the use
   of the Binary Search algorithm on
   an array of integers.
*/

public class BinarySearch {

  public static void main(String[] args) {
    // create test array
    int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    int i = binarySearch(list, 2);  // Returns 0
    int j = binarySearch(list, 11); // Returns 4
    int k = binarySearch(list, 12); // Returns -6
    int l = binarySearch(list, 1);  // Returns -1
    int m = binarySearch(list, 3);  // Returns -2
    System.out.println("i = " + i + " j = " + j + " k = " 
      + k + " l = " + l + " m = " + m);
  }

  /** Use binary search to find the key in the list */
  public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (high >= low) {
      int mid = (low + high) / 2;
      if (key < list[mid])
        high = mid - 1;
      else if (key == list[mid])
        return mid;
      else
        low = mid + 1;
    }

    return -low - 1; // Now high < low
  }
}
