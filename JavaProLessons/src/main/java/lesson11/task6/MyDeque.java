package lesson11.task6;

public interface MyDeque {
    void addToHead(Integer element);
    void addToTail(Integer element);
    Integer removeHead();
    Integer removeTail();
    Integer peekHead();
    Integer peekTail();
    boolean isEmpty();
    Integer getByIndex(int index);
    boolean contains(Integer element);
    int size();
}
