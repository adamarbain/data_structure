/**
 * Assuming that an unknown number of positive integers are stored in a stack, S.
    Using only stack ADT operations write an algorithm/function to find the sum of
    every element in S.
 */


package week6.Q3;
import week6.Q2.MyStack;
import java.util.Random;

public class LabQ3 {
    
    
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        Random rand = new Random();
        int size = rand.nextInt(10) + 1;
        for (int i = 0; i < size; i++) {
            stack.push(rand.nextInt(100) + 1);
        }
        System.out.println("Sum of stack: " + sum(stack));
    }
    
    // TODO: complete the sum() method
    // Hint: use a while loop to pop all elements from the stack.
    public static int sum(MyStack<Integer> stack) {
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
