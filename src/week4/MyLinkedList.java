package week4;


public class MyLinkedList<E> {
    
    // declaring head and tail and size of list
    private Node<E> head;
    private Node<E> tail ;
    private int size ;
    
    /**
     * 
     * @return the size of the list
     */
    public int getSize() {
        return size;
    }

    public MyLinkedList(){
    }

    /**
     * 
     * @param e as new element of node to be added the beginning of the list
     */
    public void addFirst(E e){
        Node<E> firstNode = new Node<E>(e,null); // initialize 'firstNode' with element'e' and current head
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
        Node<E> lastNode = new Node<E>(e,null); // initialise 'lastNode' object with 'e' element and 'next' parameter = null
        if (tail == null)
            head = tail =lastNode; // makes 'lastNode' as first and last node in list
        else{
        tail.next = lastNode; // set 'next' field of tail as 'lastNode'
        tail = tail.next; //  set tail to the 'lastNode'
        }
        size++; // increasing size
    }

    /**
     * 
     * @param e as the element
     * @param index as the location of the new element added
     */
    public void add(E e, int index){
        if(index == 0)
            addFirst(e); // proceed with addFirst() since no node have been created
        else if (index == size)
            addLast(e); // proceedd with addLast() since index = size of the list
        else{
            Node<E> current = head;
            // for loop to transverse the list from head until specified 'index'
            for(int i = 1 ; i<index ; i++) 
                current = current.next;
            Node<E> temp = current.next;   // hold reference current.next
            current.next = new Node<>(e,null); // current.next poiint to the new code
            (current.next).next = temp; // get reference from temp
            size++;    
        }
    }

    /**
     * @return the removed first node of the list
     */
    public E removeFirst(){
        if (size == 0)
            return null; // no list have been created
        else{
            E element = head.element; // declare element as the head
            head = head.next; // set the new head as second node
            if (head == null)
                tail = null;
            size--; // reduce size
            return element; // return the deleted element
        }
    }

    /**
     * 
     * @return the last node removed from the list
     */
    public E removeLast(){
        if (size == 0)
        return null;
        else if (size == 1){ // contains 1 node only
            Node<E> temp = head;
            head = null;
            tail = null; // reset the list
            size--;
            return temp.element; // return the deleted element
        }
        else{
            Node<E> current = head;
            for(int i = 0 ; i < size -2 ; i++) // iterate until second last node
                current = current.next;
            Node<E> temp = tail; // copy tail into temp before delete
            tail = current;
            tail.next = null; // set tail.next equal null
            size--;
            return temp.element; // return the deleted element
        }
    }

    /**
     * 
     * @param index as the location of the node that we want to delete 
     * @return the deleted element of the node
     */
    public E remove (int index){
        if ( index < 0 || index >= size)
            return null; // try to delete index of node that not in range
        else if (index == 0) // delete the first node
            return removeFirst();
        else if (index == size - 1) // delete the last node
            return removeLast();
        else{
            Node<E> previousNode = head; 
            for (int i = 1; i< index; i++) // iterate until one index before actual index
                previousNode = previousNode.next;
            Node<E> currentNode = previousNode.next; // copy previous.next to cuurentNode
            previousNode.next = currentNode.next; // set new point from previousNode.next into currentNode.next
            size--; // reduce size
            return currentNode.element; // return deleted element
            }
    }

    /**
     * 
     * @param e as the element that we want to compare in the list
     * @return true if the list contains the element
     * @return false if the list does not contain the element 
     */
    public boolean contains(E e){
        Node<E> current = head; // set current as head

            for(int i = 0 ; i< size ; i++){ // iterate until the end of the list
                if (e.equals(current)) // compare the element with current node
                    return true;
                current = current.next; // set current to next node
                }
            return false; // return false if the element is not found
    }
    
    /**
     * 
     * @param index as the location of the node that we want to get
     * @return the element of the node
     */
    public E get (int index){
        if (index < 0 || index >= size) // check if index is in range
            return null;
        Node<E> node = head; // set node as head
        for (int i = 0 ; i <index ; i++ ){ // iterate until the index
            node = node.next;
        }
        return node.element; // return the element of the node
    }

    /**
     * 
     * @return the first element of the list
     */
    public E getFirst(){
        if(head == null) // check if list is empty
            return null; 
        else
            return head.element; // return the element of the head
    }

    /**
     * 
     * @return the last element of the list
     */
    public E getLast(){
        if(tail == null) // check if list is empty
            return null;
        else
            return tail.element; // return the element of the tail 
    }

    /**
     * 
     * @param e as the element that we want to find in the list
     * @returnthe index of the head matching element in this list
     */
    public int indexOf(E e){
        int ans = 0; // set ans as 0
        Node<E> node = head; // set node as head
        while(node != null){
            if (node.element.equals(e)) // compare the element with current node
                return ans; // return the index of the node
            node = node.next; 
            ans++; // increase ans by 1
        }
        return -1; // return -1 if the element is not found
    }
    
    /**
     * 
     * @param e as the element that we want to find in the list
     * @return the index of the last matching element in this list
     */
    public int lastIndexOf (E e){
        Node<E> node = head; // set node as head
        int index = -1 ; // set index as -1
        int currentIndex = 0; // set currentIndex as 0
        while(node != null){ // iterate until the end of the list
            if (node.element.equals(e)) // compare the element with current node
                index = currentIndex;  // set index as currentIndex
            node = node.next;
            currentIndex++; // increase currentIndex by 1
            }
            return index; // return the index of the last matching element
    }

    /**
     * 
     * @param e as the element that we want to add into the list
     * @param index as the location of the node that we want to add
     * @return the element if it is added successfully
     */
    public E set (E e,int index){
        if (index < 0 || index >= size ) // check if index is in range
            return null;
        Node<E> node = head ;
        for(int i = 0 ; i < index ; i++) // iterate until the index
            node = node.next;
        E setNode = node.element; // copy the element of the node into setNode
        node.element = e; // set the element of the node as e
        return setNode; // return the element of the node
        }

    /**
      Clear the list
    */
    public void clear(){
        for(Node<E> slow = head ; slow!= null;){ // iterate until the end of the list
            Node<E> fast = slow.next; // set fast as slow.next
            slow.next = null; // set slow.next as null
            slow.element = null;    // set slow.element as null
            slow = fast;
        }
        size = 0 ; // set size as 0
        head = tail = null ; // set head and tail as null
        }
    
    /**
     * Print all the elements in the list
     */
    public void print(){
        if (head == null && tail== null) // check if list is empty
            System.out.println("[]");
        else{
            Node<E> node = head;
            System.out.print("[");
            for(int i = 0; i < size; i++){ // iterate until the end of the list
                System.out.print(node.element + ((i == size - 1) ? "" : ", "));
                node = node.next;
            }
            System.out.println("]"); 
        }
    }
    
    /**
     * Print all elements in reverse order
     */
    public void reverse(){
        // reverse() method is to reverse the list
        /**
         * Node<E> current = head;
         * for (int i = size - 1; i >= 0; i--) {
         *      
         */
        Node<E> current = head;
        Node<E> previous = null;
        Node<E> next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        print();
    }

    /**
     * 
     * @return the middle element of the list
     */
    public E getMiddleValue(){
        if (head == null)  // check if list is empty
            return null;
        Node<E> one = head; 
        Node<E> two = head;
        while( one!= null && two.next != null ){ // iterate until the end of the list
            one = one.next;
            two = (two.next).next; 
        }
        return one.element; // return the element of the middle node
    }
}
