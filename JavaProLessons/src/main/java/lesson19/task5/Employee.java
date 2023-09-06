package lesson19.task5;

import java.util.Objects;

public class Employee {

    private String name, staff;
    private double salary;

    public Employee(String name, String staff, double salary) {
        this.name = name;
        this.staff = staff;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getStaff() {
        return staff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(staff, employee.staff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, staff, salary);
    }

    @Override
    public String toString() {
        return name + " " + staff + " " + salary;
    }
}
