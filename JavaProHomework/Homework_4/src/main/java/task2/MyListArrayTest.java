package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyListArrayTest {
    public static void main(String[] args) {
        MyListArray myListArray = new MyListArray();  //object of class MyListArray
        myListArray.addToArray("Hello");
        myListArray.addToArray("dear");
        myListArray.addToArray("Adrianna");
        myListArray.addToArray("I");
        myListArray.addToArray("love");
        myListArray.addToArray("programming");
        System.out.println(Arrays.toString(myListArray.getList()));

        List<String> myList = new ArrayList<>();
        addAllToList(myList, myListArray.getList());
        System.out.println(myList);

        myList.add("so much");
        myList.add(1, "my");
        List<String> myList2 = new ArrayList<>();
        myList2.add(0, "especially");
        myList2.add("Java");
        myList.addAll(myList2);
        System.out.println(myList);
        System.out.println(sumOfWords(myList2));

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList.contains("my"));
        System.out.println(myList.contains("My"));

        myList.set(7, "so much");
        myList.set(8, "and");
        System.out.println(myList);
        myList.remove(9);
        myList.remove(10);
        System.out.println(myList);
    }

    public static void addAllToList(List<String> numbers, String[] array) {
        for (String word : array) {
            numbers.add(word);
        }
    }

    private static int sumOfWords(List<String> words) {
        int length = 0;
        for (String value :
                words) {
            length += value.length();
        }
        return length;
    }

}
