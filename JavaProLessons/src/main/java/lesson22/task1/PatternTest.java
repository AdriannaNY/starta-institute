package lesson22.task1;

import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        // check if our String contains www
        System.out.println(checkString("http://www.example.com")); // true
        System.out.println(checkString("http://example.com")); // false
        System.out.println(checkString("www.example.com")); // true
        System.out.println(checkString("example.com")); // false
        System.out.println(checkString("http://www")); // true
        System.out.println(checkString("www")); // true
        System.out.println(checkString("dwww")); // true
    }

    public static boolean checkString(String source) {
        String regEx = ".*www.*";
        // regular expression, symbol . means any symbol(amount = 1), [.] or \\. means exactly symbol of point .
        // quantificator * means amount of .  any symbols(>= 0)
        // quantificator + means amount of . any symbols(>= 1)
        // quantificator ? means amount of . any symbols(= 0 || = 1)
        // quantificator {3,7} means amount of . any symbols(from [3 to 6] ), !!! {3,NO BLANKSPACE!!!7}
        // quantificator {3,} means amount of . any symbols(>= 3), !!! {3,NO BLANKSPACE!!!}
        // \\.{3,7}www means before www must be from [3 to 7] point symbols .
        Pattern pattern = Pattern.compile(regEx); // pattern - object of Pattern, private class Pattern from java.util.regex
        System.out.println("Pattern - " + pattern.pattern()); // Pattern - .*www.*    true/false
        boolean result = pattern.matcher(source).matches(); // matcher return object of type matcher, matches return boolean
        return result;
    }
}
