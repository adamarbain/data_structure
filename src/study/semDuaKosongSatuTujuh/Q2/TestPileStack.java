/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study.semDuaKosongSatuTujuh.Q2;

import java.util.Scanner;
/**
 *
 * @author user
 * @param <E>
 */
public class TestPileStack<E> extends GenericStack<E> {
    
    public static void main(String[] args) {
    
        GenericStack stack = new  GenericStack();
        
        stack.isEmpty();
        
        int k = 3 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("\nPush "+k+" books to the pile:");
        for(int i = 1 ; i<= k ; i++){
            System.out.print("Enter book title "+i+": ");
            String bookName = sc.nextLine();
            stack.push(bookName);
        }
        
        System.out.println("\n"+stack.toString()+"\n");
        
        stack.isEmpty();
        
        System.out.println("\nGet the top book and remove from the top book.\n");
        stack.pop();
        stack.pop();
        stack.pop();
        
        stack.isEmpty();
    }    
    
}
