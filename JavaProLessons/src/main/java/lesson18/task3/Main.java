package lesson18.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<List<String>> listOfLists = new ArrayList<>();
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("D", "E", "F");
        List<String> list3 = Arrays.asList("G", "H", "I");

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        System.out.println("List of lists: " + listOfLists); // [[A, B, C], [D, E, F], [G, H, I]]

        // listOfLists -> 1 list,  using flatMap method
        List<String> result = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println("List, created from list of lists, using flatMap: " + result); // [A, B, C, D, E, F, G, H, I]

    }
}
