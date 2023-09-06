package lesson22.task1;

import java.util.regex.Pattern;

public class RegexTest {

    public static void main(String[] args) {
        checkString("A"); // true
        checkString("B"); // true
        checkString("C"); // true
        checkString("D"); // false
        checkString("AA"); // false
        checkString("ABC"); // false
        checkString("CBABBABC"); // false
        System.out.println();

        checkString2("ab"); // false
        checkString2("A"); // false
        checkString2("abjkldGHG"); // true
        checkString2("Rhg"); // true
    }

    public static void checkString(String source) {
        String regEx = "[ABC]"; // 1 symbol - A or B or C
        Pattern pattern = Pattern.compile(regEx);
        System.out.println(pattern.matcher(source).matches());
        // String regEx = "[ABC]?"; // 0 or 1 symbol - 0 or A or B or C
        // String regEx = "[ABC]*"; // any amount >= 0 of symbols - A or B or C
        // String regEx = "[ABC]+"; // any amount >= 1 of symbols - A or B or C
    }

    public static void checkString2(String source) {
        String regEx = "[A-Za-z]{3,}"; // >= 3 symbols of all alphabet
        // String regEx = "\\w{3,}"; // >= 3 symbols of all alphabet and all numbers
        // String regEx = "[^A-Za-z]{3,}"; // >= 3 symbols except all alphabet (!=)
        // String regEx = "[0-7]{3,}"; // >= 3 numbers from [0 till 7]
        Pattern pattern = Pattern.compile(regEx);
        System.out.println(pattern.matcher(source).matches());
    }

}
