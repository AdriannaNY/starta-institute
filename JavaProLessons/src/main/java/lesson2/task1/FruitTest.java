package lesson2.task1;

public class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();   //object
        fruit.color = "yellow";   //this variable has his own color for this object
        System.out.println(fruit.color);
        fruit.printInfo();   //reusability

        Ananas ananas = new Ananas();   //object of Subclass
        ananas.color = "brown";   //reusability
        System.out.println(ananas.color);   //this variable has his own color for this object
        ananas.printInfo();   //reusability
        //use same method printInfo(), but in this case result - another like we wrote in Override method

        System.out.println("Create fruit");
        Fruit fruit1 = new Fruit();   //при создании обьекта fruit1 у нас вызывается конструктор Fruit
        System.out.println("1. Create ananas");
        Ananas ananas1 = new Ananas();   //при создании обьекта ananas1 у нас вызывается дефолтный конструктор Fruit
        // and затем дефолтный конструктор Ananas
        // так как при создании обьекта наследника - вызывается всегда конструктор родителя, а потом - наследника
        // --> 2 constructors for creating 1 object
        System.out.println("2. Create ananas with color");
        Ananas ananas2 = new Ananas("Brown");
        System.out.println("3. Create ananas with color");
        Ananas ananas3 = new Ananas(3,"Green");
    }
}
