/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds2019;

/**
 *
 * @author user
 */
public class Node<E> {
    E element;
    int credit;
    Node<E> next;

    public Node(E element,int credit){
        this.element = element;
        this.credit = credit;
                
    }
}
