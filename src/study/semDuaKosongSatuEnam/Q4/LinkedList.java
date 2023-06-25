package study.semDuaKosongSatuEnam.Q4;

public class LinkedList<E> {
    
    public static void main(String[] args) {
        
        LinkedList s1 = new LinkedList();
        
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.addAfter(11,10);
        s1.addAfter(21,20);
        s1.addAfter(31,30);
        s1.addAfter(41,40);
        s1.addAfter(51,50);
        s1.traverse();
        s1.deleteFront();
        s1.deleteFront();
        s1.deleteAfter(40);
        s1.deleteAfter(40);
        s1.deleteAfter(31);
        s1.deleteAfter(40);
        s1.traverse();
    }
    
    Node<E> head;
    Node<E> tail;
    int size;
    
    public void add (E element){
        Node<E> newNode = new Node(element);
        if (tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Adding "+element);
    }
    
    public int getCurrentIndex (E currentElement){
    Node<E> temp = new Node(currentElement);
    Node<E> current = head;
    int index = 1 ;
    while(current != null){
        if(current.element == temp.element)
            return index; 
        current = current.next;
        index++;
        }
    return -1 ;
    }
    
    public void addAfter(E newElement,E currentElement){
    int index = getCurrentIndex(currentElement);
    if (index == 0)
        add(newElement);
    else{
        Node<E> current = head ;
        for (int i = 1 ; i < index ; i++)
            current = current.next;
        Node<E> temp = current.next;
        current.next = new Node<>(newElement);
        (current.next).next = temp;
        System.out.println("Adding "+newElement+" after "+currentElement);
        size++;
        }
    }
    
    public void deleteFront(){
    if (size == 0)
            System.out.println("\nNo List founded");
    else{
    Node<E> temp = head ;
    head = head.next;
    size--;
    System.out.println("\nDeleting front: "+temp.element);
    if (head == null)
        tail = null;
        }
    }
    
    public E deleteAfter (E prevElement){
        System.out.println("\nTesting deleteAfter:");
        int index = getCurrentIndex(prevElement);
        if (index < 0 || index > size){
            System.out.println("Element ("+prevElement+") not found ...");
            return null;
        }
        else{
        Node<E> previous = head ;
        for (int i = 1 ; i < index ; i++){
            previous = previous.next;
        }
        Node<E> current = previous.next;
        previous.next = current.next;
        size--;
        System.out.println("After "+prevElement+" is "+current.element+". Deleting "+current.element);
        return current.element;
        }
    }
    
    public void traverse(){
        System.out.println("\nShowing content of my linked list:");
        Node<E> current = head;
        for(int i = 1 ; i <= size ; i++ ){
            System.out.print(current.element+" ");
            current = current.next;
        }
        System.out.println();
    }
}

class Node<E>{
    
        E element;
        Node<E> next;
        
        public Node(){}
        
        public Node(E o){
            element = o ;
        }
        
    }
