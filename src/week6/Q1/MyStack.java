package week6.Q1;

import java.util.ArrayList;

//Create a generic stack called MyStack class using ArrayList. The MyStack generic class
// should implement the following methods :

public class MyStack<E> {

    private ArrayList<E> list = new ArrayList<>();


    /**
     * @return size of the stack
     */
    //a. getSize()
    public int getSize() {
        return list.size();
    }

    /**
     * @return the top element in the stack
     */
    //b. peek()
    public E peek() {
        return list.get(getSize() - 1);
    }

    /**
     * 
     * @param o the element to be added into the stack
     */
    //c. push(E o)
    public void push(E o) {
        list.add(o);
    }

    /**
     * 
     * @return the top element in the stack and remove it from the stack
     */
    //d. pop()
    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    /**
     * 
     * @return true if the stack is empty
     */
    //e. isEmpty()
    public boolean isEmpty() {
        return list.isEmpty();
    }

    
    //f. toString()
    /**
     * @return the string representation of the stack
     */
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    /**
     * 
     * @param o the element to be searched
     * @return the index of the element in the stack
     */
    //g. search(E o)
    public int search(E o) {
        return list.indexOf(o);
    }

    /**
     * 
     * @param i the index of the element to be returned
     * @return the element at the specified index
     */
    //h. peek(int i)
    public E peek(int i) {
        return list.get(i);
    }

    /**
     * 
     * @param i the index of the element to be removed
     * @return the element at the specified index
     */
    //i. pop(int i)
    public E pop(int i) {
        E o = list.get(i);
        list.remove(i);
        return o;
    }

    /**
     * 
     * @param i the index of the element to be added
     * @param o the element to be added
     */
    //j. push(int i, E o)
    public void push(int i, E o) {
        list.add(i, o);
    }

    /**
     * 
     * @return true if the stack is empty
     */
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
