/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class L2Q1 {
    
    public static void main(String[] args) {
        
        // creating instances of generic class of type String
        MyGeneric <String> strObj = new MyGeneric<> ("Adam bin Arbain");
        // creating instances of genreic class of type integer
        MyGeneric <Integer> intObj = new MyGeneric<> (21);
    
        // display these values assigned earlier using getter method
        System.out.println(strObj.getE());
        System.out.println("Age : "+intObj.getE());
    }
    
}
