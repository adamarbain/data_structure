package week5;


public class TesterLabQ3 {
    
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        
        // (1) Add 1, 10, 100 to the front of the list
        for (int i = 1; i <= 100; i*=10) {
            dll.addLast(i);
        }

        // (3) add node with value 2 at index 2
        dll.add(2, 2);
        
        // (4) remove node at index 3
        dll.remove(3);

        // (5) traverse fowrard
        dll.iterateForward();

        // (6) traverse backward
        dll.iterateBackward();

        // (7) print current size of linked list
        dll.getSize();

        // (8) clear all the nodes in the linked list
        dll.clear();

        // (9) print again current size of linked list
        dll.getSize();
        
    }    

}

class DoublyLinkedList<E> {
    
    public class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;
        
        public Node(E element) {
            this.element = element;
            next = null;
            prev = null;
        }

        public Node (E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<E>(element, head, null);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
        System.out.println("adding: " + element);   
    }

    public void addLast(E element) {
        Node<E> newNode = new Node<E>(element, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
        System.out.println("adding: " + element);   
    }

    public void add(int index,E e){
        if(index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
    
        if(index == 0){
            addFirst(e);
        }
        else if(index == size){
            addLast(e);
        }
        else{
            Node<E> temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            Node<E> newNode = new Node<E>(e, temp, temp.prev);
            temp.prev.next = newNode;
            temp.prev = newNode;
            size++;
            System.out.println("adding: " + e + " at index " + index);   
        }
    }

    public void iterateForward(){
        System.out.println("\niterating forward..");
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
    }

    public void iterateBackward(){
        System.out.println("\niterating backword..");
        Node<E> temp = tail;
        while(temp != null){
            System.out.print(temp.element + " ");
            temp = temp.prev;
        }
    }

    public E removeFirst(){
        if(size == 0) throw new RuntimeException("Doubly linked list is empty");
        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }

    public E removeLast(){
        if(size == 0) throw new RuntimeException("Doubly linked list is empty");
        Node<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }

    public E remove(int index){
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        if(index == 0){
            return removeFirst();
        }
        else if(index == size-1){
            return removeLast();
        }
        else{
            Node<E> temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next = null;
            temp.prev = null;
            size--;
            System.out.println("deleted: " + temp.element + " at index " + index);
            return temp.element;
        }
    }

    public void clear(){
        int oldSize = size;
        Node<E> temp = head;
        while(head != null){
            temp = head.next;
            head.prev = head.next = null;
            head = temp;
        }
        temp = null;
        tail.prev = tail.next = null;
        size = 0;
        System.out.println("successfully clear " + oldSize + " node(s)");
    }

    public void getSize(){
        System.out.println("\nSize of current Doubly Linked List: " + size);
    }
    
    
}
