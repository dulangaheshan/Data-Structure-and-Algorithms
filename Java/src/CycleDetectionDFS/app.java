package CycleDetectionDFS;

import java.util.ArrayList;
import java.util.List;

public class app {

    public static void main(String[] args) {

        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");

        v1.addNeighbours(v2);
        v1.addNeighbours(v3);
        v2.addNeighbours(v3);
        v4.addNeighbours(v1);
        v4.addNeighbours(v5);
        v5.addNeighbours(v6);
        v6.addNeighbours(v4);


        List<Vertex> list  = new ArrayList<>();

        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);
        list.add(v6);




     CycleDetectionDFS cycleDetectionDFS = new CycleDetectionDFS();

     cycleDetectionDFS.deetectCycle(list);
     //cycleDetectionDFS.dfs(v1);

    }
}
