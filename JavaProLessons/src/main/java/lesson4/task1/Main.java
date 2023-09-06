package lesson4.task1;

public class Main {

    public static void main(String[] args) {
        int value = 7;
        Person person = new Person("Max");
        System.out.println(value);
        System.out.println(person.getName());
        System.out.println(person.hashCode()); //hashcode
        System.out.println(person.toString());
        //toString method to write not necessary because method println() already have it by default


        // Вызов перегруженных методов:
        value = changeValue(value);
        changeValue(person);
        System.out.println("After called methods:");
        System.out.println(value);
        System.out.println(person.getName());
        System.out.println(person.hashCode()); //hashcode is different because changed name, had override hashcode
        System.out.println(person.toString()); //show memory address of object, reference
    }

    //Polymorphism: Overloading method
    //Polymorphism of time of compilation - уже на этапе компиляции понимаем, какой будет вызван метод
    public static int changeValue(int value) {      //Polymorphism: Overloading method
        value++;
        return value; //in method Main  - not the same variable value
    }  //область видимости только внутри метода
    public  static  void changeValue(Person person) {      //Polymorphism: Overloading method
        person.setName("John");
    }   //in method Main - not the same variable person
        //область видимости только внутри метода



}
