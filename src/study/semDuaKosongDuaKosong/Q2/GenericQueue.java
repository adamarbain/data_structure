package study.semDuaKosongDuaKosong.Q2;

public class GenericQueue<E> {
    
    
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
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueueMany("30,40,50,60,70,80,90");
        q2.display();
        q2.changeOrder(5); 
        q2.display();
    }
    
    Node<E> head;
    Node<E> tail;
    int size;
    int maxSize;
    
    public GenericQueue(int maxSize){
        size = 0 ;
        this.maxSize = maxSize;
    }
    
    public boolean isEmpty(){
        return size == 0 ;
    }
    
    public boolean isFull(){
        return maxSize == size ;
    }
    
    public E peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        else{
            Node<E> newNode = head ;
            System.out.println("Peek : " + newNode.element);
            return newNode.element;
        }
    }
    
    public void enqueue(E element){
        Node<E> newNode = new Node(element);
        if(isFull())
            System.out.println("Queue is full.");
        else if (isEmpty()){
            head = tail = newNode;
            size++;
            System.out.println("Enqueue: " + element);            
        }
        else{
             tail.next = newNode;
            tail = newNode;
            System.out.println("Enqueue: " + element);
            size++;
        }
            
    }
    
    public void enqueueMany(String elementQueue){
        String [] elementArray = elementQueue.split(",");
        
        for (String object : elementArray){
            enqueue((E)object);
        }
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. Cannot dequeue");
        }
        else{
        System.out.println("Dequeue: " + head.element);
        head = head.next ;
        size--;
        }
    }
    
    public void dequeueAll(){
        System.out.println("There are "+size+" items in queue.Removing them all ...");
        while(!isEmpty())
            dequeue();
    }
    
    public void changeOrder(int k){
        if (k <= 0 || k > size) {
            System.out.println("Invalid value of k. Please provide a value between 1 and " + size + ".");
        } else {
            if (k == 1) {
                System.out.println("Change order not required. Element is already at the front.");
            } else {
                Node<E> previous = head;
                for (int i = 1; i < k - 1; i++) {
                    previous = previous.next;
                }
                Node<E> temp = previous.next;
                previous.next = temp.next;
                temp.next = head;
                head = temp;
                System.out.println("Changing order for queue order at position " + k);
            }
        }
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Nothing to display");
        }
        else{
        System.out.println("There are "+size+" items in the queue. Displaying...");
        Node<E> current = head;
        while(current!=null){
            System.out.print( current.element + " | ");
            current = current.next;
        }
        System.out.println();
        }
    }
    
    
}

class Node<E> {

    E element;
    Node<E> next;
    
    public Node(){}
    
    public Node(E element){
        this.element = element;
    }
}
