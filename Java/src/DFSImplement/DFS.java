package DFSImplement;


import java.util.List;
import java.util.Stack;

public class DFS {

    private Stack<Vertex> stack;

    public DFS(){
        this.stack = new Stack<>();
    }

    public void dfs(List<Vertex> list){  // when we have several clustered it mean there may be some node that not connected

        for(Vertex v : list){
            if(!v.isVisited()){
                 dfsWithStack(v);
            }
        }

    }

    public  void dfsWithStack(Vertex root){
        this.stack.add(root);
        root.setVisited(true);

        while(!stack.isEmpty()){
            Vertex actualVertex = this.stack.pop();
            System.out.println(actualVertex.getName() + " ");

            for(Vertex v : actualVertex.getNeighbourList()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }


}
