/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class FindMax {
    
    public static void main(String[] args) {
        
    // creating three arrays named 'a' 'b' and 'c' 
    Integer [] a = {1,2,3};
    String [] b = {"red","green","blue"};
    Circle [] c = {new Circle(3.0),new Circle(2.9),new Circle(5.9)};
    
        System.out.println("Max of (a) : " +max(a));
        System.out.println("Max of (b) : " +max(b));
        System.out.println("Max of (c) : " +max(c));
    }
    
    // generic method named 'max' that accepts an array of type E
    public static <E extends Comparable<E>> E max(E[] list){ // E implements 'Comparable' interface
        /*
        Arrays.sort(list);
        return list[list.length - 1];
        */
        
        E max = list[0]; // initializing variabale max as the first element of array
        
        for(int i = 0 ; i<list.length ; i++){
            if( list[i].compareTo(max) > 0){
                max = list[i] ; // if the element "list[i]" greater than max value, it replaces the max value
            }
        }
    return max;
    }
    
    // Circle class implements 'Comparable' interface
    public static class Circle implements Comparable <Circle>{
        
        private double radius; // private variable named 'radius'

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        
        public int compareTo (Circle other){
            if( this.radius > other.getRadius()){
                return 1;
            }
            if( this.radius < other.getRadius()){
                return -1;
            }
            else
                return 0 ;
        }
        // compareTo method :-
        // returning 1 if int is greater than the other int 
        // returning 0 if int is equal to the other int
        // returning -1 if int is less than the other int 
        
        @Override
        public String toString() {
            return "" + radius ; //To change body of generated methods, choose Tools | Templates.
        }
        
            
    }
}
