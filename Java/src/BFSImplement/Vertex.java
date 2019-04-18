package BFSImplement;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private int data;
    private boolean visited;
    private List<Vertex> neighbourList;


    public Vertex(int data){
        this.data = data;
        this.neighbourList = new ArrayList<>();
    }

public void addNeighbours(Vertex vertex){
        this.neighbourList.add(vertex);
}

    public int getData() {
        return data;
    }

    public List<Vertex> getNeighbourList() {
        return neighbourList;
    }

    public boolean isVisited(){
        return this.visited;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNeighbourList(List<Vertex> neighbourList) {
        this.neighbourList = neighbourList;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

}
