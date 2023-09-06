package lesson10.task2;

import com.sun.source.doctree.SeeTree;

import java.util.Set;
import java.util.TreeSet;

public class CatTest {

    public static void main(String[] args) {
        Cat cat1 = new Cat(7, "Black", 3.65);
        Cat cat2 = new Cat(7, "Black", 3.65);

        boolean result = cat1 == cat2;
        System.out.println("Comparing objects using operator ==: " + result); // false because 2 different objects have different links

        result = cat1.equals(cat2);
        System.out.println("Comparing objects using override method equals(): " + result); // false because we must override method equals in class Cat
        // after we override method equals - result will true;

        System.out.println(); //===================================================================================

        Set<Cat> cats = new TreeSet<>(); // will call method - compareTo() from class Cat, witch sort by weight = sort by default
        cats.add(new Cat(5, "Black", 6.08));
        cats.add(new Cat(4, "White", 2.87));
        cats.add(new Cat(1, "Brown", 1.37));
        cats.add(new Cat(2, "Colorful", 2.55));
        cats.add(new Cat(5, "Maroon", 3.34));
        cats.add(new Cat(7, "Tiger", 6.01));
        cats.add(new Cat(3, "Orange", 3.33));
        System.out.println("Default sort by weight, using compareTo() method of class Cat witch implements interface Comparable:");
        for (Cat cat : cats) {
            System.out.println(cat); // for normal print view / debug view, we must override method toString()
        }

        System.out.println(); //=============================================================

        // if we need sort by another parameter - use Comparator with method compare() with our realisation:
        Set<Cat> cats1 = new TreeSet<>(new CatComparator());
        cats1.addAll(cats);
        System.out.println("Sort, using compare() method of class CatComparator witch implements interface Comparator with our realisation:");
        for (Cat cat : cats1) {
            System.out.println(cat); // for normal print view / debug view, we must override method toString()
        }





    }
}
