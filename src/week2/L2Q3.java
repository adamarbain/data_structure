/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class L2Q3 {
 
    
    public static void main(String[] args) {
        
        // initiating objects from 'storePair' generic class
        storePair a = new storePair(6, 4);
        storePair b = new storePair(2, 2);
        storePair c = new storePair(6, 3);

        // using toString method to display the value of first and second
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
        System.out.println("c: " + c.toString());
        System.out.println("");
    
        // Compare a and b using compareTo
        int abCompareResult = a.compareTo(b);
        System.out.println("a.compareTo(b) = " + abCompareResult);

        // Compare a and c using compareTo
        int acCompareResult = a.compareTo(c);
        System.out.println("a.compareTo(c) = " + acCompareResult);

        // Compare b and c using compareTo
        int bcCompareResult = b.compareTo(c);
        System.out.println("b.compareTo(c) = " + bcCompareResult);

        // Compare a and b using equals
        boolean abEqualsResult = a.equals(b);
        System.out.println("a.equals(b) = " + abEqualsResult);

        // Compare a and c using equals
        boolean acEqualsResult = a.equals(c);
        System.out.println("a.equals(c) = " + acEqualsResult);

        // Compare b and c using equals
        boolean bcEqualsResult = b.equals(c);
        System.out.println("b.equals(c) = " + bcEqualsResult);
    }
}
