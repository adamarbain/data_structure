/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class GenericStack<E> {

    E[] stack;
    int size;
    int top;

    public GenericStack(int capacity) {
        this.stack = (E[]) new Object[capacity];
        this.size = capacity;
        this.top = 0;
    }
    
    public boolean isEmpty(){
        return top==0;
    }
    
    public boolean isFull(){
        return top==size;
    }
    
    public E peek(){
        return stack[top-1];
    }
    
    public void push(E o){
        
        stack[top] = o;
        System.out.println("Push: " + o);
        top++;
    }
    
    public void pushMany(String o){
        E[] temp = (E[]) o.split(",");
        
        System.out.println("Push many into stack....");
        for(int i=0; i<temp.length; i++){
            stack[top] = temp[i];
            System.out.println("Push: " + temp[i]);
            top++;
        }
    }
    
    public E pop(){
        
        top--;
        E hold = stack[top];
        stack[top] = null;
        return hold;
    }
    
    public E popMiddle(){
        
        int index =top;
        E o = stack[index/2];
        
        if(top%2 ==0){
            o = null;
            System.out.println("Current count of stack iseven number, so no middle index..");
            return o;
        }
        else{
            for(int i = index/2; i<=top-1; i++){
                stack[i] = stack[i+1];
            }
            top--;
    }
        return o;
    }
    
    public void popAll(){
        
        System.out.println("There are " + top + " items in the stack. Pop all... ");
        while(!isEmpty()){
            E temp = pop();
            System.out.println("Removing " + temp);
        }
    }
    
    public void display(){
        
        System.out.println();
        System.out.println("There are " + top +" items in the stack. Dispiaying...: " );   
        
        for(int i=top-1; i>=0; i--){
            System.out.println(stack[i]);
        }
    }
    
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
        stack2.pushMany("3,4,5,6,7");
        stack2.display();
        stack2.popAll();
        stack2.display();
        
    }
}
