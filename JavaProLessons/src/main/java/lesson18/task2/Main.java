package lesson18.task2;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("10", "20", "30", "10", "100", "50");
        List<String> listCombo = Arrays.asList("10", "Б", "20", "30", "a", "10", "B", "100", "50", "A");

        String result1 = list.stream().reduce((x1, x2) -> x1 + x2).orElse("");
        System.out.println("Result 1 - " + result1); // 1020301010050 = concatination

        String result2 = list.stream().reduce((x1, x2) ->
                String.valueOf(Integer.parseInt(x1) + Integer.parseInt(x2))).orElse("");
        System.out.println("Result 2 - " + result2); // 220 = math sum

        System.out.println("Start list:\n" + list); // [10, 20, 30, 10, 100, 50]
        System.out.println("Start listCombo:\n" + listCombo); // [10, Б, 20, 30, a, 10, B, 100, 50, A]

        // Find count of elements "10"
        long count = list.stream().filter(x -> x.equals("10")).count();
        System.out.println("Method count: " + count); // 2

        // Find count of elements with substring "10"
        count = list.stream().filter(x -> x.contains("10")).count();
        System.out.println("Method contains: " + count); // 3

        // Sort alphabetically
        List<String> resultList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Method sorted as with Strings: " + resultList); // [10, 10, 100, 20, 30, 50] = Strings
        resultList = listCombo.stream().sorted().collect(Collectors.toList());
        System.out.println("Method sorted as with Strings: " + resultList); // [10, 10, 100, 20, 30, 50, A, B, a, Б]

        // Sort Strings as int numbers
        resultList = list.stream().sorted((x1, x2) -> Integer.parseInt(x1) - Integer.parseInt(x2)).collect(Collectors.toList());
        // Comparator inside sorted method
        System.out.println("Method sorted as with numbers: " + resultList); // [10, 10, 20, 30, 50, 100]
        // resultList = list.stream().sorted(Comparator.comparingInt(Integer::parseInt)).collect(Collectors.toList());
        // same result, Comparator replaced with method reference, but can't convert output as below

        // Convert result
        resultList = list.stream().sorted((x1, x2) -> Integer.parseInt(x2) - Integer.parseInt(x1)).collect(Collectors.toList());
        System.out.println("Method sorted converted as with numbers: " + resultList); // [100, 50, 30, 20, 10, 10]

        // Sort with limit output of elements
        resultList = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("Sort with limit of 3 elems: " + resultList); // [10, 10, 100]

        // Sort with skipping elements (from head)
        resultList = list.stream().sorted().skip(2).collect(Collectors.toList());
        System.out.println("Sort with skipping first 2 elems: " + resultList); // [100, 20, 30, 50]

        // Distinct output (without dublicates)
        resultList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct output: " + resultList); // [10, 20, 30, 100, 50]

        // Peek method, void Peek(Consumer) = void, not return = Intermediate method
        System.out.println("Result of output Peek method:");
        // resultList = list.stream().peek(x -> System.out.print(x + " hello ")).collect(Collectors.toList());
        list.stream().peek(x -> System.out.print(x + " hello ")).collect(Collectors.toList()); // same
        // 10 hello 20 hello 30 hello 10 hello 100 hello 50 hello
        System.out.println();
        System.out.println("Our start list didn't change: " + list); // [10, 20, 30, 10, 100, 50]
        System.out.println("Our result list didn't change: " + resultList); // [10, 20, 30, 10, 100, 50]
        // [10, 20, 30, 10, 100, 50]

        // Map method, Map(Function)
        resultList = list.stream().map(x -> x + " hello").collect(Collectors.toList());
        System.out.println("Map method changed elements in stream: " + resultList);
        // [10 hello, 20 hello, 30 hello, 10 hello, 100 hello, 50 hello]

        // forEach method, void forEach(Consumer) = Terminal method
        System.out.println("Result output of forEach method:");
        list.stream().forEach(x -> System.out.print(x + " hello "));
        // 10 hello 20 hello 30 hello 10 hello 100 hello 50 hello
        System.out.println();

        // Find max / min number
        List<Integer> integers = Arrays.asList(1, 5, 7, 8, 10);
        int max = integers.stream().max((x1, x2) -> x1 - x2).get();
        // if collection is empty - get terminal method can provocate error
        System.out.println("Max number with max method: " + max); // 10
        max = integers.stream().min((x1, x2) -> x2 - x1).orElse(-1);
        System.out.println("Max number with min method: " + max); // 10
        int min = integers.stream().max((x1, x2) -> x2 - x1).orElse(0);
        System.out.println("Min number with max method: " + min); // 1
        min = integers.stream().min((x1, x2) -> x1 - x2).get();
        System.out.println("Min number with min method: " + min); // 1



    }
}
