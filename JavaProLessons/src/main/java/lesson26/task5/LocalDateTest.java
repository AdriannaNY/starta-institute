package lesson26.task5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // static method now()
        System.out.println(date); // 2023-08-22

        LocalDate date1 = LocalDate.of(2015,5, 20); // static method of()
        System.out.println(date1); // 2015-05-20

        System.out.println(date.getDayOfMonth()); // 22
        System.out.println(date.getDayOfWeek()); // TUESDAY
        System.out.println(date.getDayOfYear()); // 234
        System.out.println(date.getMonth()); // AUGUST
        System.out.println(date.getMonthValue()); // 8
        System.out.println(date.getYear()); // 2023

        DayOfWeek dayOfWeek = date.getDayOfWeek(); // object of enum
        System.out.println(dayOfWeek.ordinal()); // 1 (Tuesday = 1 because in enum start Monday with index 0)
        Month month = date.getMonth(); // object of enum
        System.out.println(month.ordinal()); // 7 (August = 7)

        System.out.println("Methods plus() and minus():");
        System.out.println(date + " - source date"); // 2023-08-22
        // LocalDate newDate = date.plusYears(2); // if don't want to change source date
        date = date.plusYears(2); // here we changed source date
        System.out.println(date + " - plus 2 years"); // 2025-08-22
        date = date.minusMonths(3);
        System.out.println(date + " - minus 3 months"); // 2025-05-22

    }
}
