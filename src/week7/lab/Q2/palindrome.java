package week7.lab.Q2;
// Write a Java program that uses a Queue to determine if the input string is a palindrome
// or not.

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Is palindrome: " + isPalindrome(input));
        sc.close();
        
    }

    // 'isPalindrome()' method is used to determine whether a string is a palindrome
    public static boolean isPalindrome(String str) {
        MyQueue<Character> queue = new MyQueue<>();
        for (int i = 0; i < str.length(); i++) {
            queue.enqueue(str.charAt(i));
        }
        String reverse = "";
        while (!queue.isEmpty()) {
            reverse += queue.dequeue();
        }
        return str.equals(reverse);
    }

}
