package lesson6.task2;

public class MyListArrayTest {
    public static void main(String[] args) {
        MyListArray myListArray = new MyListArray();  //object of class MyListArray
        myListArray.add("Hello");
        myListArray.add("Adrianna");
        System.out.println();  // look in Debug   [Hello, Adrianna,...]

        myListArray.add("dear",1);  // add word dear instead of word Adrianna - mistake
        System.out.println();  // Debug   // [Hello, dear,...] Adrianna - disappeared - mistake
    }
}
