/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01;

/**
 *
 * @author user
 */
public abstract class Vehicle {
    public double maxspeed ;
    protected double currentSpeed ;

    // constructor accepting a double used to initialize the maxSpeed instance variable
    public Vehicle(double maxspeed) {
        this.maxspeed = maxspeed;
    }
    // abstract method, accelerate, that accepts no parameters and returns nothing
    public abstract void accelerate();
    
    // method getCurrentSpeed that returns the value of currentSpeed
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    
    public double getMaxSpeed(){
        return maxspeed;
    }
    // method pedalToTheMetal, that repeatedly calls accelerate until the speed of the vehicle is equal to maxSpeed. pedalToTheMetal returns nothing
    public void pedalToTheMetal(){
        while (currentSpeed < maxspeed){
            accelerate();
            System.out.println("Current speed: " + currentSpeed);
        }
        System.out.println("Reached max speed: " +maxspeed);
    }
}
