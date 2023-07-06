
package study.semDuaKosongSatuSembilan.Q1;


public class GenericStack<E> {
    public static void main(String[] args) {
        
        GenericStack<String> stack1 = new GenericStack<String>(6);
        stack1.push("one");
        stack1.display();
        stack1.pushMany("two,three four,five,six seven");
        stack1.display();
        stack1.pop();
        stack1.pop();
        stack1.display();
        System.out.println("----------------------------");

        GenericStack<Integer> stack2 = new GenericStack<Integer>(5);
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }

    Node<E> head;
    int size;
    int capacity;
    
    public GenericStack(int capacity){
        this.capacity = capacity;
        this.size = 0 ;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public E peek(){
        return head.element;
    }

    public void push(E element){
        if(isFull()){
            System.out.println("Stack is Full.");
        }
        else{
            Node<E> newNode = new Node <>(element);
            newNode.next = head;
            head = newNode;
            size++;
            System.out.println("Push: "+element);
        }
        System.out.println();
    }

    public void pushMany(String elements){
        String[] array = elements.split(",");

        for (String object : array){
            push((E)object);
        }
    }

    public E pop (){
        if(size==0){
            System.out.println("Stack is empty.");
            return null;
        }
        else{
            E element = head.element;
            head = head.next;
            size--;
            System.out.println("Pop the top of stack.");
            return element;
        }
    }

    public void popAll(){
        Node<E> current = head;
        while(current!=null){
            pop();
            current = current.next;
        }
    }

    public void display(){
        if(size == 0){
            System.out.println("Stack is Empty");
        }
        else{
        System.out.println("There are "+size+" items in this stack. Displaying ...");
        Node<E> current = head;
        for(int i = 0 ; i < size ; i++){
            System.out.println(current.element);
            current = current.next;
        }
        System.out.println();
        }
    }
}

class Node<E>{

    E element;
    Node<E> next;
    
    public Node(){}
    
    public Node(E element){
        this.element = element;
    }
}
