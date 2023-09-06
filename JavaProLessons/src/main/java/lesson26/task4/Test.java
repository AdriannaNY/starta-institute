package lesson26.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test {

    public static void main(String[] args) {

        checkLeap(2024); // true
        dateIndia(new Date()); // मंगल अग॰ 22 01:22:50 MSK 2023
        printDate(new Date()); // 22-08-23, 22, 234, 01:39

    }

    public static void checkLeap(int year){
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.isLeapYear(year));
    }

    public static void dateIndia(Date date) {
        Locale locale = new Locale("hi");
        String result = String.format(locale, "%tc", date);
        System.out.println(result);
    }

    public static void printDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy, d, D, HH:mm");
        System.out.println(formatter.format(date));
    }
}
