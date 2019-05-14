package Dijkstra;

public class App {

    public static void main(String[] args) {
        Vertex v0 = new Vertex("A");
        Vertex v1 = new Vertex("B");
        Vertex v2 = new Vertex("C");

        v0.addNeighbour(new Edge(1,v0,v1));
        v0.addNeighbour(new Edge(100,v0,v2));
        v1.addNeighbour(new Edge(1,v1,v2));

        DijkstraAlgorthm algo = new DijkstraAlgorthm();
        algo.computePath(v0);
        System.out.println(algo.getShortestPathTo(v2));

    }
}
