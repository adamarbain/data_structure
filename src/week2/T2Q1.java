/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class T2Q1 {
    
    public static void main(String[] args) {
        // first container of type integer
        Container<Integer> intContainer = new Container<>(); // creating an object that can store type Integer
        intContainer.add(50);
        System.out.println("Integer object : " +intContainer.retrieve());
        
        // second container of type String
        Container<String> stringContainer = new Container<>(); // creating an object that can store type String
        stringContainer.add("Java");
        System.out.println("Sring object : " +stringContainer.retrieve());
    }
}
