package DFSTopologicalSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {

    public static void main(String[] args) {
        DFS topologicalOrder = new DFS();

        List<Vertex> graph = new ArrayList<>();

        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));

        graph.get(2).setNeighbours(graph.get(3));
        graph.get(3).setNeighbours(graph.get(1));
        graph.get(4).setNeighbours(graph.get(0));
        graph.get(4).setNeighbours(graph.get(1));
        graph.get(5).setNeighbours(graph.get(0));
        graph.get(5).setNeighbours(graph.get(2));


        for(int i = 0;i<graph.size();++i){
            if(!graph.get(i).isVisited()){  // this implement is not necessary but the graph may have different clusters
                topologicalOrder.DfsRecursive(graph.get(i));
            }
        }

        Stack<Vertex> stack = topologicalOrder.getTopologicalOrderstack();
        for(int i = 0;i<graph.size();i++){
            Vertex vertex = stack.pop();

            System.out.printf(vertex.getData());

        }

    }




}
