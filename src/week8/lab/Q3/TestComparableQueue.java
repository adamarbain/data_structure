package week8.lab.Q3;

import java.util.Queue;

public class TestComparableQueue {
    public static void main(String[] args) {
    Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>();
    BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
    BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
    BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
    BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java(Dummies)"));
    BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for AbsoluteBeginner"));
    
    System.out.println(BookQueue);
    
    while (!BookQueue.isEmpty()) {
        System.out.println("Head Element : "+BookQueue.remove());
        System.out.println("Queue : "+BookQueue);
        }
    }   
}