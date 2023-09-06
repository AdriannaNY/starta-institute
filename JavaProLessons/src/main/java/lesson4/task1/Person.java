package lesson4.task1;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {  //Constructor
        System.out.println("Constructor - called when creating an object");
        this.name = name;
    }  //in our example Constructor called 1 time -> we create only 1 object
       //and after changing name - we have same object just with another name

    public String getName() {  //Getters and Setters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(name, person.name);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
