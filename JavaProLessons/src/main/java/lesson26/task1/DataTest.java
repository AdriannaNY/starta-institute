package lesson26.task1;

import java.util.Date;

public class DataTest {

    public static void main(String[] args) throws InterruptedException {

        Date current = new Date();
        // object remember time when it was created

        Thread.sleep(200);

        Date current2 = new Date();
        // 2d object remember time when it was created (time of 1st object + 200 millis)

        System.out.println(current); // Wed Aug 16 22:52:30 MSK 2023 - moment of creating object current
        System.out.println(current2); // Wed Aug 16 22:52:31 MSK 2023 - moment of creating object current2
        System.out.println(current.getTime()); // 1692216297123 milliseconds since Jan 01 1970 till creating current
        System.out.println(current2.getTime()); // 1692216297327 milliseconds since Jan 01 1970 till creating current2


    }
}
