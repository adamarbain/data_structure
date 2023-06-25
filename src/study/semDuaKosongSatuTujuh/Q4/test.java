/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package study.semDuaKosongSatuTujuh.Q4;

/**
 *
 * @author user
 */
public class test<E> {
    
    public static void main(String[] args) {
        
        Character [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
        
        Queue<Character> q = new Queue(alphabet);
        System.out.println(q.toString());
        
        System.out.print("Index: [");
        for (int i = 1 ; i<q.getSize() ; i++){
            System.out.print(i+",");
        }
        System.out.println("]");
    }
}
