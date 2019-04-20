package CycleDetectionDFS;

import javax.sound.midi.Soundbank;
import java.util.List;

public class CycleDetectionDFS {

public void deetectCycle(List<Vertex> vertexList){

    for(Vertex v : vertexList){
        if(!v.isVisited()){
            dfs(v);
        }
    }

}

    public void dfs(Vertex vertex) {

        System.out.println("DFS on Vertex "+vertex);

        vertex.setBeingvisited(true);

        for(Vertex v : vertex.getNeighboursList()){

            System.out.println("Visiting the neighbours of vertex " + vertex);

            if(v.isBeingvisited()){
                System.out.println("There is Backward edge : so there is a cycle");
                return;

            }

            if(!v.isVisited()){
                System.out.println("Visiting vertex " + v + " Recursively");
                v.setVisited(true);
                dfs(v);
            }

            System.out.println(" set Vertex " + vertex + " being visited = false and visited = true" );



        }

        vertex.setBeingvisited(false);
        vertex.setVisited(true);

    }


}
