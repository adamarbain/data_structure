/**
 * Q4
 * A string is a palindrome if it spells the same way forwards and backwards. Write a
    Java program that uses a Stack to determine if a string is a palindrome or not. Let
    your string be of maximum size 15 characters. Note however that the actual size
    may be 15 or less.
 */

package week6.Q4;
import week6.Q2.MyStack;

public class LabQ4 {
    
    public static void main(String[] args) {
        
        // create five strings
        String[] str = {"bksjn", "abba", "racecar", "hello", "a"};
        // print each string and whether it is a palindrome
        for (int i = 0; i < 5; i++) {
            String a = str[i];
            System.out.println("String: " + a);
            System.out.println("Is palindrome: " + isPalindrome(a));
        }
    }
    
    // 'isPalindrome()' method is used to determine whether a string is a palindrome
    public static boolean isPalindrome(String str) {
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }
        return str.equals(reverse);
    }
}
