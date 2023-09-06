package lesson25.task2;

public class Student {

    private int ID;
    private String name;
    private int age;
    private Degree degree;

    public Student(String name, int age, Degree degree) {
        this.ID = StudentService.getId();
        this.name = name;
        this.age = age;
        this.degree = degree;
        StudentService.addStudent(this);
    }

    public Degree getDegree() {
        return degree;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
