
package study.semDuaKosongDuaKosong.Q1;


public class GenericStack<E> {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>(7);
        
        stack1.push("Apple");
        stack1.display();
        
        stack1.pushMany("Broccoli,Chicken Sandwich,Donut,French Fries,Juice,Maruku");
        stack1.display();
        
        System.out.println("Pop top of the stack:" + stack1.pop());
        System.out.println("Pop top of the stack:" + stack1.pop());
        stack1.display();
        
        System.out.println("Pop middle of stack: " + stack1.popMiddle());
        stack1.display();
        
        System.out.println("Pop middle of stack: " + stack1.popMiddle());
        
        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.println(" ");
        
        GenericStack<Integer> stack2 = new GenericStack<>(10);
        
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
    
    Node<E> top;
    int size;
    int maxSize;
    
    public GenericStack(int maxSize){
        this.size = 0;
        this.maxSize = maxSize;
    }
    
    public boolean isEmpty(){
        return size == 0 ;
    }
    
    public boolean isFull(){
        return size == maxSize;
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top element is " + top.element);
        }
    }
    
    public void push(E element){
        if (isFull()){
            System.out.println("Stack is full");
        }
        else{
            Node<E> newNode = new Node<>(element);
            newNode.next = top;
            top = newNode;
            size++;
            System.out.println("Push: " + element);
        }
    }
    
    public void pushMany(String sample){
        System.out.println("Push many into stack...");
        String [] element = sample.split(",");
        
        for (int i = 0; i < element.length; i++){
            push((E)element[i]);
        }

    }
    
    public E pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            E element = top.element;
            top = top.next;
            size--;
            return element;
        }
    }
    
    public E popMiddle(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else if (size==1){
            return pop();
        }
        else if (size%2 == 0){
            System.out.println("Current count of stack is even nummber, so no middle index.");
            return null;
        }
        else{
            Node<E> temp = top;
            for (int i = 0; i < size/2 - 1; i++){
                temp = temp.next;
            }
            E element = temp.next.element;
            temp.next = temp.next.next;
            size--;
            return element;
        }
    }
    
    public void popAll(){
        while(!isEmpty()){
            pop();
        }
    }
    
    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty, nothing to display");
        }
        else{
        System.out.println("There are " + size + " items in the stack. Displaying...");
            Node<E> temp = top;
            while(temp != null){
                System.out.println(temp.element);
                temp = temp.next;
            }
            System.out.println();
        }
    }
    
    
}

class Node<E>{
    
    E element;
    Node<E> next ;
    
    public Node(){
    }
    
    public Node(E element){
        this.element = element;
    }
}
