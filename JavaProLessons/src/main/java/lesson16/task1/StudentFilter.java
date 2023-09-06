package lesson16.task1;

public class StudentFilter implements Filter{
    @Override
    public boolean test(Student student) {
        return student.getCourse() > 1 && student.getAverageRate() > 4.5;
    }
}
