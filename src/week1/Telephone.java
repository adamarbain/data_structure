/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author user
 */
public class Telephone {
    private String areaCode; // instance variable named areacode with String as its dataType
    private String number;
    private static int numberOfTelephoneObject = 0 ;

    public Telephone(String areaCode, String number) { //constructor consists of two parameters
        this.areaCode = areaCode;
        this.number = number;
    }
    // accessor
    public String getAreaCode() {
        return areaCode;
    }
    // mutator
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    // method to combine areacode with number
    public String makeFullNumber(){
        return areaCode + " - " + number;
    }
    
    public static int getNumberOfTelephoneObject(){
        return numberOfTelephoneObject;
    }
}
