package lesson26.task1;

import java.util.Date;

public class DataTest2 {

    public static void main(String[] args) {

        Date d = new Date(2000, 7, 15); // deprecated method
        System.out.println(d); // Wed Aug 15 00:00:00 MSK 3900 (3900 year because + 1900), months - from 0 till 11 -> +1
        Date d1 = new Date(100, 7, 15);
        System.out.println(d1); // Tue Aug 15 00:00:00 MSD 2000 (100 + 1900)
        Date d2 = new Date();
        System.out.println(d2); // Mon Aug 21 20:57:38 MSK 2023
        Date d3 = new Date(110, 3, 7);
        System.out.println(d3); // Wed Apr 07 00:00:00 MSD 2010 (110 + 1900)
        Date d4 = new Date(110, 3, 7);
        System.out.println(d4); // Wed Apr 07 00:00:00 MSD 2010 (110 + 1900)

        boolean result = d2.after(d1);  // 2023 > 2000 ?
        System.out.println("Date 2 is later then date 1 - " + result); // true
        result = d3.before(d1); // 2010 < 2000 ?
        System.out.println("Date 3 is earlier then date 1 - " + result); // false

        int res = d1.compareTo(d2); // 2000 VS 2023
        System.out.println("Comparing of date1 and date2 - " + res); // -1
        res = d3.compareTo(d4); // 2010 VS 2010
        System.out.println("Comparing of date3 and date4 - " + res); // 0

        System.out.println(d2.equals(d1)); // false
        System.out.println(d3.equals(d4)); // true

    }
}
