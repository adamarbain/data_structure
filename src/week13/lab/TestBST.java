package week13.lab;

public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        int[] data = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        
        System.out.print("Input Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        for (int i = 0; i < data.length; i++) {
            tree.insert(data[i]);
        }
        System.out.println();
        System.out.print("Inorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.println("\nHeight of BST: " + tree.height());
        System.out.println("Root for BST is: " + tree.getRoot());
        System.out.println("Check whether 10 is in the tree? " + tree.search(10));
        System.out.println("Delete 53");
        tree.delete(53);
        System.out.print("Updated Inorder data (sorted): ");
        tree.inorder();
        System.out.println("\nMin Value :" + tree.minValue());
        System.out.println("Max Value :" + tree.maxValue());
        System.out.print("A path from the root to 6 is: ");
        System.out.println(tree.path(6));
        
    }
    
}
