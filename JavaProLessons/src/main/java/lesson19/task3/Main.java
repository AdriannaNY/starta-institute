package lesson19.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("New", 33.5));
        itemList.add(new Item("City", 14));
        itemList.add(new Item("Window", 13));
        itemList.add(new Item("Phone", 43));
        itemList.add(new Item("Milk", 15));
        itemList.add(new Item("Bun", 1));
        itemList.add(new Item("Table", 30));
        itemList.add(new Item("Sun", 11));
        itemList.add(new Item("Door", 14));
        itemList.add(new Item("Paper", 43));
        itemList.add(new Item("Phone", 31));

        // List of non-repeating items with price > 10

        List<String> items = itemList.stream() // stream objects Item
                .filter(x -> (x.getPrice()) > 10) // filtered by price
                .map(x -> x.getName()) // stream String, <Item> -> <String>
                .distinct() // unique names
                .collect(Collectors.toList());

        System.out.println(items); // [New, City, Window, Phone, Milk, Table, Sun, Door, Paper]

    }
}
