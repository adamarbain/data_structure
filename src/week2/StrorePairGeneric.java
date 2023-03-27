/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class StrorePairGeneric <Y,Z> {
    
    private Y first;
    private Z second;

    public StrorePairGeneric(Y first, Z second) {
        this.first = first;
        this.second = second;
    }

    public Y getY() {
        return first;
    }

    public Z getZ() {
        return second;
    }

    public void setPair(Y y, Z z){
        this.first = first ;
        this.second = second ;
    }
    
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
}
