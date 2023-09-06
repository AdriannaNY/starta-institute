package lesson25.task2;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceTest {

    @BeforeClass
    public static void init() {
        Student student1 = new Student("Ada", 20, Degree.BACHELOR);
        Student student2 = new Student("Inessa", 30, Degree.BACHELOR);
        Student student3 = new Student("David", 30, Degree.MASTER);
        Student student4 = new Student("Max", 40, Degree.MASTER);
    }
    @Test
    public void getAllStudentsTest() {
        assertNotNull(StudentService.getAllStudents());
    }
    @Test
    public void getNumberOfStudentsTest() {
        int expected = 4;
        int actual = StudentService.getNumberOfStudents();
        assertEquals(expected, actual);
    }
    @Test
    public void getStudentsByDegreeTest() {
        int expected = 2;
        int actual = StudentService.getStudentsByDegree(Degree.BACHELOR);
        assertEquals(expected, actual);
    }
    @Test
    public void getAvgAgeTest() {
        int expected = 30;
        int actual = StudentService.getAvgAge();
        assertEquals(expected, actual);
    }
    @Test
    public void getAvgAgeByDegreeTest() {
        int expected = 25;
        int actual = StudentService.getAvgAgeByDegree(Degree.BACHELOR);
        assertEquals(expected, actual);
    }
    @Test
    public void getListStudentsByDegreeTest() {
        assertNotNull(StudentService.getListStudentsByDegree(Degree.BACHELOR));
    }

}