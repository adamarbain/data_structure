package week12LabTest.Q3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class q3 {
    public static void reverseFirstK(int k, int[] arr) {
        Queue<Integer> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();

        // Enqueue all customers to the queue
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }

        // Reverse the order of the first k customers using a stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while (!stack.empty()) {
            queue.add(stack.pop());
        }

        // Create a temporary queue to store the remaining elements in the original order
        Queue<Integer> tempQueue = new ArrayDeque<>();
        while (k < arr.length) {
            tempQueue.add(queue.remove());
            k++;
        }

        // Enqueue the remaining elements back to the queue
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.remove());
        }

        printQueue(queue);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 5;

        System.out.println("Sample Output 1 (k=" + k + "):");
        System.out.print("Original Queue: ");
        printArray(arr);
        System.out.print("Reversed Queue: ");
        reverseFirstK(k, arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printQueue(Queue<Integer> queue) {
        System.out.print("[");
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            System.out.print(queue.peek());
            queue.add(queue.remove());
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
