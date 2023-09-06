package lesson2.task1;

public class Fruit {
    protected String color;
    protected int size;

    public Fruit() {
        System.out.println("Вызван дефолтный конструктор Fruit без параметров");   //default constructor
        // вызывается по умолчанию, его не обязательно прописывать. Но если имеются другие конструкторы, то
        // его нужно написать вручную
    }
    public Fruit(String color) {
        System.out.println("Вызван конструктор Fruit с цветом");
    }
    public Fruit(int size) {
        this.size = size;   // присвоится значение in protected int size
        System.out.println("Вызван конструктор Fruit с размером");
    }
    public Fruit(int size, String color) {
        System.out.println("Вызван конструктор Fruit с цветом и размером");
    }
    public void printInfo() {
        System.out.println("This is fruit");
    }
}
