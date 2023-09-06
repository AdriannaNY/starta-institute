package lesson14.task1;

public class Utils {
    public static void printGraph (Graph graph) {
        int source = 0;
        int size = graph.getList().size();

        if(source < size) {
            do {
                for (int dest : graph.getList().get(source)) {
                    System.out.print("[" + source + " -> " + dest + "]");
                }
                System.out.println();
                source++;
            } while (source < size);
        }
    }

}
