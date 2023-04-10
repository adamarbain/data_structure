package week4;

public class T4Q2 {

}
    /*
     public void operationX(E e) {
        pointerB.next = pointerB;
    
        for(int i++; i>size; int i) {
            System.out.println(current.element);
        if(current.element = e)
        }
        
        Node<E> pointerB = head;
        return false;
    }
     */

    // (a) contains()

     class LinkedList<E>{
        static class Node<E>{
            E element; // contains element
            Node<E> next; // reference to the next code
        }
        // declaring head and tail and size of list
        Node<E> head;
        Node<E> tail;
        int size;

        /**
         * 
         * @param method takes an element of type E as a parameter and 
         * @return true if the element is present in the list, or false otherwise.
         */
        public boolean contains(E element){
            Node<E> current = head;

            for(int i = 0 ; i< size ; i++){ // for loop to access eachof the node
                if (element.equals(current))
                    return true; // return true id element = current.element
                current = current.next; 
                }
            return false;   // return false if none of the element matched
        }
    }
            

    
