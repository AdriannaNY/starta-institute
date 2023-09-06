package lesson16.task1;

import java.util.Objects;

public class Student {

    private String name;
    private int age;
    private int course;
    private double averageRate;
    private Gender gender;

    public Student(String name, int age, int course, double averageRate, Gender gender) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.averageRate = averageRate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }


    public double getAverageRate() {
        return averageRate;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Double.compare(student.averageRate, averageRate) == 0 && Objects.equals(name, student.name) && gender == student.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, course, averageRate, gender);
    }

    @Override
    public String toString() {
        return String.format("Student: name - %s, age - %d, gender - %s, course - %d, average rate - %.2f",
                name, age, gender.getDescription(), course, averageRate);
    }
}
