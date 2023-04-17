package week5;

public class KindergartenLinkedList<E> {
    
    Node<E> head;
    Node<E> tail;
    int size;

    class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(E e){
        Node<E> newNode = new Node<>(e);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeElement(E e){
        Node<E> current = head;
        Node<E> previous = null;
        while(current != null){
            if(current.data.equals(e)){
                if(previous == null){
                    head = current.next;
                }else{
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }

    }

    public void printList(){
        Node<E> current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public boolean contains(E e){
        Node<E> current = head;
        while(current != null){
            if(current.data.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void replace (E e,E newE){
        Node<E> current = head;
        while(current != null){
            if(current.data.equals(e)){
                current.data = newE;
                return;
            }
            current = current.next;
        }
    }

}
