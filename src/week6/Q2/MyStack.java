package week6.Q2;

import java.util.ArrayList;

//Create a generic stack called MyStack class using ArrayList. The MyStack generic class
// should implement the following methods :

public class MyStack<E> {

    private ArrayList<E> list = new ArrayList<>();


    //a. getSize()
    public int getSize() {
        return list.size();
    }

    //b. peek()
    public E peek() {
        return list.get(getSize() - 1);
    }

    //c. push(E o)
    public void push(E o) {
        list.add(o);
    }

    //d. pop()
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    //e. isEmpty()
    public boolean isEmpty() {
        return list.isEmpty();
    }

    //f. toString()
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    //g. search(E o)
    public int search(E o) {
        return list.indexOf(o);
    }

    //h. peek(int i)
    public E peek(int i) {
        return list.get(i);
    }

    //i. pop(int i)
    public E pop(int i) {
        E o = list.get(i);
        list.remove(i);
        return o;
    }

    //j. push(int i, E o)
    public void push(int i, E o) {
        list.add(i, o);
    }

    //k. empty()
    public void empty() {
        list.clear();
    }

    //l. size()
    public int size() {
        return list.size();
    }

    //m. get(int i)
    public E get(int i) {
        return list.get(i);
    }

    //n. remove(int i)
    public E remove(int i) {
        E o = list.get(i);
        list.remove(i);
        return o;
    }

    //o. set(int i, E o)
    public E set(int i, E o) {
        return list.set(i, o);
    }

    //p. add(E o)
    public void add(E o) {
        list.add(o);
    }

    //q. add(int i, E o)
    public void add(int i, E o) {
        list.add(i, o);
    }

    //r. contains(E o)
    public boolean contains(E o) {
        return list.contains(o);
    }

    //s. indexOf(E o)
    public int indexOf(E o) {
        return list.indexOf(o);
    }    
    
}
