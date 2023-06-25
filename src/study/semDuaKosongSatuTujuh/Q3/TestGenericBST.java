package study.semDuaKosongSatuTujuh.Q3;

import java.util.Stack;

public class TestGenericBST<E extends Comparable<E>> {
    
    public static void main(String[] args) {

        TestGenericBST<Integer> tree = new TestGenericBST<>();
        tree.add(tree.root, 50);
        tree.add(tree.root, 30);
        tree.add(tree.root, 20);
        tree.add(tree.root, 40);
        tree.add(tree.root, 70);
        tree.add(tree.root, 60);
        tree.add(tree.root, 80);
        
        tree.printTreeInOrder();
        
        System.out.println(tree.contains(50));
        System.out.println(tree.contains(30));
        System.out.println(tree.contains(20));
        System.out.println(tree.contains(40));
        System.out.println(tree.contains(70));
        System.out.println(tree.contains(60));
        System.out.println(tree.contains(80));
        
    }
    
    Node<E> root ;
    int size = 0 ;
    
    
    public boolean add(Node<E> node,E item){
        if(root == null){
            root = new Node<E>(item);
            return true;
        } else {
            return addNode(root,item);
            }
        }
    
    public boolean addNode(Node<E> currentNode, E item){
        if (item.compareTo(currentNode.getElement()) < 0){
            if (currentNode.getLeft() == null){
            currentNode.setLeft(new Node<>(item));
            return true;
            } else {
                return addNode(currentNode.getLeft(),item);
            }
        }else if (item.compareTo(currentNode.getElement()) > 0){
            if(currentNode.getRight()== null){
                currentNode.setRight(new Node<>(item));
                return true;
            } else {
                return addNode(currentNode.getRight(),item);
            }
        } else {
            return false;
        }
    }
    
    public void printTreeInOrder(){
        if (root == null){
            System.out.println("The tree is empty");
        }
        Node<E> current = root;
        Stack <Node <E>> stack = new Stack<>();
    
        while(current!=null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.getLeft();
            }
            
            current = stack.pop();
            System.out.println(current.getElement());
            
            current = current.getRight();
        }
    }
    
    public boolean contains(E item){
        Node<E> current = root ;
        while(current!=null){
            if(item.compareTo(current.element) < 0){
                current = current.left;
            }else if (item.compareTo(current.element) > 0){
                current = current.right;
            } else{
                return true;
            }
        }
        return false;
    }
}


class Node<E>{

    E element;
    Node<E> left;
    Node<E> right;
    
    public Node(E element){
        this.element = element; 
    }

    public E getElement() {
        return element;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
    
    
}
