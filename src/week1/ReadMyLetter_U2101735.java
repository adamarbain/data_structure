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
public class ReadMyLetter_U2101735 {
    
    
    public static void main(String[] args) {
        try{
            Scanner scan = new Scanner (new FileInputStream ("Adam_U2101735.txt"));
            //searching text file to be read
            while (scan.hasNextLine()){ // as long as the file has text, loop will continue
                 String print = scan.nextLine(); // initialising a string from the text readed
                 System.out.println(print); // printing the text into the output console
             }
        scan.close(); // closing the reader
            
        PrintWriter write = new PrintWriter (new FileOutputStream ("Adam_U2101735.txt",true)); // searching text file to be append
        Scanner input = new Scanner(System.in); // scanning input
            
        String a = "";
        while(true){ // creating a loop to continuously scanning input unless exception reached
        a = input.nextLine();
        if(a.equals("-1")) // when "-1" input detected, loop stop
            break;
        String newSentence = a ;
        write.println(newSentence); // inserting input entered by user to be written in the text file 
        }
        write.close(); // closing the writer
        input.close();
        }
    catch(FileNotFoundException e){
            System.out.println("file not found");
    }
    
    }
}
