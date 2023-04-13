/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.io.*;
import java.util.*;
/**
 *
 * @author user
 */
public class L1Q2 {
    
    public static void main(String[] args) {
        
        try{
            Scanner scan1 = new Scanner (new FileInputStream("text1.txt")); //searching text file to be read
            int count1 = 0; // initialising characters count as zero
           while(scan1.hasNextLine()){ // as long as the file has line, loop continues
               String [] array = scan1.nextLine().split(","); // seperating each character into a array based on ","
               for(int i = 0 ; i<array.length ; i++){ // for loop to print the aaray
                   String print = array[i];
                   System.out.print(print);
                   count1++; // increases as the number of array created increasing
               }
               System.out.println("");
           }
           scan1.close();
           System.out.println("Number of characters in text1 : "+count1);
           
           Scanner scan2 = new Scanner (new FileInputStream("text2.txt"));
           int count2 = 0;
           while(scan2.hasNextLine()){
               String [] array = scan2.nextLine().split(",");
               for(int i = 0 ; i<array.length ; i++){
                   String print = array[i];
                   System.out.print(print);
                   count2++;
               }
               System.out.println("");
           }
           scan2.close();
           System.out.println("Number of characters in text2 : "+count2);
           
           Scanner scan3 = new Scanner (new FileInputStream("text3.txt"));
           int count3 = 0;
           while(scan3.hasNextLine()){
               String [] array = scan3.nextLine().split(";");
               for(int i = 0 ; i<array.length ; i++){
                   String print = array[i];
                   System.out.print(print);
                   count3++;
               }
               System.out.println("");
           }
           scan3.close();
           System.out.println("Number of characters in text3 : "+count3);
           
           Scanner scan4 = new Scanner (new FileInputStream("text4.txt"));
           int count4 = 0;
           while(scan4.hasNextLine()){
               String [] array = scan4.nextLine().split("[^a-zA-Z]+");
               for(int i = 0 ; i<array.length ; i++){
                   String print = array[i];
                   System.out.print(print+ " ");
                   count4++;
               }
               System.out.println("");
           }
           scan4.close();
           System.out.println("Number of characters in text4 : "+count4);
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
    }
    
}
