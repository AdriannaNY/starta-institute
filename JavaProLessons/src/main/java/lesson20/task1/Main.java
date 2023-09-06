package lesson20.task1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three!");
        System.out.println();
        System.out.println();

        System.out.println("One!");
        System.out.println("Two!");
        System.out.println("Three!");
        System.out.println();

        System.out.println("Symbols %n and \\n - move to a new line, like in println");
        System.out.printf("One!%nTwo!\nThree!%n");
        System.out.println();

        System.out.println("We can add int to our line using %d");
        int a = 4;
        int b = 5;
        System.out.printf("Sum of %d and %d is %d\n", a, b, a + b);
        System.out.printf("Number five - %d\n", 5);
        System.out.println();

        System.out.println("We can add String to our line using %s");
        String s1 = "Hi guys!";
        System.out.printf("String - %s\n", s1); // - Hi guys!
        System.out.printf("String - %S\n", s1); // - HI GUYS!
        System.out.println();

        System.out.println("We can add dropped String to our line using %.4s, where 4 - number of output symbols");
        String s2 = "Hi guys!";
        System.out.printf("Dropped String - %.4s\n", s2); // - Hi g
        System.out.printf("Dropped String - %.4S\n", s2); // - HI G
        System.out.println();

        System.out.println("Add Pi in a String, using %f for doubles");
        System.out.printf("Pi number - %f\n", Math.PI);   // Pi number - 3.141593
        System.out.printf("Pi number with math rounding - %.3f\n", Math.PI);   // 3.142
        System.out.println();

        boolean b2 = true;
        System.out.printf("add %b\n", b2); // add true
        System.out.printf("add %B\n", b2); // add TRUE
        System.out.printf("add %b\n", a > b); // add false, cause 4 > 5 = !true
        System.out.printf("add %B\n", 7); // add TRUE
        System.out.printf("add %b\n", "Hello"); // add true
        System.out.printf("add %B\n", null); // add FALSE

        char c = 'c';
        System.out.printf("Symbol - %c\n", c); // - c
        System.out.printf("Symbol - %C\n", c); // - C
        System.out.printf("Symbol - %c\n", 80); // - P
        System.out.printf("Symbol - %c\n", '8'); // - 8
        System.out.println();

        System.out.println("Some options with doubles");
        double d1 = 1234.567;
        double d2 = 1234567.12345678;
        System.out.printf("%f\n", d1);  // 1234.567000
        System.out.printf("%f\n", d2);  // 1234567.123457
        System.out.printf("%50.2f\n", d1);  // 1234.57
        System.out.printf("%50.8f\n", d2);  // 1234567.12345678
        System.out.println();

        System.out.println("   X    O O O O X         X");
        System.out.println("  X X   O     O  X       X");
        System.out.println(" X   X  O     O   X     X");
        System.out.println("X     X O     O    X   X");
        System.out.println(" X   X  O     O     X X");
        System.out.println("  X X   O     O     X X");
        System.out.println("   X    O O O O      X");
        System.out.println();

        System.out.println("Date formatting");
        Date date = new Date();
        System.out.println(date); // Sun Jul 30 12:31:42 MSK 2023
        System.out.printf("Result - %tT\n", date); // - 12:31:42
        System.out.printf("Hours - %tH, minutes - %tM, seconds - %tS\n", date, date, date);
        // Hours - 12, minutes - 31, seconds - 42
        System.out.printf("%1$tA %1$td %1$tB %1$tY\n", date); // Sunday 30 July 2023
        System.out.printf("%1$tA %1$td %1$tm %1$tY\n", date); // Sunday 30 07 2023











    }
}
