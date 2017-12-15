/*  
   Name:   Chris Battisto
   File:   SelectionSort.java
   Date:   2/18/15
   Class:  CIS2571-001
   Descr:
   This program demonstrates the use
   of the Selection Sort algorithm on
   an array of doubles.
*/

public class SelectionSort {

  public static void main(String[] args) {
    // create test array
    double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    System.out.println("Before sorting...");
    printArray(list);
    selectionSort(list);
    System.out.println("After sorting...");
    printArray(list);
  }

  // passing an array of doubles for output of elements
  public static void printArray(double[] dArray) {
    for (double dVal: dArray) {
      System.out.print(dVal + " ");
    }
    System.out.print("\n");
  }

  /** The method for sorting the numbers */
  public static void selectionSort(double[] list) {
    for (int i = 0; i < list.length - 1; i++) {
      // Find the minimum in the list[i..list.length-1]
      double currentMin = list[i];
      int currentMinIndex = i;

      for (int j = i + 1; j < list.length; j++) {
        if (currentMin > list[j]) {
          currentMin = list[j];
          currentMinIndex = j;
        }
      }

      // Swap list[i] with list[currentMinIndex] if necessary;
      if (currentMinIndex != i) {
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
}
