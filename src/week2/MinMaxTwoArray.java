/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class MinMaxTwoArray {
    
    public static void main(String[] args) {
       
        // creating two-dimensional Integer array
        Integer [][] numbers = {{4, 5, 6},{1, 2, 3}};
        
        // displaying the output by calling 'max' and 'min' method
        System.out.println("Maximum value of the elements : " + max(numbers));
        System.out.println("Minimum value of the elements : " + min(numbers));
    }
    
    // generic method that accepts a two-dimensional array of elements of type E
    public static <E extends Comparable<E>> E min(E[][] list){ //E implement the Comparable interface
    
        E minimum = list [0][0]; // initializing the variable 'min' as the first element of the 'list' array
        
        // for loop to iterate each element of array 
        for (int i = 0 ; i < list.length ; i++){
            for(int j = 0 ; j < list[i].length ; j++){
                if( minimum.compareTo(list[i][j]) < 0){ // compareTo method to determine the minimum value
                    minimum = list[i][j];
                }
            }
        }
        return minimum;
        // returning the elements with the smallest value
    }
    
        // generic method that accepts a two-dimensional array of elements of type E
    public static <E extends Comparable<E>> E max(E[][] list){ //E implement the Comparable interface
    
        E maximum = list[0][0]; // initializing the variable 'max' as the first element of the 'list' array
        
        // for loop to iterate each element of array
        for (int i = 0 ; i < list.length ; i++){
            for(int j = 0 ; j < list[i].length ; j++){
                if( maximum.compareTo(list[i][j]) > 0){ // compareTo method to determine the maximum value
                    maximum = list[i][j];
                }
            }
        }
        return maximum;
        // returning the elements with the biggest value
    }
    
}
