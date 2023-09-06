package lesson26.task6;

import java.time.LocalDateTime;

public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now(); // static method now()
        System.out.println(date); // 2023-08-22T02:32:47.768155 (output also nanoseconds)

        date = LocalDateTime.of(2005, 8, 17, 15,23,5); // static method of()
        System.out.println(date); // 2005-08-17T15:23:05

        date = date.plusHours(2).minusMinutes(2).plusSeconds(10);
        System.out.println(date); // 2005-08-17T17:21:15

        date = date.plusNanos(1);
        System.out.println(date); // 2005-08-17T17:21:15.000000001



    }
}
