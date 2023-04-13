/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author user
 */
public class Car extends Vehicle {
    public Car(double maxspeed){
        super(maxspeed);
    }

    public void accelerate() {
        currentSpeed += 10.0 ;
        if (currentSpeed > maxspeed){
            currentSpeed = maxspeed;
        }
    }
    
    public static void main(String[] args) {
        Car volvo = new Car (69.42);
        System.out.println("Max speed: " +volvo.getMaxSpeed());
        System.out.println("Current speed : " +volvo.getCurrentSpeed());
        volvo.pedalToTheMetal();
    }
}
