package week6.Q5;
import week6.Q2.MyStack;

public class TowerOfHanoi{
    public static void main(String[] args) {
        int n = 3; // number of disks
        // generate three stacks
        MyStack<Integer> tower1 = new MyStack<>();
        MyStack<Integer> tower2 = new MyStack<>();
        MyStack<Integer> tower3 = new MyStack<>();

        // push n disks onto tower1
        for (int i = n; i > 0; i--) {
            tower1.push(i);
        }

        // display the three towers
        displayTower(tower1, tower2, tower3);
        // move n disks from tower1 to tower3 using tower2
        moveDisks(n, tower1, tower2, tower3);


    }

    // 'moveDisks' method moves n disks from tower1 to tower3 using tower2
    public static void moveDisks(int n, MyStack<Integer> tower1, MyStack<Integer> tower2, MyStack<Integer> tower3) {
        if (n == 1) {
            tower3.push(tower1.pop());
            displayTower(tower1, tower2, tower3);
        } else {
            moveDisks(n - 1, tower1, tower3, tower2);
            tower3.push(tower1.pop());
            displayTower(tower1, tower2, tower3);
            moveDisks(n - 1, tower2, tower1, tower3);
        }
    }

    // 'displayTower' method displays the contents of the three towers
    public static void displayTower(MyStack<Integer> tower1, MyStack<Integer> tower2, MyStack<Integer> tower3) {
        System.out.println("Tower 1: " + tower1);
        System.out.println("Tower 2: " + tower2);
        System.out.println("Tower 3: " + tower3);
        System.out.println();
    }

    
}