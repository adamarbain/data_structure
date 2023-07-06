/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds2019;

public class MyQueue<E> {
    
    E[] queue;
    int head;
    int capacity;

    public MyQueue(int capacity) {
        this.queue = (E[]) new Object[capacity];
        this.capacity = capacity;
        this.head = 0;
    }
    
    public boolean isEmpty(){
        return head == 0;
    }
    
    public boolean isFull(){
        return head == capacity;
    }
    
    public void peek(){
        if(isEmpty())
            System.out.println("Queue is empty.....");
        else
            System.out.println(queue[0]);
    }
    
    public void enqueue(E element){
        if(isFull())
            System.out.println("Queue is full");
        else{
            System.out.println("Enqueue: " + element);
            queue[head] = element;
            head++;
        }
    }
    
    public void enqueueMany(String element){
        E[] temp = (E[]) element.split(",");
        
        for(int i = 0;i<temp.length;i++){
            if(!isFull())
                enqueue(temp[i]);
            else{
                System.out.println("Queue is full");
                break;
            }
        }
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Nothing to deqeue, queue is empty.....");
        }else{
            E temp = queue[0];
            System.out.println("Dequeue: " + temp);
            for(int i = 0;i<head-1;i++){        //shift to the left
                queue[i] = queue[i+1];
            }
            
            queue[head-1] = null;           //since we shift, last element is duplicate, so set to null
            head--;                         //decrease head
        }
        
    }
    
    public void dequeueAll(){
        System.out.println("\nThere are " + head + " items in the queue. Removing......");
        int index = 0;
        
        while(!isEmpty()){
            E temp = queue[index];
            index++;
            System.out.println("Dequeue: " + temp);
            head--;
        }
    }
    
    public void display(){
        if(isEmpty())
            System.out.println("\nNothing to display, queue is empty....");
        else{
            System.out.println("\nThere are " + head + " items in the queue. Displaying......");
            for(int i = 0;i<queue.length;i++){
                System.out.println(queue[i]);
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        MyQueue<String> q = new MyQueue<>(6);
        q.enqueue("Hello");
        q.enqueueMany("all,who,wants,ice cream,or cookies");
        q.display();
        q.dequeue();
        q.dequeueAll();
        q.display();
        System.out.println("--------------------");
        MyQueue<Integer> q2 = new MyQueue<>(6);
        q2.enqueue(1000);
        q2.enqueue(2000);
        q2.enqueueMany("3000,4000 5000,6000,7000,8000 9000");
        q2.display();
        q2.dequeue();
        q2.dequeue();
        q2.enqueue(8000);
        q2.dequeueAll();
        q2.display();
        
    }
}
