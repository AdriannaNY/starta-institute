package task2;

import java.util.List;

public class MyListArray {
    private String[] list = new String[10];   //create array of Strings with length 10
    private int size = 0;

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // same method without index
    public void addToArray(String str) {
        list[size++] = str;
    }
}
