package week11;

import java.util.*;

public class q3 {

    public static int[] findMaxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Process the first window
        for (int i = 0; i < k; i++) {
            maxHeap.offer(arr[i]);
        }
        result[0] = maxHeap.peek();

        // Process the remaining windows
        for (int i = k; i < n; i++) {
            maxHeap.remove(arr[i - k]); // Remove the element going out of the window
            maxHeap.offer(arr[i]); // Add the new element
            result[i - k + 1] = maxHeap.peek(); // Store the maximum in the current window
        }

        return result;
    }

    public static int[] findMaxSlidingWindow1(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Process the first window
        for (int i = 0; i < k; i++) {
            maxHeap.offer(arr[i]);
        }
        result[0] = maxHeap.peek();
        System.out.println("max(" + arr[0] + ", " + arr[1] + ", " + arr[2] + ") = " + result[0]);

        // Process the remaining windows
        for (int i = k; i < n; i++) {
            maxHeap.remove(arr[i - k]); // Remove the element going out of the window
            maxHeap.offer(arr[i]); // Add the new element
            result[i - k + 1] = maxHeap.peek(); // Store the maximum in the current window
            System.out.println("max(" + arr[i - k + 1] + ", " + arr[i - k + 2] + ", " + arr[i - k + 3] + ") = " + result[i - k + 1]);
        }

        return result;
    }
   
    
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 8, 9, 0, 1};
        int k1 = 3;
        System.out.println("Input arr[]: " + Arrays.toString(arr1) +", k = " + k1);
        int[] result1 = findMaxSlidingWindow(arr1, k1);
        System.out.println("Ouput: "+Arrays.toString(result1));
        System.out.println("Explanation: The window size is "+k1+" and the maximum at different iterations are as follows:");
        findMaxSlidingWindow1(arr1, k1);
        System.out.println("Hence, we got arr = "+Arrays.toString(result1)+" as the output.");
    }
    
}
