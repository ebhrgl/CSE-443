package RMI;

import java.io.Serializable;

public class GraphVertex<E> implements Serializable {

    private E value;
    public GraphVertex(E value) {
        super();
        this.value = value;
    }
    public void setVertexValue(E val) {
        this.value = value;
    }
    public E getVertexValue() {
        return value;
    }
}
