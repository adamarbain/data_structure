/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds2019;

class Node<E> {
    E element;
    int credit;
    Node<E> next;

    public Node(E element,int credit){
        this.element = element;
        this.credit = credit;
                
    }
}

public class LinkedList<E> {
    
    Node<E> head;
    Node<E> tail;
    int size;

    public LinkedList() {
    }
    
    public boolean isEmpty(){
        if( head == null || size == 0)
            return true;
        else
            return false;
    }
    
    public void add(E element,int credit){
        Node<E> newNode = new Node<E>(element,credit);
        
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
    
    public void addAfter(E previous, E after, int credit){
        Node<E> newNode = new Node<>(after,credit);
        Node<E> current = head;
        while(current!=null){
            if(current.element.equals(previous)){
                newNode.next=current.next;
                current.next=newNode;
                
                if(current == tail){
                    tail = newNode;
                }
                size++;
                return;
            }
            current = current.next;
        }
    }
    
    public E remove(E element, int credit){
        if (isEmpty()) {
            System.out.println("LinkedList is empty. Cannot remove from an empty list.");
            return null;
        }
        Node<E> current = head;
        Node<E> previous = null;

        while (current != null) {
            if (current.element.equals(element) && current.credit == credit) {
                if (previous == null) {
                    // Node to be removed is the head
                    head = current.next;
                } else {
                    previous.next = current.next;
                }

                size--;
                return current.element;
            }

            previous = current;
            current = current.next;
        }

        System.out.println("Element not found in the LinkedList.");
        return null;
    }
    
    public void display(){
        if(isEmpty())
            System.out.println("List is empty************");
        else{
            System.out.println("\nDisplaying the Linked List ********************\n");
            Node<E> current = tail;
            while(current!=null){
                System.out.println(current.element + " : " + current.credit );
                current = current.next;
            }
        }
    }
    
    public int totalCreditHours(){
        int sum = 0;
        if(isEmpty()){
            System.out.println("List is empty.....");
        }else{
            Node<E> current = head;
            while(current!=null){
                sum+= current.credit;
                current = current.next;
            }
        }
        System.out.print("\nTotal credit hours: " + sum + "\n");
        return sum;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.add("Computing Mathematics", 3);
        list.add("Network Architecture", 3);
        list.add("Final Year Project", 5);
        list.add("Data Structure", 5);
        list.display();
        list.totalCreditHours();
        list.addAfter("Final Year Project","Software Modelling", 4);
        list.addAfter("Software Modelling","Intelligent Robot", 3);
        list.addAfter("Computing Mathematics","Gamification", 4);
        list.totalCreditHours();
        list.remove("Software Modelling", 4);
        list.remove("Network Architecture", 3);
        list.display();
        list.totalCreditHours();
    }
}
