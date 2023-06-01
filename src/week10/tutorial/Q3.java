/**
 * Write a recursive method to reverse a string.
String → gnirts
 */

package week10.tutorial;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(reverse("String"));
    }

    public static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        } else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
    
}
