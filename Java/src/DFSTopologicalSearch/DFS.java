package DFSTopologicalSearch;

import java.util.Stack;

public class DFS {

    private Stack<Vertex> topologicalOrderstack;

    public DFS(){
        this.topologicalOrderstack = new Stack<>();
    }

    public void DfsRecursive(Vertex vertex){

        vertex.setVisited(true);
        for(Vertex v : vertex.getNeighboursLits()){
            if(!v.isVisited()){

                DfsRecursive(v);
            }
        }

        this.topologicalOrderstack.push(vertex);

    }

    public Stack<Vertex> getTopologicalOrderstack() {
        return topologicalOrderstack;
    }
}
