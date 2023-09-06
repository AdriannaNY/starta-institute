package lesson14.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {

    private List<List<Integer>> list = new ArrayList<>();

    public Graph(List<Edge> edges) {   // constructor
        int vertex = 0;
        int sourceMax = 0; // source = index
        int destinationMax = 0; // destination = value
        for (int i = 0; i < edges.size(); i++) {
            int tmp = edges.get(i).getSource();
            int tmp2 = edges.get(i).getDestination();
            if (tmp > sourceMax) {
                sourceMax = tmp;
            }
            if (tmp2 > destinationMax) {
                destinationMax = tmp2;
            }
        }
        if (sourceMax > destinationMax) {
            vertex = sourceMax;
        } else {
            vertex = destinationMax; // size of our arrayList must be = vertex = 4
        }

        // int vertex = 0;
        // for (Edge edge : edges) {
        // vertex = Integer.max(vertex, Integer.max(edge.getSource(), edge.getDestination()));
        // {

        for (int i = 0; i <= vertex ; i++) {
            list.add(i, new LinkedList<>());
        }

        for (Edge eva : edges) {
            int index = eva.getSource();
            List<Integer> innerList = list.get(index);
            innerList.add(eva.getDestination());
            // list.get(index).add(eva.getDestination()); // short variant
        }
    }

    public List<List<Integer>> getList() {
        return list;
    }
}
