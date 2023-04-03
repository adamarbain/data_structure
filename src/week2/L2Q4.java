/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class L2Q4 {

    public static void main(String[] args) {
        
        // creating two arrays named intArray and strArray
        Integer [] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        // invoke 'minmax' method to each array
        String intResult = minmax(intArray);
        String strResult = minmax(strArray);

        System.out.println(intResult); 
        System.out.println(strResult); 
    }
    
    // method named 'minmax' have an array of generic type as its parameter 
    public static <T extends Comparable<T>> String minmax(T[] values) { // takes array of generic type 'T'
        
        if (values.length == 0){
            return "";
        }
        
        // 'Comparable' interface extends allowing to compare values 
        T min = values[0]; // declaring min variable with type T as the first elements of 'values' array
        T max = values[0]; // declaring max variable with type T as the first elements of 'values' array
        
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(min) < 0) {
                min = values[i];
            }
            if (values[i].compareTo(max) > 0) {
                max = values[i];
            }
        // compareTo method :-
        // returning 1 if string is greater than the other string (more characters)
        // returning 0 if string is equal to the other string
        // returning -1 if string is less than the other string (less characters)
        }
        return "Min = " + min + " Max = " + max;
    }
    
}
