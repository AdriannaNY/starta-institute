package lesson1.task1;

public class Dog {
    //==========================Fields=Parameters=Variables===========================

    //By default, should be private modifier, to call from another class should use methods:
    // Getter (accessor, because gives access to field) / Setter (mutator, because change variable's name)

    private String breed; //by default this type will - null
    //String is a class of Java library
    private double age; //by default this type will - 0.0
    //with public modifier we can call this variable from another package task 2, for example
    //without modifier - default, so we cant call from another package
    //protected - same as default, but we can use it in naslednikah
    //with private modifier we cant call even from another class in same package
    private String color; //fields = parameters

    //====================================Constructors======================================
    public Dog(String breed, double age, String color) {//Constructor with all fields = parameters
        if (age<0) {  //=====================checking=========================
            System.out.println("Age cant be less then 0");
            age = 0;
        }
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    public Dog(String breed, String color) { //Constructor with 2 fields
        this.breed = breed;
        this.color = color;
    }
    public Dog() { //Constructor without any parameters so we can create object without any fields
    }

    //=============================Getter / Setter====================================
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        if (age<0) {  ///=====================checking=========================
            System.out.println("Age cant be less then 0");
            age = 0;
        }
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //=================================Methods=====================================
    void bark() { //methods void do not return nothing
        System.out.println("Gav!");
    }
    void sleep() {
        System.out.println("Want sleep");
    }
    void hungry() {
        System.out.println("Want to eat");
    }
}
