package lesson26.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

    public static void main(String[] args) {

        // Calendar calendar = new GregorianCalendar();
        Calendar calendar = Calendar.getInstance(); // created object of class GregorianCalendar

        int result = calendar.get(1); // YEAR = 1
        System.out.println(result); // 2023
        result = calendar.get(Calendar.YEAR); // const
        System.out.println(result); // 2023
        result = calendar.get(Calendar.WEEK_OF_YEAR); // const
        System.out.println(result); // 34
        result = calendar.get(Calendar.MINUTE); // const
        System.out.println(result); // 2

        calendar.set(2020, Calendar.APRIL, 12, 10, 14, 17);
        result = calendar.get(Calendar.SECOND);
        System.out.println(result); // 17

        // calendar.set(2,10); // same
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        result = calendar.get(Calendar.MONTH);
        System.out.println(result); // 10 (November)

        calendar.add(Calendar.MONTH, 5); // plus 5 months
        int month = calendar.get(Calendar.MONTH); // 10 + 5 = 3 (April)
        int year = calendar.get(Calendar.YEAR);
        System.out.println(month); // 3
        System.out.println(year); // 2021

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(calendar.getTime()); // calendar.getTime() = object of Date
        System.out.println(formattedDate); // 12/04/2021

        formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        System.out.println(formatter.format(new Date())); // 21-08-2023 22:39
    }
}
