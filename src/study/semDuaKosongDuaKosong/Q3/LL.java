package study.semDuaKosongDuaKosong.Q3;

public class LL<E> {

    public static void main(String[] args) {
        LL<String> myLL = new LL<>();
        myLL.createNode("Lord of The Rings", 500);
        myLL.createNode("Tale of the Body Thief", 1);
        myLL.createNode("Memnoch the Devil", 100);
        myLL.createNode("White Crane", 100);
        myLL.createNode("Heart of a Samurai", 10);
        myLL.display();
        myLL.addAfter("Memnoch the Devil", "White Crane", 10);
        myLL.addAfter("White Crane", "Memoirs of a Geisha", 90);
        myLL.removeNode("Harry Potter");
        myLL.removeNode("Heart of a Samurai");
        myLL.display();
    }

    Node<E> head;
    Node<E> tail;
    int size;

    public LL() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void createNode(E element1, int element2) {
        add(element1, element2);
    }
    
    public int getIndex(E element){
    Node<E> temp = new Node(element);
    Node<E> current = head;
    int index = 0 ;
    while(current != null){
        if(current.element1 == temp.element1)
            return index; 
        current = current.next;
        index++;
        }
    return -1 ;
    }

    public void add(E element1, int element2) {
        Node<E> newNode = new Node<>(element1, element2);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void addAfter(E elementBefore, E element1, int element2) {
        int index = getIndex(elementBefore);
        Node<E> current = head;
        while (current != null && !current.element1.equals(elementBefore)) {
            current = current.next;
        }
        if (current != null) {
            Node<E> newNode = new Node<>(element1, element2);
            newNode.next = current.next;
            current.next = newNode;
            size++;
            System.out.println("Adding "+element1+" after " +elementBefore);
            System.out.println("Found "+elementBefore+ " which is book number "+index+ " in the linked list.");
        } else {
            System.out.println("Element not found: " + elementBefore);
        }
    }

    public void removeNode(E element) {
        int index = getIndex(element);
        if (isEmpty()) {
            System.out.println("List is empty. Cannot remove node.");
            return;
        }
        if (head.element1.equals(element)) {
            head = head.next;
            size--;
            System.out.println("Removing " + element);
            System.out.println(element+" is number "+index+ " book. Removing "+element+ " from the linked list.");
            return;
        }
        Node<E> current = head;
        while (current.next != null && !current.next.element1.equals(element)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
            System.out.println("Removing " + element);
            System.out.println(element+" is number "+index+ " book. Removing "+element+ " from the linked list.");
        } else {
            System.out.println("Removing " + element);
            System.out.println("Couldn't find bookname... ");
        }
    }

    public void display() {
        System.out.println("\nDisplaying the Linked List ****************** \n");
        Node<E> current = head;
        while (current != null) {
            System.out.println(current.element1 + ": " + current.element2 +" Sold");
            current = current.next;
        }
        System.out.println();
    }

    public void totalSold() {
        int total = 0;
        Node<E> current = head;
        while (current != null) {
            total += current.element2;
            current = current.next;
        }
        System.out.println("Total Sold: " + total);
    }
}

class Node<E> {

    E element1;
    int element2;
    Node<E> next;

    public Node() {
    }
    
    public Node(E element1){
        this.element1 = element1;
    }

    public Node(E element1, int element2) {
        this.element1 = element1;
        this.element2 = element2 * 1000000;
    }
    
}
