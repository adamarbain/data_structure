package week12.lab;

/**
 * Given the following array,
arr = {45, 7, 2, 8, 19, 3}
Q1-Implement selection sort according to the search strategy shown above.
The method signature is given as:
public void selectionSortSmallest(int[] arr)
 */

 /**
  * Q2-Modify your answer in Q1 so that it uses the largest value in the list in
Step1 and 3 of the search strategy. The method signature is given as
public void selectionSortLargest(int[] arr
  */

  /**
   * QQ4- Suppose you have an integer array of eight elements
(10,34,2,56,7,67,88,42). Your task is to sort this array in ascending order
using the insertion sort algorithm.
   */

public class Lab {
    public static void main(String[] args) {
        int[] arr = { 45, 7, 2, 8, 19, 3 };
        Lab lab = new Lab();
        lab.selectionSortSmallest(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println();

        lab.selectionSortLargest(arr);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println();

        int[] arr2 = { 10, 34, 2, 56, 7, 67, 88, 42 };
        lab.insertionSort(arr2);
        for (int i : arr2) {
            System.out.println(i);
        }

    }

    public void selectionSortSmallest(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the smallest element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found smallest element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public void selectionSortLargest(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the largest element in unsorted array
            int max_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] > arr[max_idx])
                    max_idx = j;

            // Swap the found largest element with the first element
            int temp = arr[max_idx];
            arr[max_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // 34
            int j = i - 1; // 0
            /*
             * Move elements of arr[0..i-1], that are greater than key, to one position ahead
             * of their current position
             */
            while (j >= 0 && arr[j] > key) { // 10 > 34
                arr[j + 1] = arr[j]; // 34
                j = j - 1; // -1
            }
            arr[j + 1] = key; // 34
        }
    }
    
}