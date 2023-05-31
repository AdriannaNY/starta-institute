package task1;

import java.util.Iterator;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {

        //============================== Create list: ==================================================
        //==============================================================================================
        MyLinkedList list = new MyLinkedList();
        //============================ Call methods of our list: =======================================
        //==============================================================================================
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");
        list.add("FFFFF");
        list.add("GGG");

        System.out.println("Testing method get(index): ");
        System.out.println("get(0) - " + list.get(0));   // print in console node with index 0, used method get(int index) - AAA
        System.out.println("get(1) - " + list.get(1));   // print in console node with index 1, used method get(int index) - BBB
        System.out.println("get(2) - " + list.get(2));   // print in console node with index 2, used method get(int index) - CCC
        System.out.println("get(3) - " + list.get(3));   // print in console node with index 3, used method get(int index) - DDD
        System.out.println("get(4) - " + list.get(4));   // print in console node with index 4, used method get(int index) - EEE
        System.out.println("get(5) - " + list.get(5));   // print in console node with index 5, used method get(int index) - FFFFF
        System.out.println("get(6) - " + list.get(6));   // print in console node with index 6, used method get(int index) - GGG
        System.out.println();

        //================================= Block of Testing: ==========================================
        //==============================================================================================

        System.out.println("Size of our list is - " + list.size());
        System.out.println();


        //Print in console list using method toString();
        System.out.println("Print list using toString");  // override toString
        System.out.println(list);
        System.out.println();


        //Print in console list using for loop;
        System.out.println("Print list using for loop");
        for (int i = 0; i < list.size(); i++) {  //create methods get() and size()
            System.out.print(list.get(i) + " ");  // [AAA, BBB, CCC]
        }
        System.out.println();
        System.out.println();


        //Print in console list using for-each loop;
        System.out.println("Print list using for-each loop"); //our list can use for-each only if class MyLinkedList must implement interface Iterable
        for (String value : list) {   // must override iterator() method
            System.out.print(value + " ");  //for-each have inside iterator
        }
        System.out.println();
        System.out.println();


        //Print in console list using ListIterator;
        System.out.println("Print list using ListIterator");
        ListIterator<String> listIterator = list.iterator();  // our list and our own iterator, when we call method iterator(override iterator) from list, this method in override return object new MyIterator( class MyIterator - realisation of our own iterator)
        System.out.println(list);
//        while (listiterator.hasNext()) {
//            System.out.print(listiterator.next() + " ");
//        }
//        while (listIterator.hasPrevious()) {
//            System.out.print(listIterator.previous() + " ");
//        }

        while (listIterator.hasNext()) {
            String tmp = listIterator.next();
            if (tmp.equals("FFFFF")) {
                break;
            }
            System.out.println(tmp);  //iterator remember where it was stopped, so we can continue work with it:
        }
        System.out.println("--------------");
        while (listIterator.hasPrevious()) {
            String tmp2 = listIterator.previous();
            System.out.println(tmp2);
        }
        System.out.println();
        System.out.println();

        //Testing method clear(), that must clear our list and delete all nodes from our list
        list.clear();   // []
        System.out.println("After clearing: ");
        System.out.println(list);

    }
}

