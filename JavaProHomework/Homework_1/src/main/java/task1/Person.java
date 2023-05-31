package task1;

public class Person {
    private String fullName;
    private int age;

    void move() {
        System.out.println(fullName + " идёт");
    }
    void talk () {
        System.out.println(fullName + " говорит");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public Person(){}
}
