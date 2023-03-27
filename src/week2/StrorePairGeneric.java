/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
// creating a generic class that have two parameter with Y and Z type
public class StrorePairGeneric <Y,Z> {
    
    // declaring two variables named first and second 
    private Y first;
    private Z second;

    // constructor that accepts two parameters  
    public StrorePairGeneric(Y first, Z second) {
        this.first = first;
        this.second = second;
    }

    // accessor
    public Y getY() {
        return first;
    }

    // mutator
    public Z getZ() {
        return second;
    }

    // a mehtod to set the value of the first and second variables
    public void setPair(Y y, Z z){
        this.first = first ;
        this.second = second ;
    }
    
    // method that return the value of first variable and second variable in String
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
}
