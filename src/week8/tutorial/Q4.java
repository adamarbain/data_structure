package week8.tutorial;

import java.util.*;
public class Q4 {
    
    public static void main(String... args ){
        PriorityQueueComparator pqc=new PriorityQueueComparator();
        PriorityQueue<String> pq=new PriorityQueue<String>(5,pqc);
        pq.add("Jason");
        pq.add("Ali");
        pq.add("Muhamad");
        for(String s:pq){
        System.out.println(s);
        }
        }

}

/**
 *  a)What is the purpose of the PriorityQueueComparator in the code?
 *  b)What is the output of the code?
 * 
 * a)The purpose of the PriorityQueueComparator is to compare the length of the string.
 * b)The output of the code is:
 * Ali
 * Jason
 * Muhamad
 * 
 *   
 *
 */


