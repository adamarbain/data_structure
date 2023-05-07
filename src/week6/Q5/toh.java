package week6.Q5;
import week6.Q2.MyStack;

public class toh {
    
    public static void main(String[] args) {
        int n = 3; // number of disks
        MyStack<Integer> source = new MyStack<Integer>();
        MyStack<Integer> aux = new MyStack<Integer>();
        MyStack<Integer> dest = new MyStack<Integer>();
        for (int i = n; i >= 1; i--) {
            source.push(i);
        }
        moveDisks(n, source, aux, dest);
    }

    public static void moveDisks(int n, MyStack<Integer> source, MyStack<Integer> aux, MyStack<Integer> dest) {
        if (n > 0) {
            moveDisks(n-1, source, dest, aux);
            int disk = source.pop();
            dest.push(disk);
            System.out.println("Moved disk " + disk + " from " + source + " to " + dest);
            moveDisks(n-1, aux, source, dest);
        }
    }
}
