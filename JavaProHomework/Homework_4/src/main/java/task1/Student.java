package task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private int courseNumber;
    private double GPA;

    public Student(String name, String surname, int courseNumber, double GPA) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getCourseNumber() {
        return courseNumber;
    }

    public void removeByCourseNumber(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String currentElem = iterator.next();
            if (currentElem.contains("1")) {
                iterator.remove();
            }
            if (currentElem.contains("2")) {
                iterator.remove();
            }
        }
    }

    public void removeByName(List<String> list, String name) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String currentElem = iterator.next();
            if (currentElem.contains(name)) {
                iterator.remove();
            }
        }
    }

    }



