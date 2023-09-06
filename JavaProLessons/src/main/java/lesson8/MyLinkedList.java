package lesson8;

import java.util.Iterator;

//================= ВНЕШНИЙ КЛАСС ================
public class MyLinkedList implements Iterable<String> {    //внешний класс имеет доступ к переменным своего внутреннего класса, несмотря на то, что они приватные, поэтому геттеры сеттеры не нужны
    // LinkedList имеет свойства и листа List и очереди Deque, так как реализует эти 2 интерфейса
    // this class implements interface Iterable for working with for-each loop --> must make realisation of method Iterator (override iterator)
    // --> must write Iterator (write own iterator) --> class MyIterator must implement interface Iterator, because it must return Iterator (object new MyIterator)

    //============ ОДНОНАПРАВЛЕННЫЙ (односвязный) СПИСОК ===============================================
    //============ имеет размер и ссылку на свой первый узел, знает только, где его первый узел=========

    //=======fields of class:==========
    private int size = 0;
    private Node first;
    // private Node last;   //двунаправленный список имеет еще и last - знает, где у него не только первый, но и где последний элемент

    //=======after fields - methods:============

//          private void test() {
//        Node node = new Node("Test", null);
//           //Почему нам не нужны геттеры и сеттеры.
//           //Мы имеем прямой доступ к приватным полям внутреннего класса.
//        node.data = "";
//    }

    //==========================INTERESTING METHOD CLEAR() =======================
    public void clear() {   //clear list
        size = 0;
        first = null;   //if first = null --> no link for next --> chain is destroyed --> garbage collector will clear it from memory
    }

    public boolean isEmpty() {   //first, we must check if our list empty or not, return true or false
        return size == 0;
    }

    @Override
    public String toString() {
        if (isEmpty()) {  // if empty - we will see in console - []
            return "[]";
        }
        //   AAA BBB CCC  - we need like this:  [AAA, BBB, CCC]
        StringBuilder builder = new StringBuilder("[");   // StringBuilder = "changing string", put in constructor "["
        Node current = first;
        while (current != null) {  // until we didn't reach end of list
            builder.append(current.data).append(", "); // [AAA, BBB, CCC, ]
            current = current.next;
        }
        builder.setLength(builder.length() - 2);   // delete ", " after last element [AAA, BBB, CCC,
        builder.append("]"); // [AAA, BBB, CCC]  add closing symbol "]"
        return builder.toString();  // used toString because builder is type of StringBuilder but we must return String in our override method
    }

    public void add(String stringData) {   //method add nodes to our list, public - because will call from another class, void - nothing to return
        if (isEmpty()) {  //if empty - we add first node (first node = last node), else - jump to the end and create new node = last node
            first = new Node(stringData, null); //is list is empty we add node to first element, link to next node - null, data - variable stringData of String type
        } else { // if one node in list - that means that it first, and it last
            Node current = first;  // object of Node type current = current node in our list (every node of list (object of class Node) have data - variable data of class Node and link for next node - variable next)
            for (int i = 0; i < size - 1; i++) {  //if size = 1 (1element node in list) --> 0 jumps - we dont need jumps to reach last element for adding node, if size = 2 --> we need 1 jump etc...
                current = current.next;  // now - current node is 2 element, then on 2d jump - is 3d etc...
                //the goal of for-loop - jump to the end of list to last node, and it will - current node
            }
            Node newNode = new Node(stringData, null);   //last node(newNode) don't have link to next = null
            current.next = newNode;  // after adding new node --> last node have link to this next(last node) node
        }
        size++;  // after adding every 1 node --> size + 1
    }
    //=== P.S. === --null--1(0 jumps)--2(1jump)--3(2 jumps)--4--5--6--7(6 jumps)--null-- ======jumps to last node of list = size(7) - 1=========


    public int size() {
        return size;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException();   //!!!!!! if index not correct - throw exception
        }
        Node current = first;
        for (int i = 0; i < index; i++) {   // if index = 0 --> will not jump, if 1 --> we will jump 1 time, etc...===== jumps = index
            current = current.next;
        }
        return current.data;
    }

    @Override
    public Iterator<String> iterator() {  //our class MyLinkedList must have it's own iterator for working with for-each loop
        return new MyIterator();  // object of class MyIterator
    }

    //=============== ВЛОЖЕННЫЙ КЛАСС MyIterator{} =======Realisation of our own iterator:=========
    public class MyIterator implements Iterator<String> {
        // in class MyIterator must implement interface Iterator --> must implement methods hasNext() and next()

        private int cursor = 0;
        private Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;  //if current = null that means that it's the last node and don't have next
        }

        @Override
        public String next() {
            String result = current.data;
            current = current.next;
            return result;
        }


    }


    //=============== ВЛОЖЕННЫЙ КЛАСС Node{} (Node of LinkedList) ================
    private class Node {   //внутренний класс или вложенный (так как узел(нод) связанного списка LinkedList = обьект, он должен иметь класс)
        private String data;   //данные узла
        private Node next;    //односвязный список узла содержит ссылку на следующий узел, variable next has type of class Node

        // private Node previous;   // двусвязный список имеет ссылку не только на следующий, но и на предыдущий узел (нод)
        public Node(String data, Node next) {   //Constructor for creating nodes with data and link to next node
            this.data = data;
            this.next = next;
        }
    }


}
