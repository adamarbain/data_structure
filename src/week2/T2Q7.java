/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class T2Q7 {
    
    ArrayList<String> vehicle = new ArrayList<>();
    ArrayList<Object> transportation = new ArrayList<>();

    // generic method that return nothing, accepting two Arraylist parameters using wildcards
    public static void allTransportation(ArrayList<? extends Object> list1, ArrayList<?> list2) {
    
        /*
    
        The first ArrayList parameter, list1, uses an upper-bounded wildcard <? extends Object>, which means that it can accept an 
        ArrayList of any type that extends from the Object class, including Object itself.
    
        The second ArrayList parameter, list2, uses an unbounded wildcard <?>, which means that it can accept an ArrayList of any type, 
        but the actual type is unknown.
    
        With this method header, we can pass any two ArrayList objects as arguments, as long as they have compatible wildcard types. 
        Inside the method implementation, we can perform operations on the ArrayLists based on their common properties, such as 
        iterating over their elements, accessing their size, or invoking methods that are common to their element types.
        */
    }
}
