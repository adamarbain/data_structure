/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study.semDuaKosongSatuTujuh.Q2;

import java.util.ArrayList;
/**
 *
 * @author user
 */
public class GenericStack<E> implements StackInterface<E> {

    public GenericStack() {
        System.out.println("Create a new stack: an empty pile of books");
    }
    
    @Override
    public String toString() {
        return "The new books that you added are:" + list;
    }

    ArrayList<E> list = new ArrayList<>();
    
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E peek() {
        return list.get(0);
    }

    @Override
    public E pop() {
        System.out.println(list.get(0)+" is at the top of the pile.");
        System.out.println(list.get(0)+" is removed from the pile");
        System.out.println();
        return list.remove(0);
    }

    @Override
    public void push(E element) {
        list.add(list.size(), element);
    }

    @Override
    public Boolean isEmpty() {
        System.out.println("isEmpty() returns "+list.isEmpty());
        if(list.isEmpty())
            System.out.println("The pile should be empty");
        else
            System.out.println("The pile should not be empty");
        return list.isEmpty();
    }
    
}
