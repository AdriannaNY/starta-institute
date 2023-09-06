package lesson19.task1;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {

    public static void main(String[] args) {

        // Output in List all elements, except "b"

        String[][] words = {{"a", "b", "c"},
                            {"d", "e", "f"},
                            {"g", "h", "i", "j"}};

        List<String> result = Stream.of(words)
                              .flatMap(x -> Stream.of(x))
                              .filter(x -> !"b".equals(x))
                              .collect(Collectors.toList());

        System.out.println(result); // [a, c, d, e, f, g, h, i, j]

    }
}
