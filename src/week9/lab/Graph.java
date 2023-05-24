package week9.lab;


/*
 * We do not need weighted graphs all the time. Based on the framework of the weighted
graph, create a class Graph.java for unweighted graphs. Implement both addEdge and
addUndirectedEdge methods.
 */
public class Graph<T extends Comparable<T>, N extends Comparable<N>> {
    private Vertex<T, N> head;
    private int size;

    private static class Vertex<T extends Comparable<T>, N extends Comparable<N>> {
        T vertexInfo;
        Vertex<T, N> nextVertex;
        Edge<T, N> firstEdge;
        int indeg;
        int outdeg;

        public Vertex(T vInfo, Vertex<T, N> next) {
            vertexInfo = vInfo;
            nextVertex = next;
            firstEdge = null;
            indeg = 0;
            outdeg = 0;
        }
    }

    private static class Edge<T extends Comparable<T>, N extends Comparable<N>> {
        Vertex<T, N> toVertex;
        Edge<T, N> nextEdge;
        N weight;

        public Edge(Vertex<T, N> to, Edge<T, N> next, N w) {
            toVertex = to;
            nextEdge = next;
            weight = w;
        }
    }

    public Graph() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (head == null);
    }
    public void clear() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    // create "addEdge" method
    public boolean addEdge(T source, T destination) {
        Vertex<T, N> fromVertex = findVertex(source);
        Vertex<T, N> toVertex = findVertex(destination);
        if (fromVertex == null || toVertex == null) {
            return false;
        }
        Edge<T, N> newEdge = new Edge<>(toVertex, null, null);
        if (fromVertex.firstEdge == null) {
            fromVertex.firstEdge = newEdge;
        } else {
            Edge<T, N> currentEdge = fromVertex.firstEdge;
            while (currentEdge.nextEdge != null) {
                currentEdge = currentEdge.nextEdge;
            }
            currentEdge.nextEdge = newEdge;
        }
        fromVertex.outdeg++;
        toVertex.indeg++;
        return true;
    }

    // create "addUndirectedEdge" method
    public boolean addUndirectedEdge(T source, T destination) {
        return addEdge(source, destination) && addEdge(destination, source);
    }

    // create "findVertex" method
    private Vertex<T, N> findVertex(T vInfo) {
        Vertex<T, N> currentVertex = head;
        while (currentVertex != null) {
            if (currentVertex.vertexInfo.compareTo(vInfo) == 0) {
                return currentVertex;
            }
            currentVertex = currentVertex.nextVertex;
        }
        return null;
    }

    // create "printEdges" method
    public void printEdges() {
        Vertex<T, N> currentVertex = head;
        while (currentVertex != null) {
            System.out.print(currentVertex.vertexInfo + ": ");
            Edge<T, N> currentEdge = currentVertex.firstEdge;
            while (currentEdge != null) {
                System.out.print(currentEdge.toVertex.vertexInfo + " ");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            currentVertex = currentVertex.nextVertex;
        }
    }

}
