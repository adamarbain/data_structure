package week7.lab.Q1;

public class test {
    
    public static void main(String[] args) {
        // Have an initialize queue items consists of Durian and Blueberry in a fruitQ
        MyQueue<String> fruitQ = new MyQueue<String>();
        fruitQ.enqueue("Durian");
        fruitQ.enqueue("Blueberry");
        // Then add new items in the following order: Apple, Orange, Grapes, Cherry.
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        // display the queue
        System.out.println(fruitQ);
        // show the top item
        System.out.println("Top item: " + fruitQ.peek());
        // get the queue size
        System.out.println("Queue size: " + fruitQ.getSize());
        // delete durian
        System.out.println("Deleted item: " + fruitQ.dequeue());
        // get item in index position of 2
        System.out.println("Item in index position 2: " + fruitQ.getElement(2));
        // check if the queue contains cherry
        System.out.println("Queue contains Cherry: " + fruitQ.contains("Cherry"));
        // check if the queue contains durian
        System.out.println("Queue contains Durian: " + fruitQ.contains("Durian"));
        // display the queue using isEmpty() method
        System.out.println("Queue is empty: " + fruitQ.isEmpty());

    }
}
