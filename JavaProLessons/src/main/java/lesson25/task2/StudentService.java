package lesson25.task2;

import java.util.*;

//                Методы сервиса должны:
//                А. Возвращать список всех студентов.+
//                Б. Возвращать количество студентов.+
//                В. Возвращать количество студентов конкретной учебной степени (количество бакалавров или количество магистров).+
//                Г. Возвращать средний возраст всех студентов.+
//                Д. Возвращать средний возраст студентов конкретной учебной степени.+
//                Е. Возвращать список студентов конкретной учебной степени.+
public class StudentService {

    private static int id;   // 0 by default
    private static Map<Integer, Student> studentMap = new HashMap<>();

    public static int getId() {
        return ++id;
    }

    public static void addStudent(Student student){
        studentMap.put(student.getID(), student);
    }

    public static Map<Integer, Student> getAllStudents() {
        return studentMap;
    }

    public static int getNumberOfStudents() {
        return studentMap.size();
    }

    public static int getStudentsByDegree(Degree degree) {
        return (int)studentMap.entrySet().stream()
                .filter(x -> x.getValue().getDegree().equals(degree))
                .count();
    }

    public static int getAvgAge() {
        int commonAge = 0;
        for (Student student : studentMap.values()) {
            commonAge += student.getAge();
        }
        return commonAge / studentMap.size();
    }

    public static int getAvgAgeByDegree(Degree degree) {
        int commonAge = 0;
        int count = 0;
        for (Student student : studentMap.values()) {
            if (degree == student.getDegree()) {
                commonAge += student.getAge();
                count++;
            }
        }
            return commonAge / count;
    }

    // same method using streams
    public static int getAvgAgeByDegreeLambda(Degree degree) {
        int commonAge = studentMap.values().stream()
                .filter(student -> student.getDegree().equals(degree))
                .mapToInt(Student::getAge)
//                .reduce((x,y) -> x.getValue().getAge() + y.getValue().getAge())
                .sum();
        int count = (int)studentMap.values().stream()
                .filter(student -> student.getDegree().equals(degree))
                .count();
        return commonAge / count;
    }

    public static List<Student> getListStudentsByDegree(Degree degree) {
        List<Student> list = new ArrayList<>();
        for (Student student : studentMap.values()) {
            if (degree == student.getDegree()) {
                list.add(student);
            }
        }
        return list;
            }

    }


