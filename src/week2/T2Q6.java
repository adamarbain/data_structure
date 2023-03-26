/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class T2Q6 {
    
    public static void main(String[] args) {
        // creating object called sideShape consist String type and Integer type.
        Duo<String, Integer> sideShape = new Duo <> ("rectangle",101) ;
        // creating object called points consists of two Double types
        Duo<Double , Double> points = new Duo <> (3.432,865.32);
        
        // diplaying the input using accessor created in Duo generic class
        System.out.println("Shape : " +sideShape.getFirst());
        System.out.println("Side : " +sideShape.getSecond());
        System.out.println("first point : "+points.getFirst());
        System.out.println("second point : "+points.getSecond());
    }
}
