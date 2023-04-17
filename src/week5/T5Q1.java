package week5;

public class T5Q1 {
    
    public class Node<E>{
        E element;
        Node<E> next ;
        Node<E> head = null;
        Node <E> tail = null;
        int size ;

        public Node(E element) {
            this.element = element;
        }

        public void addFirst(E e){
            Node<E> firstNode = new Node<E>(e); // initialize 'firstNode' with element'e' and current head
            head = firstNode;
            if(tail == null) // no node exist
                tail = firstNode; 
            size++; // increase size
        }
    

        /**
     * 
     * @param e as new element of node to be added the end of the list
     * 
     */
    public void addLast(E e){
        Node<E> lastNode = new Node<E>(e); // initialise 'lastNode' object with 'e' element and 'next' parameter = null
        if (tail == null)
            head = tail =lastNode; // makes 'lastNode' as first and last node in list
        else{
        tail.next = lastNode; // set 'next' field of tail as 'lastNode'
        tail = tail.next; //  set tail to the 'lastNode'
        }
        size++; // increasing size
    }
    
    // (a) Based on the above source code, explain what the lines of code do from line 10 – 21.
    // (b) What is the main purpose of the method xyz()?
    // adding new node contains element based on the index input
    // (c) Obviously, there are some bugs in the source code. Debug the code and make it concise and simpler.
    
    public E xyz(int index,E e)
    {
    Node<E> current=head;
    Node<E> temp;
    
    if(index<0) 
    return null;
    
    else if(index>=size-1) {
    this.addLast(e);
    return null;
    }
    // (a)
    else if(index==0) { // line 10 :- if index equal to zero, this option will be operated
    temp=head; // set the new head as 'temp'
    head.element=e; // element of new 'head' set as e
    return temp.element; // return the element of 'temp' node
    }
    else{ 
    for (int i = 1; i < index; i++) { // for loop to iterate until one node before the index location
    current=current.next; // current node set as the next node
    }
    temp=current.next; // set 'temp' node as 'next' field of current node 
    current.next.element=e; // set the element of 'current.next' = e
    return temp.element; // return the element og 'temp'
    } // line 21
    
}

//(c)
public E newxyz(int index,E e)
{
Node<E> current=head;
Node<E> temp;

    if(index<0) 
        return null;

    else if(index>=size-1) {
        temp = tail;
        temp.next = null;
    return temp.element;
    }

    else if(index==0) { 
        temp=head; 
        head.element=e; 
    return temp.element; 
    }

    else{ 
        for (int i = 1; i < index; i++) { 
        current=current.next; 
        }
    temp=current.next; 
    current.next.element=e; 
    return temp.element; 
    }    
}

}
}
