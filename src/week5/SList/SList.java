package week5.SList;

public class SList<E> {
    
    SNode<E> head;
    SNode<E> tail;
    int size ;

    /**
     * 
     * @param e as the element to be added
     */
    public void appendEnd(E e){
        SNode<E> newNode = new SNode<>(e);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * 
     * @return the element of the initial node which is removed
     */
    public E removeInitial(){
        if(head == null){
            return null;
        }
        E element = head.element;
        head = head.next;
        size--;
        return element;
    }

    /**
     * 
     * @param e as the element to be compared to the elements in the list
     * @return true if the list contains the element e,
     *        false if the list does not contain the element e
     */
    public boolean contains(E e){
        SNode<E> current = head;
        while(current != null){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * Empty all elements in the list and return a statement that reports that the list is
        empty.
     */
    public void clear(){
        SNode<E> current = head;
        while(current != null){
            SNode<E> next = current.next;
            current.element = null;
            current.next = null;
            current = next;
        }
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Display all values from the list in a successive order
     */
    public void display(){
        SNode<E> current = head;
        while(current != null){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }


}
