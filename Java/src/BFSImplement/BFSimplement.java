package BFSImplement;

public class BFSimplement {

    public static void main(String[] args) {
       Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5= new Vertex(5);

        v1.addNeighbours(v2);
        v1.addNeighbours(v4);
        v4.addNeighbours(v5);
        v2.addNeighbours(v3);
        v1.addNeighbours(v4);

        BFS bfs = new BFS();
        bfs.bfs(v1);

    }
}

