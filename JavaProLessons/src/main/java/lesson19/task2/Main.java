package lesson19.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student = new Student(1, "Bob");
        Student student1 = new Student(2, "Rob");
        Student student2 = new Student(3, "John");

        student.addBook("Java basic");
        student.addBook("Java pro");
        student.addBook("Spring");
        student.addBook("Python");

        student1.addBook("HTML");
        student1.addBook("CSS");
        student1.addBook("JavaScript");
        student1.addBook("Spring");

        student2.addBook("Python");
        student2.addBook("C++");
        student2.addBook("C#");

        students.add(student);
        students.add(student1);
        students.add(student2);

        // Output list of all books, that all students had read
        // Without substring "Java"
        // to avoid duplicates we can use distinct or create Set

        Set<String> books = students.stream() // stream of students
                .map(x -> x.getBooks()) // stream of books Set<String>, T -> R
                .flatMap(x -> x.stream()) // stream of books
                .filter(x -> !x.contains("Java")) // filtered books
                .collect(Collectors.toSet()); // Set of books

        System.out.println(books); // [C#, CSS, C++, HTML, Spring, Python]

    }
}
