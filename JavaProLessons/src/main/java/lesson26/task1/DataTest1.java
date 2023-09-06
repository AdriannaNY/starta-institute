package lesson26.task1;

import java.util.Date;

public class DataTest1 {

    public static void main(String[] args) {

        Date date = new Date(); // remember time of creating an object
        System.out.println(date); // Mon Aug 21 20:34:55 MSK 2023

        date.setTime(12345678926354L); // set time in milliseconds since 1 Jan 1970
        System.out.println(date); // Tue Mar 21 22:15:26 MSK 2361

        Date current = new Date();
        System.out.println(current); // Mon Aug 21 20:40:32 MSK 2023

        current.setTime(current.getTime() + 3000); // plus 3 seconds
        System.out.println(current); // Mon Aug 21 20:40:35 MSK 2023



    }
}
