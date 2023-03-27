/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
public class storePair {
    
    private int first, second;

    public storePair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
        }

    public int getSecond() {
        return second;

    }

    public void setPair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = " + first + " second = " + second;

    }
}
