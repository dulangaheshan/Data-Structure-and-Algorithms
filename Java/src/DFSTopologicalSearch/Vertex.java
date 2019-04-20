package DFSTopologicalSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String data;
    private boolean visited;
    private List<Vertex> neighboursList;

    public Vertex(String data){
        this.data = data;
        this.neighboursList = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public List<Vertex> getNeighboursLits() {
        return neighboursList;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNeighboursLits(List<Vertex> neighboursLits) {
        this.neighboursList = neighboursLits;
    }

    public void setNeighbours(Vertex v){
        this.neighboursList.add(v);
    }

    public boolean isVisited() {
        return visited;
    }

}
