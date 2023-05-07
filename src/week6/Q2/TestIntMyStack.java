package week6.Q2;
import java.util.Scanner;

public class TestIntMyStack {
    MyStack<Integer> stack = new MyStack<>();

    // Prompt user to enter an integer value.
    // Push the values 1 through the user entered value onto the stack.
    // Print the size of the stack.
    // Display the contents of the stack by repeatedly calling pop() until the stack is empty.

    public static void main(String[] args) {
        TestIntMyStack test = new TestIntMyStack();
        test.run();
    }

    // 'run' method is used to run the program
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int value = sc.nextInt();
        for (int i = 1; i <= value; i++) {
            stack.push(i);
        }
        System.out.println("Size of stack: " + stack.getSize());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        sc.close();
    }
    

    /**
     * What is the output of the elements? What is the order, why?
     * 
     * The output of the elements is in reverse order. This is because the stack
     * is a LIFO data structure, meaning that the last element to be pushed onto
     * the stack is the first element to be popped off the stack.
     * 
     */


}
