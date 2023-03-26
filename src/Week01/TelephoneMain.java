/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TelephoneMain {
    public static void main(String[] args) {
        Telephone [] tele = new Telephone[5]; // initialising an array named "tele" to store the telephone number
        Scanner input = new Scanner(System.in); 
        
        // a loop to read the areadCode and number then store it in the tele array
        for (int i = 0; i<tele.length ; i++){
            System.out.println("Enter the areacode : ");
            String areacode = input.nextLine();
            System.out.println("Enter the number : ");
            String number = input.nextLine();
            
            tele[i] = new Telephone(areacode,number); // storing the combined number into the tele array
        }
        // a loop to combine and printing the combined number at the output console
        for (Telephone telephone : tele){
            System.out.println(telephone.makeFullNumber());
        }
    }
    
}
