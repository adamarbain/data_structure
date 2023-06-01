/**
 * Create a recursive function that accepts a String parameter, and substitute any of the
lowercase “a” (no applicable for uppercase "A") found with “i” char. Example:
substituteAI ("flabbergasted ") → "flibbergisted "
substituteAI ("Astronaut ") → " Astroniut"
 */
package week10.tutorial.lab;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted "));
        System.out.println(substituteAI("Astronaut "));
    }

    public static String substituteAI(String s) {
        if (s.length() == 0) {
            return s;
        } else {
            if (s.charAt(0) == 'a') {
                return "i" + substituteAI(s.substring(1));
            } else {
                return s.charAt(0) + substituteAI(s.substring(1));
            }
        }
    }
    
}
