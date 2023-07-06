/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds2020;

class Node<E> {
    
    E element;
    int totalSold;
    Node<E> next;

    public Node(E element, int totalSold) {
        this.element = element;
        this.totalSold = totalSold * 1000000;
    }    
}

public class LL<E> {
    Node<E> head;
    Node<E> tail;
    int size=0;

    public LL() {
    }
    
    public boolean isEmpty(){
        if(size==0)
            return true;
        else
            return false;
    }
    
    public void createNode(E name, int total){
        Node<E> newNode = new Node<E>(name,total);
        
        if(size == 0)
            head = tail = newNode;
        else{
            Node<E> current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
            tail = newNode;
            
        }
        size++;
    }
    
    public void display(){
        if(isEmpty())
            System.out.println("List is empty************");
        else{
            System.out.println("\nDisplaying the Linked List ********************\n");
            Node<E> current = head;
            while(current!=null){
                System.out.println(current.element + ":" + current.totalSold + " sold");
                current = current.next;
            }
        }
    }
    
    public boolean removeDuplicate(){
        
        Node<E> current = head;
        
        while(current != null && current.next != null){
            if(current.element == current.next.element)
                current.next =current.next.next;
            else
                current = current.next;
        }
        return true;
    }
    
    public E removeNode(E element){
        Node<E> current = head;
        
        if(head == null || head.next == null){
            return null;
        }
        
        Node<E> previous = null;
        
        while(current.next!=null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return (E) head; 
    }
    
    public void addAfter(E searchTitle, E newTitle, int newQuantity) {
        Node<E> current = head;

        while (current != null) {
            if (current.element.equals(searchTitle)) {
                Node<E> newNode = new Node<>(newTitle, newQuantity);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }
    
    public static void main(String[] args) {
        LL myLL = new LL();
        myLL.createNode("Lord of The Rings", 500); 
        myLL.createNode("Tale of the Body Thief", 1); 
        myLL.createNode("Memnochthe Devil", 100); 
        myLL.createNode("White Crane", 100);
        myLL.createNode("Heart of a Samurai", 10); 
        myLL.display(); 
        myLL.removeDuplicate();
        myLL.addAfter("Memnoch the Devil", "White Crane", 10);
        myLL.addAfter("White Crane", "Memoirs of a Geisha", 90);
        //myLL.removeNode("Harry Potter");
        myLL.removeNode("Heart of a Samurai");
        myLL.display();
    }
    
}
