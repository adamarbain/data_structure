package week9.tutorial;

// Represent the graph in question 1 using a 2 dimensional array. You use the adjacency matrix
// or the adjacency list for this purpose?

public class Q2{

    public static void main(String[] args) {
        int[][] graph = new int[9][9];
        graph[0][2] = 1;
        graph[0][3] = 1;
        graph[1][3] = 1;
        graph[2][4] = 1;
        graph[2][5] = 1;
        graph[3][4] = 1;
        graph[4][6] = 1;
        graph[5][7] = 1;
        graph[6][7] = 1;
        graph[7][8] = 1;
        

        for(int i = 0; i < graph.length; i++){
            for(int j = 0; j < graph.length; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Adjacency matrix is used to represent the graph in question 1.
    // This is because the graph is a directed graph and the adjacency matrix
    // is more suitable for directed graph.
}