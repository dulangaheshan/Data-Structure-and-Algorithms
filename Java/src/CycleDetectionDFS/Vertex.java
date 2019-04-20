package CycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private  boolean visited;
    private  boolean beingvisited;
    private List<Vertex> neighboursList;

    public Vertex(String name){
        this.name =name;
        this.neighboursList = new ArrayList<>();
    }

    public void addNeighbours(Vertex vertex){
        this.neighboursList.add(vertex);
    }

    public String getName() {
        return name;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isBeingvisited() {
        return beingvisited;
    }

    public List<Vertex> getNeighboursList() {
        return neighboursList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setBeingvisited(boolean beingvisited) {
        this.beingvisited = beingvisited;
    }

    public void setNeighboursList(List<Vertex> neighboursList) {
        this.neighboursList = neighboursList;
    }

    @Override
    public String toString() {
        return name;
    }
}
