package lesson26.task7;

import java.time.*;

public class ZonedDateTimeTest {

    public static void main(String[] args) {

        ZonedDateTime date = ZonedDateTime.now();
        System.out.println(date); // 2023-08-22T02:51:43.044643+03:00[Europe/Moscow]

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        ZoneId zoneId = ZoneId.systemDefault();
        date = ZonedDateTime.of(localDate, localTime, zoneId);
        System.out.println(date); // 2023-08-22T02:57:15.766312+03:00[Europe/Moscow]

    }
}
