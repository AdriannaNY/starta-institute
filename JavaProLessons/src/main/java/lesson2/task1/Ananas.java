package lesson2.task1;

public class Ananas extends Fruit {    //inheritance, Subclass Ananas now have all methods and fields of Superclass Fruit

    public Ananas() {
        System.out.println("Вызван дефолтный конструктор Ananas без параметров");   //default constructor
    }
    public Ananas(String color) {
        super();   // по умолчанию вызывается конструктор родителя без параметров - default,
        // его не обязательно писать здесь, он вызывается компилятором и так по умолчанию
        this.color = color;
        System.out.println("Вызван конструктор Ananas с цветом");
    }
    public Ananas(int size, String color) {
        super(7);   // в данном случае по умолчанию не вызывается конструктор родителя без параметров - default,
        // а вызывается конструктор of superclass Fruit с указанными параметрами - size
        // присвоится значение in protected int size
        this.color = color;   // присвоится значение в String color of class Fruit
        System.out.println("Вызван конструктор Ananas с размером и цветом");
    }

    @Override
    public void printInfo() {
        System.out.println("This is pineapple");
    } // переопределили метод суперкласса
}
