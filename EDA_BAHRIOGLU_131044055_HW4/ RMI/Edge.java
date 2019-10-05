package RMI;

import java.io.Serializable;

public class Edge<E> implements Serializable {
    private GraphVertex<E> v1, v2;
    private int weight;

    public Edge(GraphVertex graphVertex, GraphVertex vertex) {
    }

    public Edge(GraphVertex<E> v1, GraphVertex<E> v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    public GraphVertex<E> getV1() {
        return v1;
    }

    public GraphVertex<E> getV2() {
        return v2;
    }

    public void setV1(GraphVertex<E> v1) {
        this.v1 = v1;
    }

    public void setV2(GraphVertex<E> v2) {
        this.v2 = v2;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean equals(Edge other) {
        if (this.v1 == other.v1) {
            if (this.v2 == other.v2) {
                return true;
            }
        }
        return false;
    }
}




