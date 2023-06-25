package study.semDuaKosongSatuEnam.Q3;

import java.util.*;

public class Queue<Item> {
    
    LinkedList<Item> list = new LinkedList<Item>();
    
    public Queue(){
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public int size(){
        return list.size();
    }
    
    public Item peek(){
        return list.peek();
    }
    
    public void enqueue(Item item){
        list.addLast(item);
    }
    
    public Item dequeue(){
        return list.removeFirst();
    }
    
    public String toString(){
        return "Queue: " + list.toString();
    }
}
