package week9.tutorial;


/**
 * Write code to create the graph using linked-list representation. You use the adjacency matrix
    or the adjacency list for this purpose?
 */
public class Q3 {
    
    public static void main(String[] args) {
        Graph<Character> graph = new Graph<>();
        for (char ch = 'A'; ch <= 'I'; ch++)
            graph.addVertex(ch);
            graph.addEdge('A', 'C');
            graph.addEdge('A', 'D');
            graph.addEdge('B', 'D');
            graph.addEdge('C', 'E');
            graph.addEdge('C', 'F');
            graph.addEdge('D', 'E');
            graph.addEdge('E', 'G');
            graph.addEdge('F', 'H');
            graph.addEdge('G', 'H');
            graph.addEdge('H', 'I');
            graph.showAdjacencyList();
        }
    
}

// Graph class 
class Graph<T> {
    private int size;
    private Vertex<T>[] vertices;
    private int[][] adjacencyMatrix;
    private int index;
    
    public Graph() {
        size = 20;
        vertices = new Vertex[size];
        adjacencyMatrix = new int[size][size];
        index = 0;
    }
    
    public void addVertex(T label) {
        vertices[index++] = new Vertex<>(label);
    }
    
    public void addEdge(T start, T end) {
        int startIndex = findIndex(start);
        int endIndex = findIndex(end);
        if (startIndex != -1 && endIndex != -1) {
            adjacencyMatrix[startIndex][endIndex] = 1;
        }
    }
    
    public int findIndex(T label) {
        for (int i = 0; i < index; i++) {
            if (vertices[i].label.equals(label)) {
                return i;
            }
        }
        return -1;
    }
    
    public void showAdjacencyMatrix() {
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void showAdjacencyList() {
        for (int i = 0; i < index; i++) {
            System.out.print(vertices[i].label + " -> ");
            for (int j = 0; j < index; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    System.out.print(vertices[j].label + " ");
                }
            }
            System.out.println();
        }
    }
    
    private class Vertex<T> {
        private T label;
        
        public Vertex(T label) {
            this.label = label;
        }
    }
}

