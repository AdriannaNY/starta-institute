package lesson6.task2;

public class MyListArray {
    private String[] list = new String[10];   //create array of Strings with length 10
    private int size = 0;

    // method add value in array by index
    public void add(String str, int index) {   //if method called from object - we don't use word static in it
        if (size > index) {
            list[index] = str;
            size++;
        }
    }
    // same method without index
    public void add(String str) {
        list[size++] = str;
    }
}
