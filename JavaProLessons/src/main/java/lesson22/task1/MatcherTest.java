package lesson22.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {

        String regEx = "www.";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher("http://www.exwwwample.com");

        System.out.println(matcher.matches()); // false, because www. = www and 1 any symbol
        // System.out.println(matcher.find()); // true, because found substring = www.
        while (matcher.find()) { // = while (true)
            System.out.printf("Result of start() method - %d, end() method - %d\n", matcher.start(), matcher.end());
            // Result of start() method - 7, end() method - 11   indexes [7...11) www.
            // Result of start() method - 13, end() method - 17  indexes [13...17) wwwa
        }
    }
}
