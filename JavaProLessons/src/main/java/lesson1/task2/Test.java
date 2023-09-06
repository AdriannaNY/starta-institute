package lesson1.task2;

import lesson1.task1.Cat; //import from another package
import lesson1.task1.Dog;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat(); //used class Cat from another package task1
        Dog dog = new Dog("Mops", "brown"); //used class Dog from another package task1
        Dog dog1 = new Dog();
        dog1.setAge(5);
        System.out.println(dog1.getAge());
    }
}
