package lesson22.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompileFlagTest {

    public static void main(String[] args) {

        String source = "Apple, banana, orange";
        String regEx = "a"; // or "a|A" = VARIANT 1
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE); // VARIANT 2 BEST!!! with flag
        Matcher matcher = pattern.matcher(source); // or source.toLowerCase() // VARIANT 3

        while (matcher.find()) {
            System.out.println("Index of a - " + matcher.start()); // 0, 8, 10, 12, 17
        }
    }
}
