package week9.lab;
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * The addEdge method in WeightedGraph.java adds only directed edges. Create an
addUndirectedEdge method that creates undirected edges. This method receives two vertices
and a weight and return a boolean.

Create a method removeEdge that removes an edge if the source and destination of the edge
is given.
 */

public class WeightedGraph<T extends Comparable<T>, N extends Comparable<N>>{

    Vertex<T, N> head;
    int size;

    // constructor with zero parameter
    public WeightedGraph(){
        head = null;
        size = 0;
    }

    // Get the number of vertices in the graph
    public int getSize(){
        return size;
    }

    // hasVertex method
    public boolean hasVertex(T vInfo){
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(vInfo) == 0){
                return true;
            }
            v = v.nextVertex;
        }
        return false;
    }

    // getIndeg method
    public int getIndeg(T vInfo){
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(vInfo) == 0){
                return v.indeg;
            }
            v = v.nextVertex;
        }
        return -1;
    }

    // addVertex method
    public boolean addVertex(T vInfo){
        if(hasVertex(vInfo)){
            return false;
        }
        Vertex<T, N> v = new Vertex<>(vInfo, head);
        head = v;
        size++;
        return true;
    }

    // getIndex method
    public int getIndex(T vInfo){
        Vertex<T, N> v = head;
        int index = 0;
        while(v != null){
            if(v.vertexInfo.compareTo(vInfo) == 0){
                return index;
            }
            v = v.nextVertex;
            index++;
        }
        return -1;
    }

    // Return all vertex info to an ArrayList
    public ArrayList<T> getAllVertexObjects(){
        ArrayList<T> list = new ArrayList<>();
        Vertex<T, N> v = head;
        while(v != null){
            list.add(v.vertexInfo);
            v = v.nextVertex;
        }
        return list;
    }

    // getVertexInfo method
    public T getVertexInfo(int index){
        Vertex<T, N> v = head;
        int i = 0;
        while(v != null){
            if(i == index){
                return v.vertexInfo;
            }
            v = v.nextVertex;
            i++;
        }
        return null;
    }

    // hasEdge method
    public boolean hasEdge(T source, T destination){
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(source) == 0){
                Edge<T, N> e = v.firstEdge;
                while(e != null){
                    if(e.toVertex.vertexInfo.compareTo(destination) == 0){
                        return true;
                    }
                    e = e.nextEdge;
                }
            }
            v = v.nextVertex;
        }
        return false;
    }

    // addEdge method
    public boolean addEdge(T source, T destination, N weight){
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        if(hasEdge(source, destination)){
            return false;
        }
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(source) == 0){
                Edge<T, N> e = new Edge<>(v, weight, v.firstEdge);
                v.firstEdge = e;
                v.outdeg++;
                break;
            }
            v = v.nextVertex;
        }
        v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(destination) == 0){
                Edge<T, N> e = new Edge<>(v, weight, v.firstEdge);
                v.firstEdge = e;
                v.indeg++;
                break;
            }
            v = v.nextVertex;
        }
        return true;
    }

    // addUndirectedEdge method
    public boolean addUndirectedEdge(T source, T destination, N weight){
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        if(hasEdge(source, destination)){
            return false;
        }
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(source) == 0){
                Edge<T, N> e = new Edge<>(v, weight, v.firstEdge);
                v.firstEdge = e;
                v.outdeg++;
                break;
            }
            v = v.nextVertex;
        }
        v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(destination) == 0){
                Edge<T, N> e = new Edge<>(v, weight, v.firstEdge);
                v.firstEdge = e;
                v.outdeg++;
                break;
            }
            v = v.nextVertex;
        }
        return true;
    }

    // removeEdge method
    public boolean removeEdge(T source, T destination){
        if(!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        if(!hasEdge(source, destination)){
            return false;
        }
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(source) == 0){
                Edge<T, N> e = v.firstEdge;
                Edge<T, N> prev = null;
                while(e != null){
                    if(e.toVertex.vertexInfo.compareTo(destination) == 0){
                        if(prev == null){
                            v.firstEdge = e.nextEdge;
                        }
                        else{
                            prev.nextEdge = e.nextEdge;
                        }
                        v.outdeg--;
                        break;
                    }
                    prev = e;
                    e = e.nextEdge;
                }
            }
            v = v.nextVertex;
        }
        v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(destination) == 0){
                Edge<T, N> e = v.firstEdge;
                Edge<T, N> prev = null;
                while(e != null){
                    if(e.toVertex.vertexInfo.compareTo(source) == 0){
                        if(prev == null){
                            v.firstEdge = e.nextEdge;
                        }
                        else{
                            prev.nextEdge = e.nextEdge;
                        }
                        v.indeg--;
                        break;
                    }
                    prev = e;
                    e = e.nextEdge;
                }
            }
            v = v.nextVertex;
        }
        return true;
    }
    
    // getVertex method
    public T getVertex (int position){
        if (position > size-1 || position < 0)
            return null;
        Vertex<T, N> temp = head;
        for (int i = 0; i < position; i++)
            temp = temp.nextVertex;
        return temp.vertexInfo;
        
    }

    // getEdgeWeight method
    public N getEdgeWeight(T source, T destination){
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(source) == 0){
                Edge<T, N> e = v.firstEdge;
                while(e != null){
                    if(e.toVertex.vertexInfo.compareTo(destination) == 0){
                        return e.weight;
                    }
                    e = e.nextEdge;
                }
            }
            v = v.nextVertex;
        }
        return null;
    }

    // getOutdeg method
    public int getOutdeg(T vertex){
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(vertex) == 0){
                return v.outdeg;
            }
            v = v.nextVertex;
        }
        return -1;
    }

    // getNeighbours method
    public LinkedList<T> getNeighbours(T vertex){
        Vertex<T, N> v = head;
        while(v != null){
            if(v.vertexInfo.compareTo(vertex) == 0){
                LinkedList<T> list = new LinkedList<>();
                Edge<T, N> e = v.firstEdge;
                while(e != null){
                    list.add(e.toVertex.vertexInfo);
                    e = e.nextEdge;
                }
                return list;
            }
            v = v.nextVertex;
        }
        return null;
    }

    // printEdges method
    public void printEdges(){
        Vertex<T, N> v = head;
        while(v != null){
            System.out.print(v.vertexInfo + " ");
            Edge<T, N> e = v.firstEdge;
            while(e != null){
                System.out.print(e.toVertex.vertexInfo + " ");
                e = e.nextEdge;
            }
            System.out.println();
            v = v.nextVertex;
        }
    }    
} 

class Vertex <T extends Comparable<T>, N extends Comparable<N>>{
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex<T, N> nextVertex;
    Edge<T, N> firstEdge;

    // constructor with zero parameter
    public Vertex(){
        vertexInfo = null;
        indeg = 0;
        outdeg = 0;
        nextVertex = null;
        firstEdge = null;
    }

    // constructor with "T vInfo" and Vertex parameter
    public Vertex(T vInfo, Vertex<T, N> next){
        vertexInfo = vInfo;
        indeg = 0;
        outdeg = 0;
        nextVertex = next;
        firstEdge = null;
    }

}

//Edge class
class Edge <T extends Comparable<T>, N extends Comparable<N>>{
    Vertex<T, N> toVertex;
    Edge<T, N> nextEdge;
    N weight;

    // constructor with zero parameter
    public Edge(){
        toVertex = null;
        nextEdge = null;
        weight = null;
    }

    // constructor with "Vertex<T, N> destination, N w" and Edge parameter
    public Edge(Vertex<T, N> destination, N w, Edge<T, N> next){
        toVertex = destination;
        nextEdge = next;
        weight = w;
    }
}



