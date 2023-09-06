package lesson26.task3;

import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Locale locale = new Locale("de");
        Date now = new Date();
        String date = String.format(locale, "%tc", now); // Mo. Aug. 21 23:52:31 MSK 2023
        date = String.format(locale, "%tD", now); // 08/21/23
        date = String.format(locale, "%tF", now); // 2023-08-21
        date = String.format(locale, "%tZ", now); // MSK
        System.out.println(date);

    }
}
