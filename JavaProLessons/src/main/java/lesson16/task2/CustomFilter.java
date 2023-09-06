package lesson16.task2;

import java.util.List;

public class CustomFilter implements PersonFilter{
    @Override
    public void print(List<Person> people, boolean isHealthy, int age) {
        // List<Person>, boolean isHealthy, Integer id (if we have task where must use id in collections - we can't use just int type - we must use Integer type
        // Output healthy people with even id, if isHealthy - true
        // Output not healthy people with not even id, if isHealthy - false
        // printed people must not older that we decided

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
}
