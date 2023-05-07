package week7.lab.Q2;
// Write a generic queue class called MyQueue using LinkedList.
import java.util.LinkedList;


public class MyQueue <E> extends LinkedList<E> {
    
    LinkedList<E> list = new LinkedList<E>();

    public MyQueue() {
        super();
    }

    public MyQueue(E e) {
        super();
        add(e);
    }
    
    public void enqueue(E e) {
        addLast(e);
    }
    
    public E dequeue() {
        return removeFirst();
    }

    /**
     * public E getElement(int i)
     * @return
     */
    public E getElement(int i) {
        return get(i);
    }

    
    public E peek() {
        return getFirst();
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int getSize() {
        return size();
    }
    
    @Override
    public String toString() {
        return "Queue: " + super.toString();
    }

    
    

}
