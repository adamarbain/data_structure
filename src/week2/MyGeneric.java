/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class MyGeneric <E>{ // generic class that accepts one parameter
    
    private E e ; // decalring a variable called e with type E

    public MyGeneric() {    // no argument constructor
    }

    // constructor that accepts one generic parameters
    public MyGeneric(E e) {   
        this.e = e;
    }

    // getter method for generic
    public E getE() {
        return e;
    }

    // setter method for generic
    public void setE(E e) {
        this.e = e;
    }
    
    
}
