/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class CompareMax {
    
    // generic static method with the generic type extends comparable interface
    public static <Z extends Comparable<Z>> Z maximum (Z firstNum,Z secNum,Z thirdNum){ // receice three parameter
    
        Z maximum = firstNum ; // initialising first parameter value is the highest
        
        // comparing highest value to the second parameter value
        if (secNum.compareTo(maximum) > 0){
            maximum = secNum ;
        }
        
        // comparing highest value to the third parameter value
        if (thirdNum.compareTo(maximum) > 0){
            maximum = thirdNum ;
        }
        
        return maximum ; // returning the maximum value
    } 
    
    public static void main(String[] args) {
        
        int a = 10 ;
        int b = 11 ;
        int c = 12 ;
        
        // calling the method while declaring the maximum value between three parameter
        Integer max = maximum(a,b,c);
        System.out.println("Highest value : " +max);
        
        System.out.println("Highest char : "+CompareMax.<Character>maximum('a','b','c'));
    }
}
