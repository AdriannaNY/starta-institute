package lesson16.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // List<Person>, boolean isHealthy, Integer id (if we have task where must use id in collections - we can't use just int type - we must use Integer type
        // Output healthy people with even id, if isHealthy - true
        // Output not healthy people with not even id, if isHealthy - false
        // printed people must not older that we decided

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", 1, true, 40));
        people.add(new Person("Adrianna", 14, true, 34));
        people.add(new Person("Amber", 2, true, 26));
        people.add(new Person("Alexandro", 4, true, 24));
        people.add(new Person("Susi", 122, true, 34));
        people.add(new Person("Antonio", 124, true, 35));
        people.add(new Person("Max", 144, false, 30));
        people.add(new Person("Anna", 13, false, 29));
        people.add(new Person("Vlad", 178, false, 20));
        people.add(new Person("Oleg", 123, false, 21));
        people.add(new Person("Martin", 15, false, 24));
        people.add(new Person("Nicolas", 177, false, 37));

        CustomFilter customFilter = new CustomFilter();

        System.out.println("1. First output:");
        customFilter.print(people, true, 35);
        System.out.println();

        System.out.println("2. Second output:");
        customFilter.print(people, false, 37);
        System.out.println();

        System.out.println("3. First output using anonim class:");
        PersonFilter filter2 = new PersonFilter() {
            @Override
            public void print(List<Person> people, boolean isHealthy, int age) {
                for (Person person : people) {
                    if (isHealthy) {
                        if(person.getId() % 2 == 0 && person.getAge() <= age && person.isHealthy()) {
                            System.out.println(person);
                        }
                    } else {
                        if (!person.isHealthy() && person.getId() % 2 != 0 && person.getAge() <= age) {
                            System.out.println(person);
                        }
                    }
                }
            }
        };
        filter2.print(people, true, 35);
        System.out.println();

        System.out.println("4. Second output using lambda expression:");
        PersonFilter filter3 = (x, y, z) -> {
            for (Person person : x) {
                if (y) {
                    if(person.getId() % 2 == 0 && person.getAge() <= z && person.isHealthy()) {
                        System.out.println(person);
                    }
                } else {
                    if (!person.isHealthy() && person.getId() % 2 != 0 && person.getAge() <= z) {
                        System.out.println(person);
                    }
                }
            }
        };
        filter3.print(people, false, 37);

    }
}
