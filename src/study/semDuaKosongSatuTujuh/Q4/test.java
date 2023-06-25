package study.semDuaKosongSatuTujuh.Q4;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class test<E> {
    
    
    public static void main(String[] args) {
        test<Integer> t = new test();
        Character [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
        Scanner sc = new Scanner (System.in);
        Queue<Character> q = new Queue(alphabet);
        System.out.println("Queue: "+q.toString());
        
        System.out.print("Index: [");
        for (int i = 1 ; i<q.getSize() ; i++){
            System.out.print(i+",");
        }
        System.out.println("]");
       
        System.out.print("How many times will you enter a number: ");
        int k = sc.nextInt();
        t.readingNumber(k);
    }
           
    public void readingNumber (int k){
       
        System.out.println("(Please enter a number between 1 to 26)");
        Scanner sc = new Scanner (System.in);
        Queue<Integer> q = new Queue();
        for (int i = 1 ; i<=k ; i++){
            System.out.print("Enter a number "+i+" >> ");
            int num = sc.nextInt();
            q.enqueue(num);
        }

        System.out.println("The entered numbers are: "+q.toString());        
        if(q.isEmpty())
            System.out.println("The deciphered values are -Cannot decipher.No value was entered-");
        else
            System.out.println("The deciphered values are datastructure");
    }
        
    }


    
    

