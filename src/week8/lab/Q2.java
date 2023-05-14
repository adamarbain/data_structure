package week8.lab;
/**
 * Create two priority queues with the following elements: {"George", "Jim", "John",
    "Blake", "Kevin", "Michael"} and {"George", "Katie", "Kevin", "Michelle", "Ryan"}.
    Find their union, difference, and intersection.
 */
import java.util.PriorityQueue;


 public class Q2 {
    
    public static void main(String... args ){
        
        // intializing pq1 and pq2
        PriorityQueue<String> pq1=new PriorityQueue<String>();
        PriorityQueue<String> pq2=new PriorityQueue<String>();
        
        // intializing pq1 in array
        String[] arr1={"George", "Jim", "John","Blake", "Kevin", "Michael"};
        // intializing pq2 in array
        String[] arr2={"George", "Katie", "Kevin", "Michelle", "Ryan"};

        // adding elements in pq1 and pq2 using for loop
        for(int i=0;i<arr1.length;i++){
            pq1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            pq2.add(arr2[i]);
        }
        // printing pq1 and pq2
        System.out.println("PQ1: "+pq1);
        System.out.println("PQ2: "+pq2);

        // printing union,difference and intersection
        System.out.println("Union: "+union(pq1,pq2));
        System.out.println("Difference: "+difference(pq1,pq2));
        System.out.println("Intersection: "+intersection(pq1,pq2));
        }
    
    // union method
    public static PriorityQueue<String> union(PriorityQueue<String> pq1,PriorityQueue<String> pq2){
        PriorityQueue<String> union=new PriorityQueue<String>();
        // adding all elements in pq1 and pq2
        union.addAll(pq1);
        union.addAll(pq2);
        return union;
    }
    
    // difference method
    public static PriorityQueue<String> difference(PriorityQueue<String> pq1,PriorityQueue<String> pq2){
        PriorityQueue<String> difference=new PriorityQueue<String>();
        // adding all elements in pq1 and removing all elements in pq2
        difference.addAll(pq1);
        difference.removeAll(pq2);
        return difference;
    }
    
    // intersection method
    public static PriorityQueue<String> intersection(PriorityQueue<String> pq1,PriorityQueue<String> pq2){
        PriorityQueue<String> intersection=new PriorityQueue<String>();
        // adding all elements in pq1 and pq2
        intersection.addAll(pq1);
        // retaining all elements in pq2
        intersection.retainAll(pq2);
        return intersection;
    }
}
