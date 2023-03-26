/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
// generic class named "Duo" that has two parameters A and B
public class Duo <A,B>{
    
    private A first; // variable named first of type A
    private B second; // variable named second of type B

    // constructor that accepts these two parameters
    public Duo(A first, B second) {
        this.first = first;
        this.second = second;
    }
    
    // accessor for type A and type B
    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
    
    
}
