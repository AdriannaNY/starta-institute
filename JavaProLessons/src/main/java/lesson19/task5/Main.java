package lesson19.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        0. Создать класс Employee
//        1. Вывести всех сотрудников без высшего руководителя
//        2. Сгруппировать сотрудников по должности
//        3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
//        4. Получить список сотрудников с зп > 1000
//        5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
//        6. Получить сотрудника с самой низкой зп
//        7. Получите сотрудников из всех отделов с максимальной зп


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aleks", "Developer", 1500));
        employees.add(new Employee("Thomas", "Manager", 680.50));
        employees.add(new Employee("Thea", "CEO", 2000));
        employees.add(new Employee("Mary", "Manager", 700));
        employees.add(new Employee("Ken", "Developer", 900));

//        1. Вывести всех сотрудников без высшего руководителя
        List<Employee> list1 = employees.stream()
                .filter(x -> !x.getStaff().equals("CEO"))
                .collect(Collectors.toList());

        System.out.println("1. " + list1);
        // 1. [Aleks Developer 1500.0, Thomas Manager 680.5, Mary Manager 700.0, Ken Developer 900.0]

//        2. Сгруппировать сотрудников по должности
        Map<String, List<Employee>> employeesByStaff = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStaff)); // (x -> x.getStaff())) = (Employee::getStaff))

        System.out.println("2. " + employeesByStaff);
        // 2. {Developer=[Aleks Developer 1500.0, Ken Developer 900.0], CEO=[Thea CEO 2000.0], Manager=[Thomas Manager 680.5, Mary Manager 700.0]}


//        3. Вычислить среднюю зарплату всех сотрудников (двумя способами)
        double midSalary = employees.stream()
                .collect(Collectors.averagingDouble(x -> x.getSalary())); // (x -> x.getSalary())) = (Employee::getSalary))

        System.out.println("3. Average salary is " + midSalary);
        // 3. Average salary is 1156.1

        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("3. Average salary is " + avgSalary);
        // 3. Average salary is 1156.1


//        4. Получить список сотрудников с зп > 1000
        List<Employee> list4 = employees.stream()
                .filter(x -> x.getSalary() > 1000)
                .collect(Collectors.toList());

        System.out.println("4. " + list4);
        // 4. [Aleks Developer 1500.0, Thea CEO 2000.0]


//        5. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
        employees.stream()
                .filter(x -> x.getStaff().equals("Manager"))
                .forEach(x -> x.setSalary(x.getSalary() * 1.15));

        System.out.println("5. " + employees);
        // 5. [Aleks Developer 1500.0, Thomas Manager 782.5749999999999, Thea CEO 2000.0, Mary Manager 804.9999999999999, Ken Developer 900.0]


//        6. Получить сотрудника с самой низкой зп
        Employee employee2 = employees.stream()
                .sorted((x1, x2) -> Double.compare(x1.getSalary(), x2.getSalary()))
                .findFirst()
                .orElse(null);

        System.out.println("6. " + employee2);
        // 6. Thomas Manager 782.5749999999999


//        7. Получите сотрудников из всех отделов с максимальной зп
        System.out.println("7. Получите сотрудников из всех отделов с максимальной зп");
        employees.stream()
                .collect(Collectors.groupingBy(x -> x.getStaff()))
                .forEach((x, y) -> y.stream()
                        .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                        .limit(1)
                        .forEach(System.out::println));

        /*
        Aleks Developer 1500.0
        Thea CEO 2000.0
        Mary Manager 804.9999999999999
         */

    }
}
