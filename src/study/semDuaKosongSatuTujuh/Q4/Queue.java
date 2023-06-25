package study.semDuaKosongSatuTujuh.Q4;

import java.util.LinkedList;

public class Queue<E> {
    
    LinkedList<E> queue = new LinkedList<>();
    
    public Queue(){
    }
    
    public Queue(E[] items){
        for (E item : items)
            queue.add(item);
    }
    
    public void enqueue(E e){
        queue.addLast(e);
    }
    
    public E dequeue(){
        return queue.removeFirst();
    }
    
    public E getElement(int i){
        return queue.get(i);
    }
    
    public int getSize(){
        return queue.size();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public String toString(){
        return  queue.toString();
    }
    
    public LinkedList getQueue(){
        return queue ;
    }
    
    
    
}
