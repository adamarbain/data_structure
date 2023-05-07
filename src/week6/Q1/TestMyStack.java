package week6.Q1;

// Write a test program for Q1(a) called TestMyStack class. Create a stack of type
// Character from MyStack.

public class TestMyStack {

    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();

        // Push 3 characters into the stack
        stack.push('a');
        stack.push('b');
        stack.push('c');

        // Display the stack
        System.out.println(stack);

        // Check if element ‘b’ is in the stack.
        System.out.println("Is b in the stack? " + stack.search('b'));

        // Check if element ‘k’ is in the stack.
        System.out.println("Is k in the stack? " + stack.search('k'));

        // create a second stack of type integer.
        MyStack<Integer> stack2 = new MyStack<>();

        // Following the given order, add elements, 1 2 and 3 in the stack.
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);

        // Display the stack
        System.out.println(stack2);

        // Check if element ‘6’ is in the stack.
        System.out.println("Is 6 in the stack? " + stack2.search(6));


    }
}
