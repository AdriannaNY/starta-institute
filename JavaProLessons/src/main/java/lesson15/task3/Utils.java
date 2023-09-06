package lesson15.task3;

public class Utils {
    public static void printGraph(Graph graph) {
        int source = 0;
        int size = graph.getAdjacencyList().size();

        if (source < size) {
            do {
                for (Node dest : graph.getAdjacencyList().get(source)) {
                    System.out.print("[" + source + " —> " + dest + "]");
                }
                System.out.println();
                source++;
            } while (source < size);
        }
    }
}
