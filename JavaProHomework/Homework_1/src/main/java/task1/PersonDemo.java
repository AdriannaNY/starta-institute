package task1;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("Katya",34);
        person2.move();
        person2.talk();
    }
}
