/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author user
 */
// 'storePair' class that implements 'Comparable' interfaces
public class storePair implements Comparable<storePair> {
    
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
    
    // method named 'equals' that will return boolean 
    @Override
    public boolean equals(Object obj) { 
        if (obj instanceof storePair) { // checking whether object is an instance of the specified type (class or subclass or interface)
            storePair other = (storePair) obj; // declaring first value from second object = other
            return this.first == other.first; // returning true if 'first' of both object is equal
        }
        return false;
    }
    
    // method named 'compareTo' that return integer 
    public int compareTo(storePair other){ // parameter is accepting the object
        return Integer.compare(this.first, other.first);
        // returning 1 if this.first > other.first
        // returning 0 if this.first = other.first
        // returning -1 if this.first < other.first
    }
    
    // method that return the value of first variable and second variable in String
    public String toString() {
        return "first = " + first + " second = " + second;
    }
}
