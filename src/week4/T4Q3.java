package week4;

public class T4Q3 {
    // (a) removeLast()

}

class LinkedList<E>{

    static class Node<E>{
        E element;
        Node<E> next;
    }
        // declaring head and tail and size of list
        Node<E> head ;
        Node<E> tail ;
        int size;

        /**
         * 
         * @return the removed last element of the list
         */
        public E removeLast(){
            // if the list is empty, it prints an error message 
            // to the console and returns null
            if(tail == null)
                System.out.println("No list detected");
                

            Node<E> temp = null; // intialize object 'temp' as null
            Node<E> pointer1 = head; // initialize object 'pointer1' as head of the list

            while(pointer1.next != null){ // loop to iterate through the list
                temp = pointer1; // set 'temp' to the previous node
                pointer1 = pointer1.next; // set 'pointer1' to next node of list
            }
            // once finished 'temp' = second last node of the list
            // 'pointer1' = last node of the list
            temp.next = null;
            tail = temp;
            size--;

            return pointer1.element;
            // return the last element @ removed element from the list
        }
}
