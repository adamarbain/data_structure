package week7.tutorial;
import java.util.LinkedList;
import java.util.Scanner;
// implement queue using linked list

class Queue<T> {
    private LinkedList<T> list = new LinkedList<T>();
    public void enqueue(T item) { list.addLast(item); }
    public T dequeue() { return list.poll(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
/**
 * Q1
 *  - Supermarket Checkout Line
 *  - Print Queue: In an office setting, when multiple users send print requests to a shared printer
 *  - Call Center: When multiple callers call a call center, they are put in a queue and are served one by one
 *  - Restaurant: When multiple customers arrive at a restaurant, they are put in a queue and are served one by one
 *  - Bank: When multiple customers arrive at a bank, they are put in a queue and are served one by one
 * 
 * Q2
 * STACk:-
 * - LIFO (Last In First Out)
 * - Push and Pop
 * - Example: Stack of plates
 * 
 * QUEUE:-
 * - FIFO (First In First Out)
 * - Enqueue and Dequeue
 * - Example: Queue of people
 *
 * Q3
 * (a) 1 4 5 2 3
 * (b) true false true false true
 * (c) true true true true true
 *     true true true true false
 *     true false false false false
 * 
 * Q4
    a) X.front(): 5
    b) Y = X.dequeue(); 
    X.enqueue(new Integer(10)); 
    X.front(): 7
    c) Y = X.dequeue(): 7
    d) X.front(): 9

    * Q5
    - peek(): return the first element in the queue
    - isEmpty(): check if the queue is empty
    - isFull(): check if the queue is full
    - toString(): return the string representation of the queue
    - clear(): clear the queue

 */

public class anwser {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
    Scanner keyIn = new Scanner(System.in);
    for (int i = 1; i <= 5; i++)
    {
        if (keyIn.nextBoolean())
            System.out.print(i + " ");
        else
            q.enqueue(i);
    }
    while (!q.isEmpty())
        System.out.print(q.dequeue() + " ");
    System.out.println();
    keyIn.close();
    }
}


