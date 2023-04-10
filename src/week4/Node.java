package week4;

public class Node<E>{

    E element; // contains element
    Node<E> next; // reference to the next code


    public Node(){
        this(null,null);    }
    
    /** 
         @constructor takes two parameters: an element of type E 
         and a Node<E> object representing the next node in the list
        */
    public Node(E element,Node next) {
        this.element = element;
        this.next = next;
    }
    
}
