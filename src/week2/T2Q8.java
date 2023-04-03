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
public class T2Q8 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
    
        numOfCars.add(1);
        
        
        milesPerHour.add(100.69);
        
        
        // calling method to dsiplay the array
        displayList(numOfCars);
        displayList(milesPerHour);
    }
    
    // declaring a generic method that accept an Arraylist parameter 
    public static void displayList(ArrayList<?> list) {
        // unbounded wildcard '<?>' used meaning this method can accept Arraylist of any type
    for (int i = 0 ; i<list.size() ; i++) { // for-each loop to iterate over the element of the ArrayList
        // Since we don't know the actual type of the ArrayList, we use the 'Object' type
        System.out.println(list);
    }
}

}
