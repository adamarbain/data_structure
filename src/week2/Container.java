/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
// generic class that accepr one parameter, T
public class Container<T> {
    private T t ; // private variable t of type T

    // no argument constructor
    public Container() {
    }
    
    // method named "add" that return nothing and accepting generic t of type T
    public void add (T t){
        this.t=t;
    }
    
    // method that return the initially declared variable
    public T retrieve(){
        return t;
    }
}
