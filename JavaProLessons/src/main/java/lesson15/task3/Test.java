package lesson15.task3;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1, 6));
        edges.add(new Edge(1, 2, 5));
        edges.add(new Edge(2, 0, 8));
        edges.add(new Edge(2, 1, 3));
        edges.add(new Edge(3, 2, 9));
        edges.add(new Edge(4, 5, 1));
        edges.add(new Edge(5, 4, 3));

        Graph graph = new Graph(edges);
        Utils.printGraph(graph);

    }
}
