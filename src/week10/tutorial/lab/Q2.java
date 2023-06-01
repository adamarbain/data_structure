/**
 * Write a recursive method called permuteString() that will find and print all the possibilities to
arrange the letters of a given word. Example:
Input String : “ABC”
Output Permutation :
ABC
ACB
BAC
BCA
CAB
CBA
Tips:
1) Take out the first char from String and permute the remaining chars.
If String = “ABC”
First char = A and remaining chars permutations are BC and CB.
2) Insert first char in the available positions in the permutations.
BC -> ABC, BAC, BCA
CB -> ACB, CAB, CBA
3) Then write a recursive function call to return the permutations and then another function call to insert
the first characters to get the complete list of permutations.
 */
package week10.tutorial.lab;

public class Q2 {
    public static void main(String[] args) {
        permuteString("ABC");
    }

    public static void permuteString(String s) {
        permuteString("", s);
    }

    public static void permuteString(String prefix, String s) {
        if (s.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < s.length(); i++) {
                permuteString(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1));
            }
        }
    }
    
}
