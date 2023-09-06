package lesson17.task2;

import java.util.function.Function;

public class ConvertTypes {

    public static void main(String[] args) {

        // write a function that will convert dog into cat
        Dog dog = new Dog(3, "Black");

        Function<Dog, Cat> convert = x -> new Cat(x.getAge(), x.getColor());

        Cat cat = convert.apply(dog);
        System.out.println(cat.getAge()); // 3
        System.out.println(cat.getColor()); // Black
    }
}
