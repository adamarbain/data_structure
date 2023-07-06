package study.semDuaKosongSatuSembilan.Q2;

public class GenericQueue<E> {
    
    public static void main(String[] args) {
        GenericQueue<String> q = new GenericQueue<String>(6);
        q.enqueue("Hello");
        q.enqueueMany("all,who,wants,ice cream,or cookies");
        q.display();
        q.dequeue();
        q.dequeueAll();
        q.display();
        System.out.println("------------------------------");
        
        GenericQueue<Integer> q2 = new GenericQueue<Integer>(6);
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
    
    Node<E> head;
    Node<E> tail ;
    int size ;
    int capacity;
    
    public GenericQueue(int capacity){
        this.capacity = capacity;
        this.size = 0 ;
    }
    
    public boolean isEmpty(){
        return size == 0 ;
    }
    
    public boolean isFull(){
        return size == capacity ;
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }
        else if (isFull()){
            System.out.println("Queue is Full.");
        }
        else{
            System.out.println("Peek: " + head.element);
        }
    }
    
    public void enqueue(E element){
        if(isFull()){
            System.out.println("Queue is full.");
        }
        else if(isEmpty()){
            Node<E> newNode = new Node<>(element);
            head = tail = newNode;
            size++;
            System.out.println("Enqueue: " + element);
        }
        else{
            Node<E> current = new Node<>(element);
            tail.next = current;
            tail = current ;
            size++;
            System.out.println("Enqueue: " + element);            
        }
    }
    
    public void enqueueMany(String elements){
        String[] array = elements.split(",");
        
        for(String index : array){
            enqueue((E)index);
        }
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Cannot Dequeue. Queue is empty");
        }
        else{
            Node<E> temp = head;
            head = head.next;
            size--;
            System.out.println("Dequeue: "+temp.element);
        }
    }
    
    public void dequeueAll(){
        System.out.println("There are "+size+" items in the queue.Removing them all ...");
        while(!isEmpty())
            dequeue();
        System.out.println();
    }
    
    public void display(){
            if(isEmpty()){
                System.out.println("Nothing to display");
            }
            else{
            System.out.println("There are "+size+" item in the queue. Displaying...");
            Node<E> current = head;
            while(current!=null){
                System.out.println(current.element);
                current = current.next;
            }
            System.out.println();
            }
        }
}

class Node<E>{
    
    E element;
    Node<E> next;
    
    public Node(){
    }
    
    public Node(E element){
        this.element = element;
    }
}
