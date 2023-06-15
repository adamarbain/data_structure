package week13.lab;

public class BST<E extends Comparable<E>> {

    protected TreeNode<E> root;
    protected int size = 0;
    
    public BST() {
    }
    
    public boolean search(E e) {
        TreeNode<E> current = root; // Start from the root

        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                current = current.left; // Go left
            } else if (e.compareTo(current.element) > 0) {
                current = current.right; // Go right
            } else { // Element matches current.element
                return true; // Element is found
            }
        }
        return false;
    }

    public boolean insert(E e) {
        
        if (root == null) {
            root = createNewNode(e); // Create a new root
        } else {
            // Locate the parent node
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) { // 56 < 23
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) { // 56 > 23
                    parent = current;
                    current = current.right;
                } else {
                    return false; // Duplicate node not inserted
                }
            }
            // Create the new node and attach it to the parent node
            if (e.compareTo(parent.element) < 0) {
                parent.left = createNewNode(e);
            } else {
                parent.right = createNewNode(e);
            }
        }
        size++;
        return true; // Element inserted successfully
    }

    public int getSize() {
        return size;
    }

    public int height() {
        return height(root);
    }   

    private int height(TreeNode<E> node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            } else {
                return rightHeight + 1;
            }
        }
    }

    public E getRoot() {
        return root.element;
    }

    public E minValue(){
        return minValue(root);
    }

    private E minValue(TreeNode<E> node) {
        TreeNode<E> current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current.element;
    }

    public E maxValue(){
        return maxValue(root);
    }

    private E maxValue(TreeNode<E> node) {
        TreeNode<E> current = node;
        while (current.right != null) {
            current = current.right;
        }
        return current.element;
    }

    public java.util.ArrayList<TreeNode<E>> path(E e) {
        java.util.ArrayList<TreeNode<E>> list = new java.util.ArrayList<>();
        TreeNode<E> current = root; // Start from the root

        while (current != null) {
            list.add(current); // Add the node to the list
            if (e.compareTo(current.element) < 0) {
                current = current.left; // Go left
            } else if (e.compareTo(current.element) > 0) {
                current = current.right; // Go right
            } else {
                break;
            }
        }
        return list; // Return an array list of nodes
    }

    public boolean delete(E e){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left; // Go left
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right; // Go right
            } else {
                break;
            }
        }
        if (current == null) {
            return false; // Element is not in the tree
        }
        // Case 1: current has no left child
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right; // Keep going to the right
            }
            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;
            // Eliminate rightmost node
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                // Special case: parentOfRightMost == current
                parentOfRightMost.left = rightMost.left;
            }
        }
        size--;
        return true; // Element inserted successfully
    }

    public boolean clear(){
        root = null;
        size = 0;
        return true;
    }

    public void inorder(){
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    public void preorder(){
        preorder(root);
    }
    
    protected void preorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(){
        postorder(root);
    }
    
    protected void postorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    // createNewNode(E e) method
    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    } 

}

class TreeNode<E extends Comparable<E>> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e) {
        element = e;
    }

    public TreeNode(E e, TreeNode<E> left, TreeNode<E> right) {
        element = e;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return element.toString();
    }
}
