package lesson16.task1;

import lesson2.task2.Animals;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Boris", 25, 3, 4.76, Gender.MALE));
        students.add(new Student("Adri", 34, 4, 4.96, Gender.FEMALE));
        students.add(new Student("Gleb", 29, 2, 3.86, Gender.MALE));
        students.add(new Student("Lizy", 19, 1, 4.46, Gender.FEMALE));
        students.add(new Student("Nataly", 28, 4, 4.76, Gender.FEMALE));
        students.add(new Student("Alex", 35, 2, 3.76, Gender.MALE));
        students.add(new Student("Vlad", 45, 5, 4.66, Gender.MALE));

        System.out.println("List of all students:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        // Output filtered students with course > 1 and averageRate > 4.5 in class StudentUtils (method printStudents())
        // (Before must create class StudentFilter that implements FunctionalInterface Filter)
        System.out.println("Filtered students using filter StudentFilter");
        StudentUtils.printStudents(students, new StudentFilter());
        System.out.println();

        // Output females with char in name 'A' or 'a'
        System.out.println("Filtered students using filter StudentSecondFilter");
        StudentUtils.printStudents(students, new StudentSecondFilter());
        System.out.println();

        // Students age less 30 and rate less 4.5
        System.out.println("Filtered students using anonim class"); // fine, when we need it 1 time in code
        // Anonim class can be created based on Interface or Abstract Class (where not allowed creating objects)
        StudentUtils.printStudents(students, new Filter() { // anonim (noname) class(= 'object' of Interface Filter) like StudentFilter / StudentSecondFilter
            @Override
            public boolean test(Student student) {
                return student.getAge() < 30 && student.getAverageRate() < 4.5;
            }
        });
        System.out.println();

        // Creating anonim class based on abstract class Animals
//        Animals animals = new Animals() {
//            @Override
//            public void live() {
//                // realisation of anonim class
//            }
//        }

        System.out.println("Filtered students using second anonim class");
        StudentUtils.printStudents(students, new Filter() { // grey color offer to replace with lambda
            @Override
            public boolean test(Student student) {
                return student.getAge() > 20 && student.getGender().equals(Gender.FEMALE);
            }
        });
        System.out.println();

        // Students 4 course with length name < 6 using Lambda (short anonim class)
        // Lambda work only with Functional Interface
        System.out.println("Filtered students using lambda");
        StudentUtils.printStudents(students, x -> x.getCourse() == 4 && x.getName().length() < 6); // body of method boolean test(Student student)
        // x - variable of method test (method of functional interface Filter) = student (Student student)
        // after -> we write realisation of method test, body of the method
        System.out.println();
        System.out.println("Same filter using anonim class");
        StudentUtils.printStudents(students, new Filter() {
            @Override
            public boolean test(Student student) {
                return student.getCourse() == 4 && student.getName().length() < 6;
            }
        });
        System.out.println();

    }
}
