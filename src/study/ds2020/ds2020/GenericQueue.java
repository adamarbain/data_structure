/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds2020;

public class GenericQueue<E> {
    
    E[] queue;
    int capacity;
    int top;

    public GenericQueue(int capacity) {
        this.queue = (E[]) new Object[capacity];
        this.capacity = capacity;
        this.top = -1;
    }
    
    public boolean isEmpty(){
        return top== -1;
    }
    
    public boolean isFull(){
        if (top+1 >= capacity)
            return true;
        else
            return false;
    }
    
    public E peek(){
        return queue[top];
    }
    
    public void enqueue(E o){
        
        if(isFull()){
            System.out.println("Queue is Full!");
        }
        else{
            top++;
            queue[top] = o;
            System.out.println("Enqueue: " + o);
        }
    }
    
    public E dequeue(){
        
        if(isEmpty()){
            System.out.println("Queue is Empty!");
        }
        else{
            E hold = queue[0];
            for(int i=0; i<= top; i++){
                queue[i]=queue[i+1];
            }
            queue[top]= null;
            top--;
            System.out.println("Dequeue: " + hold);
            return hold;
        }
        return null;
    }
    
    public void changeOrder (int K){
        
        if(queue.length < K){
            System.out.println("Cannot change order");
        }
        else{
            System.out.println();
            System.out.println("Change queue order...");
            E[] temp = (E[]) new Object[K];
            for(int i = 0; i < K; i++){
                temp[i]= queue[i];
                queue[i] = queue[i+K-1];
            }
            for(int i = 0; i < temp.length-1; i++){
                queue[i+K] = temp[i];
            }
        }
    }
    
    public void enqueueMany(String o){
        E[] temp = (E[]) o.split(",");
        
        for(int i=0; i<temp.length; i++){
            top++;
            queue[top] = temp[i];
            System.out.println("Enqueue: " + temp[i]);
        }
    }
        
    public void dequeueAll(){
        System.out.println();
        System.out.println("There are " + (top+1) + " items in the queue. Removing them all...");
        while(!isEmpty()){
            dequeue();
        }
    }
    
    public void display(){
        
        if(!isEmpty()){
        System.out.println();
        System.out.println("There are " + (top+1) + " items in the queue. Displaying..." );
        
        for (int i=0; i <= top; i++){
            System.out.print(queue[i]+ "|");
        }
        System.out.println();
        }
        else if(isEmpty()){
            System.out.println();
            System.out.println("Nothing to display.");
    }

    }
    
    public static void main(String[] args) {
        GenericQueue<String> q = new GenericQueue<String>(10);
        q.enqueue("Dom T");
        q.enqueue("Rafa N");
        q.enqueueMany("Roger F,Danil M,Novak D,Alex Z,Stef T,Karen K"); 
        q.display();
        System.out.println();
        q.dequeue(); 
        q.enqueue("Matt B"); 
        q.enqueue("Kei N");
        q.display();
        q.dequeueAll(); 
        q.display();
        
        System.out.println("--------------------------------------");
        
        GenericQueue<Integer> q2 = new GenericQueue<Integer>(10); 
        q2. enqueue(10);
        q2.enqueue(20);
        q2.enqueueMany("30,40,50,60,70,80,90");
        q2.display();
        q2.changeOrder(5); 
        q2.display();
    }
}
