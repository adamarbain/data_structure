/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class MyArray {
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5}; // arrays of integer
        String[] stringArray ={"Jane", "Tom", "Bob"}; // arrays of string
        Character[] charArray =  {'a', 'b', 'c'}; // arrays of string
        
        // calling the method "listAll" to diplays the list of arrays
        MyArray.listAll(intArray);
        MyArray.<String>listAll(stringArray); // shall putting the <type> to call generic method
        MyArray.<Character>listAll(charArray);
        
        
    }
    
    // generic method called "listAll"
    public static <T> void listAll (T[] arrays){
        for (T array : arrays) { // for loop to access each of the element in the array
            String print = array.toString();
            System.out.print(print+ " ");
        }
        System.out.println("");
    }
}
