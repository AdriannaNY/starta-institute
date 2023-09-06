package lesson1.task1;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog(); //create object = examplar of class Dog without fields
        Dog dog2 = new Dog("Retriver", 3.3, "gold"); //using constructor with all fields
        Dog dog3 = new Dog("Dalmatine", "White with black points");
        dog1.bark(); //called method of class Dog
        dog1.setAge(2.5);
        dog2.setAge(-2);
        System.out.println(dog1.getAge()); //2.5
        System.out.println(dog1.getColor()); //null
        System.out.println(dog2); //link
        System.out.println(dog2.getBreed()); //Retriver
        System.out.println(dog2.getAge()); //if age<o checking from Setter
    }
}
