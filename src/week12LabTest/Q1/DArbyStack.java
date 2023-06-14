package week12LabTest.Q1;

public class DArbyStack<DArby> {

    private static class Node<E> {
    E item;
    Node<E> next;
    public Node(E item) {
    this.item = item;
        }
    }
    private Node<DArby> head = null;
    private int size = 0;
    
    public void push(DArby item) {
        Node<DArby> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    
    public DArby pop() {
        if (head == null) {
            return null;
        }
        DArby item = head.item;
        head = head.next;
        size--;
        return item;
    }
    
    public DArby peek() {
        if (head == null) {
            return null;
        }
        return head.item;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
        
    public int size() {
        return size;
    }
        
    public String toString() {
        String result = "[";
        Node<DArby> current = head;
        while (current != null) {
            result += current.item + " ";
            current = current.next;
        }
        result += "]";
        return result;
    
    }
        
    public DArby remove (int k){
        if (k < 0 || k >= size) {
            return null;
        }
        if (k == 0) {
            return pop();
        }
        Node<DArby> current = head;
        for (int i = 0; i < k - 1; i++) {
            current = current.next;
        }
        DArby item = current.next.item;
        current.next = current.next.next;
        size--;
        return item;
    }
   
}