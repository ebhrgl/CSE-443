package RMI;
import java.io.Serializable;
import java.util.List;

public class Graph<E> implements Serializable {
    private int vCount;
    private List<Edge<E>> edges;
    private GraphVertex<E>[] vertex;
    private final double[][] graph;

    public Graph(List<Edge<E>> edges, int vCount, List<GraphVertex<E>> vertex, double[][] graph, GraphVertex<E>[] vertexG) {

        this.edges = edges;
        this.vCount= vCount;
        this.graph = graph;
        this.vertex = vertexG;
    }

    public int getvCount() {
        return vCount;
    }

    public List<Edge<E>> getEdges(){
        return edges;
    }

    public void addVertex(E val) {
        vertex[vCount++] = new GraphVertex<>(val);
    }

   public void addEdge(int startnode , int nextnode){

        GraphVertex tmp = vertex[startnode] ;
        //Bu döngü için bu siteden yararlandım.
        //https://www.dreamincode.net/forums/topic/166043-help-me-implement-addedge-method/
        // finding the spot to place the new Vertex
        for( ; tmp.getVertexValue() != null; tmp= (GraphVertex) tmp.getVertexValue());

    }

    public String toString() {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < graph.length; ++i)
            for (int j = i; j < graph[i].length; ++j)
                result.append(String.format("%5.2f\n", graph[i][j]));
        return result.toString();
    }

}


