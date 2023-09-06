package lesson15.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private List<List<Node>> adjacencyList = new ArrayList<>();

    public List<List<Node>> getAdjacencyList() {
        return adjacencyList;
    }

    public Graph(List<Edge> edges) {
        // find the vertex with the maximum number
        int vertex = 0;
        for (Edge edge : edges) {
            vertex = Integer.max(vertex, Integer.max(edge.getSource(), edge.getDestination()));
        }

        // allocate memory for the adjacency list
        for (int i = 0; i <= vertex; i++) {
            adjacencyList.add(i, new LinkedList<>());
        }

        // adding edges to directed graph
        for (Edge current : edges) {
            // allocate a new node in the adjacency list from source to destination
            adjacencyList.get(current.getSource()).add(new Node(current.getDestination(), current.getWeight()));

            // for undirected Graph
            // allocate a new node in the adjacency list from destination to source
            // adjList.get(current.dest).add(new Node(current.getSource(), current.getWeight()));
        }
    }
}
