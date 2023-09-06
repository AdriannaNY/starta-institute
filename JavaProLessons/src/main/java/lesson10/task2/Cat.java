package lesson10.task2;

import java.util.Objects;

public class Cat implements Comparable<Cat> { // default sorting
    private int age;
    private String color;
    private double weight;

    public Cat(int age, String color, double weight) {
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }


    //=============== our own override of method equals() =====================

    // this - link on those object where we call method, in our example this = cat1
    // obj - what we put inside of method equals, in our example obj = cat1, obj = null - compare object with itself and with null
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {    // check if cat1.equals(cat1) - if object compare with itself
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (!this.getClass().equals(obj.getClass())) {  // compare if objects from same class
//            return false;
//        }

          // obj привели к классу Cat
//        Cat cat = (Cat) obj; // we can do it because objects are from same class after check previously
//
//        return this.age == cat.age && Objects.equals(this.color, cat.color) && Double.compare(this.weight, cat.weight) == 0;
//        // here we check if all characteristics of objects are equal each other
//    }


    //============== java-generated override of method equals() + hashCode() =====================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, weight);
    }

    @Override
    public int compareTo(Cat o) {
        return Double.compare(this.getWeight(), o.getWeight()); // sort by weight
    }

    @Override
    public String toString() {
        // Cat: age - 5, color - Black, weight - 5.17
       return String.format("Cat : age - %d, color - %s, weight - %.2f.", age, color, weight);
    }

}



