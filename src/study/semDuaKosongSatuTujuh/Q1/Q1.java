package study.semDuaKosongSatuTujuh.Q1;


public class Q1<E1,E2> {
    
    public static void main(String[] args) {
        
        Q1<String,String> list = new Q1();
        
        list.insertFirstLink("Louis Vuitton","10,000,000");
        list.insertFirstLink("Channel","100,000,000");
        list.insertFirstLink("Prada","1,000,000");
        list.insertFirstLink("Tods","500,000,000");
        list.display();
        list.addAfter("Coach", "10,000,000", "Channel");
        list.display();
        list.addAfter("Mulberry", "90,000,000", "Coach");
        list.display();
        list.removeLink("Channel");
        list.display();
        list.removeLink("Coach");
        list.display();
    }
   
    Node<E1,E2> head;
    Node<E1,E2> tail;
    int size;
    
    public void insertFirstLink(E1 brandName,E2 brandNum){
        Node<E1,E2> newNode = new Node(brandName,brandNum);
        if (tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public  int getBrandIndex(E1 brandName){
    Node<E1,E2> temp = new Node(brandName);
    Node<E1,E2> current = head;
    int index = 1 ;
    while(current != null){
        if(current.brandName == temp.brandName)
            return index; 
        current = current.next;
        index++;
        }
    return -1 ;
    }
    
    
    public void addAfter(E1 brandName,E2 brandNum,E1 currentBrandName){
        int index = getBrandIndex(currentBrandName);
        if (index == 0)
            insertFirstLink(brandName,brandNum);
        else{
        Node<E1,E2> current = head ;
        for (int i = 1 ; i < index ; i++)
            current = current.next;
        Node<E1,E2> temp = current.next;
        current.next = new Node<>(brandName,brandNum);
        (current.next).next = temp;
        System.out.println("Adding "+brandName+" after "+currentBrandName);
        System.out.println("Found "+currentBrandName+" which is handbag number "+index+" in the linked list");
        size++;
        }
    }
    
    
    public void removeLink(E1 currentBrand){
        int index = getBrandIndex(currentBrand);
        if (index < 0 || index > size){
            System.out.println("Brand is not included in the handbag");
        }
        else{
        Node<E1,E2> previous = head ;
        for (int i = 1 ; i < (index-1) ; i++){
            previous = previous.next;
        }
        Node<E1,E2> current = previous.next;
        previous.next = current.next;
        size--;
        System.out.println("Removing "+current.brandName);
        System.out.println("Found a match."+current.brandName+" is handbag number "+index+" in the linked list");
        }
        System.out.println();
    }
    
    public void display(){
        System.out.println("\nDisplaying the Linked List *************************");
        Node<E1,E2> current = head;
        while(current!= null){
            System.out.println(current.brandName+": "+current.brandQuantity+" Sold");
            current = current.next;
        }
        System.out.println();
        }
    
}

class Node<E1,E2>{

    E1 brandName;
    E2 brandQuantity;
    Node<E1,E2> next;
    
   public Node(){
   }
   
   public Node(E1 brandName){
       this.brandName = brandName;
   }
   
   public Node (E1 brandName,E2 brandQuantity){
       this.brandName = brandName;
       this.brandQuantity = brandQuantity;
   }
   
}