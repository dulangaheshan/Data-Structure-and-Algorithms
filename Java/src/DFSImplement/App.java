package DFSImplement;

import sun.security.krb5.internal.rcache.DflCache;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        v1.addNeighbours(v2);
        v1.addNeighbours(v3);
        v3.addNeighbours(v4);
        v4.addNeighbours(v5);
//        v1.addNeighbours(v2);

        List<Vertex> list = new ArrayList<>();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);
        DFS dfs = new DFS();

        //dfs.dfs(list);

      //  dfs.dfsWithStack(v1);

      dfs.dfsRecursive(v1);
    }
}
