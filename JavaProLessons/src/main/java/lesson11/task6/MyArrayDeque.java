package lesson11.task6;

public class MyArrayDeque implements MyDeque {

    private Integer[] elements;
    private int size;
    private int headIndex;
    private int tailIndex;
    private int defaultSize = 20;

    public MyArrayDeque() { // generate constructor - select none
        elements = new Integer[defaultSize];
        size = 0;
        headIndex = defaultSize/2;
        tailIndex = defaultSize/2;
    }

    @Override
    public void addToHead(Integer element) {
        if (isEmpty()) {
            elements[headIndex] = element;
        } else {
            elements[--headIndex] = element;
        }
        size++;
    }

    @Override
    public void addToTail(Integer element) {
        if (isEmpty()) {
            elements[tailIndex] = element;
        } else {
            elements[++tailIndex] = element;
        }
        size++;
    }

    @Override
    public Integer removeHead() {
        if (isEmpty()) { // prevent NullPointerException
            return null;
        }
        int removedElem = elements[headIndex];
        elements[headIndex] = null;
        headIndex++;
        size--;
        return removedElem;
    }

    @Override
    public Integer removeTail() {
        if (isEmpty()) { // prevent NullPointerException
            return null;
        }
        int removedElem = elements[tailIndex];
        elements[tailIndex] = null;
        tailIndex--;
        size--;
        return removedElem;
    }

    @Override
    public Integer peekHead() {
        return elements[headIndex];
    }

    @Override
    public Integer peekTail() {
        return elements[tailIndex];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Integer getByIndex(int index) {
        int current = headIndex + index;
        return elements[current];
    }

    @Override
    public boolean contains(Integer element) {
        if (isEmpty()) {
            return false;
        }
        for (int i=headIndex; i <= tailIndex; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = headIndex; i <= tailIndex; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length()-2);
        builder.append("]");
        return builder.toString();
    }
}
