/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ds2019;

public class MyStack<E> {

    E[] stack;
    int maxSize;    //hold maximum value
    int top = -1;   //hold current value

    public MyStack(int size) {
        this.stack = (E[]) new Object[size];
        this.top = -1;
        this.maxSize = size;
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top+1 == maxSize;
    }
    
    public E peek(){
        return stack[top];
    }
    
    public void push(E element){
        if(isFull())
            System.out.println("Stack is full. Cannot push more elements");
        else{
            top++;
            stack[top] = element;
            System.out.println("Push: " + element);
        }
    }
    
    public void pushMany(String element){
        E[] array = (E[]) element.split(",");
        
        for(int i =0;i<array.length;i++){
            push(array[i]);
        }
    }
    
    private void display() {
        if(isEmpty()){
            System.out.println("\nEmpty stack............");
            return;
        }
        
        System.out.println("\nThere are "+ (top+1)+ " items in the stack. Displaying........");
        for(int i = top;i>=0;i--){
            System.out.println(stack[i]);
        }
        System.out.println();
    }
    
    public E pop(){
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot perform pop operation.");
        }
        
        System.out.println("Removing top of stack......");
        E temp = stack[top];
        stack[top] = null;
        top--;
        return temp;
    }
    
    public void popAll(){
        System.out.println("\nRemoving all elements.....");
        
        if (isEmpty()) {
        System.out.println("Stack is empty. Nothing to remove.");
        return;
    }
        while (!isEmpty()) {
            System.out.println("Removing " + stack[top]);
            stack[top] = null;
            top--;
        }
    }
    
    
    public static void main(String[] args) {
        MyStack<String> stack1 = new MyStack<>(5);
        
        stack1.push("one");
        stack1.display();
        stack1.pushMany("two,three four,five,six seven");
        stack1.display();
        stack1.pop();
        stack1.pop();
        stack1.display();
        System.out.println("-----------------------------");
        MyStack<Integer> stack2 = new MyStack<>(5);
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        System.out.println(stack2.isFull());
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
}
