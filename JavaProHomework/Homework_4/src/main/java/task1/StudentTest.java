package task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student("Ekaterina_course_", "Dubrova_", 7, 4.75);
        Student student2 = new Student("Anatoly_course_", "Vlasov_", 2, 3.85);
        Student student3 = new Student("Maximillian_course_", "Adamovich_", 3, 4.35);
        Student student4 = new Student("Sara_course_", "Frunk_", 1, 3.25);
        Student student5 = new Student("Tom_course_", "Ford_", 5, 4.45);

        List<String> students = new ArrayList<>();

        students.add(String.valueOf(student1.getSurname() + student1.getName() + student1.getCourseNumber()));
        students.add(String.valueOf(student2.getSurname() + student2.getName() + student2.getCourseNumber()));
        students.add(String.valueOf(student3.getSurname() + student3.getName() + student3.getCourseNumber()));
        students.add(String.valueOf(student4.getSurname() + student4.getName() + student4.getCourseNumber()));
        students.add(String.valueOf(student5.getSurname() + student5.getName() + student5.getCourseNumber()));

        System.out.println("1. List of students:");
        System.out.println(students);
        System.out.println();

        student1.removeByCourseNumber(students);
        System.out.println("2. List of students with number of course, started from 3:" );
        System.out.println(students);
        System.out.println();

        student1.removeByName(students, "Tom");
        System.out.println("3. List of students, without student, excluded by name:");
        System.out.println(students);
    }

}
