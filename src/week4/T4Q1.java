package week4;

public class T4Q1 <E> {
    
    private Node<E> head ;
    private Node<E> tail ;
    private int size; 
            
    public class Node<E>{
    
        private E element; // contains element
        private Node<E> next; // reference to the next code

        /**   constructor takes an element of type E as a parameter 
         and assigns it to the element **/ 
        public Node(E element) {
            this.element = element;
        }

        /** 
         constructor takes two parameters: an element of type E 
         and a Node<E> object representing the next node in the list
        */
        Node(E element,Node<E> next){
            this.element = element;
            this.next = next;
        }
    }
    
    public T4Q1(){
        // declaring head and tail
        head = null;
        tail = null;
        size = 0;
    }
    

    public void addLast(E element){
        /**
        (e)1.If the linked list is empty: In this case, we simply 
        create a new node and set it as the head of the linked list.

        2.If the linked list is not empty: We need to traverse the list 
        to find the last node. We can do this by starting at the head node 
        and iterating through the list until we reach the last node. 
        Once we find the last node, we create a new node and set it as the next node of the last node.

        3.If the linked list has only one node: In this case, we can 
        simply call addFirst() or addLast() interchangeably, 
        as the end result will be the same.

        4.If the linked list has a fixed size: We need to check 
        if the linked list is already at its maximum capacity before adding a new node. 
        If the linked list is already at its maximum capacity, we can either throw an 
        exception or remove the first node before adding the new node.

        
        (f) 1. create a new node with the element
        2. set the 'next' field of the new node to null
        3. set the 'next' field of the tail to the new node
        4. set the tail to the new node
         **/
        
        Node<E> lastNode = new Node<>(element);
        if(head == null){
            head = lastNode;
            tail = lastNode;
        }else{
            tail.next = lastNode;
            tail = lastNode;
        }
        size++;
    }
    public void addFirst(E element){
        
        Node<E> firstNode;
        firstNode = new Node<E>(element);
        firstNode.next = head;
        head = firstNode;
        size++;

        /**
    (e) 1.if the linked list is empty, then head and tail should point to the firstNode
        2. if the linked list is not empty, declare previous Head as firstNode.next
        then make the firstNode as the new head
 
    (f) 1. create a new node with the element
        2. set the 'next' field of the new node to the head
        3. set the head to the new node
    **/
    }
    public void add(int index, E element){
        /** 
        (e) If the linked-list is empty: If the linked-list is empty,
        then you can simply add the new element as the head of the list.

        If the linked-list is not empty: If the linked-list is not empty, 
        then you need to consider where to add the new element. 
        You can add the element at the beginning of the list, 
        in the middle of the list, or at the end of the list.

        Adding the element at the beginning of the list: 
        To add the element at the beginning of the list, 
        you need to make the new element the head of the list, 
        and set its next pointer to the previous head of the list.

        Adding the element in the middle of the list: 
        To add the element in the middle of the list, 
        you need to traverse the list to find the node after 
        which you want to add the new element. 
        Then you can set the next pointer of the new element to the next node,
         and the next pointer of the previous node to the new element.

        Adding the element at the end of the list: 
        To add the element at the end of the list, 
        you need to traverse the list to find the last node, 
        and then set the next pointer of the last node to the new element.
        
        (f) 1.Create a new node with the element to be added.
            2.Check if the linked-list is empty.
            3.If the linked-list is empty, set the head to be the new node.
            4.If the linked-list is not empty:
                a. If the new node is to be added at the beginning of the list:
                    i. Set the next pointer of the new node to the current head of the list.
                    ii. Set the head to be the new node.
                b. If the new node is to be added in the middle of the list:
                i. Traverse the list to find the node after which the new node is to be added.
                    ii. Set the next pointer of the new node to the next node.
                    iii. Set the next pointer of the previous node to be the new node.
                c. If the new node is to be added at the end of the list:
                    i. Traverse the list to find the last node.
                    ii. Set the next pointer of the last node to be the new node.
            5.Increment the size of the linked-list by 1.
            6.Return the new size of the linked-list

        **/
        Node<E> newNode = new Node<>(element);
        Node<E> currentNode = head;
        Node<E> previousNode = null;
        int count = 0;
        while(count < index){
            previousNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        previousNode.next = newNode;
        newNode.next = currentNode;
        size++;
    }
    public void removeFirst(){
        
        /** 
        (e)If the linked-list is empty: If the linked-list is empty,
         you cannot perform the removeFirst() operation. 
         You should throw an exception or return null, depending on your implementation.

        If the linked-list is not empty: 
        If the linked-list is not empty, you can simply remove the 
        head of the list and update the head pointer to 
        point to the next node in the list.

        (f)Check if the linked-list is empty.
            If the linked-list is empty, throw an exception or return null (depending on your implementation).
            If the linked-list is not empty:
                a. Store the current head of the list in a temporary variable.
                b. Set the head to be the next node in the list.
                c. Decrement the size of the linked-list by 1.
                d. Return the element stored in the temporary variable.
        */
        if(head == null){
            System.out.println("The list is empty");
        }else{
            head = head.next;
            size--;
        }
    }
    public void removeLast(){
        
        /** 
        (e)If the linked-list is empty: If the linked-list is empty, 
        you cannot perform the removeLast() operation.
         You should throw an exception or return null, 
         depending on your implementation.

        If the linked-list has only one element: If the linked-list has only one element, 
        you can simply remove the head of the list and 
        set both the head and tail pointers to null.

        If the linked-list has more than one element: If the linked-list has more than one element,
         you need to traverse the list to find the second-to-last node.
          Then you can remove the last node by setting the next pointer 
          of the second-to-last node to null and updating the tail 
          pointer to point to the second-to-last node.

        (f) check if the linked-list is empty.
            If the linked-list is empty, throw an exception or return null (depending on your implementation).
            If the linked-list has only one element:
                a. Store the current head of the list in a temporary variable.
                b. Set both the head and tail pointers to null.
                c. Decrement the size of the linked-list by 1.
                d. Return the element stored in the temporary variable.
            If the linked-list has more than one element:
                a. Traverse the list to find the second-to-last node and store it in a temporary variable.
                b. Store the last element of the list in a temporary variable.
                c. Set the next pointer of the second-to-last node to be null.
                d. Update the tail pointer to be the second-to-last node.
                e. Decrement the size of the linked-list by 1.
                f. Return the element stored in the temporary variable.
        **/
        if(head == null){
            System.out.println("The list is empty");
        }else{
            Node<E> currentNode = head;
            Node<E> previousNode = null;
            while(currentNode.next != null){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
            tail = previousNode;
            size--;
        }
    }
    public void remove(int index){
        
        /** 
        (e)1.If the linked-list is empty: 
            If the linked-list is empty, you cannot perform the remove() operation. 
            You should throw an exception or return null, depending on your implementation.

            If the element to be removed is the head of the list: 
            If the element to be removed is the head of the list, 
            you can simply remove the head and update the head pointer 
            to point to the next node in the list.

            If the element to be removed is in the middle of the list: 
            If the element to be removed is in the middle of the list, 
            you need to traverse the list to find the node that contains 
            the element to be removed. Then you can remove that node by 
            updating the next pointer of the previous node to point to the next node in the list.

            If the element to be removed is the tail of the list: 
            If the element to be removed is the tail of the list, 
            you need to traverse the list to find the second-to-last node,
            update its next pointer to be null, and update the tail pointer to point to the second-to-last node. 
        
        (f)Check if the linked-list is empty.
            If the linked-list is empty, throw an exception or return null (depending on your implementation).
            If the linked-list is not empty:
                a. If the element to be removed is the head of the list:
                    i. Store the current head of the list in a temporary variable.
                    ii. Set the head to be the next node in the list.
                    iii. Decrement the size of the linked-list by 1.
                    iv. Return the element stored in the temporary variable.
                b. If the element to be removed is in the middle of the list:
                    i. Traverse the list to find the node that contains the element to be removed and the previous node.
                    ii. Set the next pointer of the previous node to be the next node in the list.
                    iii. Decrement the size of the linked-list by 1.
                    . Return the element stored in the removed node.
                c. If the element to be removed is the tail of the list:
                    i. Traverse the list to find the second-to-last node and store it in a temporary variable.
                    ii. Set the next pointer of the second-to-last node to be null.
                    iii. Update the tail pointer to be the second-to-last node.
                    iv. Decrement the size of the linked-list by 1.
                    v. Return the element stored in the removed node.
        */
        Node<E> currentNode = head;
        Node<E> previousNode = null;
        int count = 0;
        while(count < index){
            previousNode = currentNode;
            currentNode = currentNode.next;
            count++;
        }
        previousNode.next = currentNode.next;
        size--;
    }
    
    

    public static void main(String[] args) {
        T4Q1<String> o = new T4Q1<>();

        o.addFirst("alpha");

    }
}




   


