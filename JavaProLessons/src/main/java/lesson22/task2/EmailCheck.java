package lesson22.task2;

import java.util.regex.Pattern;

public class EmailCheck {

    // Check email names:
    // 1 symbol @
    // before @ >= 1 chars or numbers, without special symbols (register insensitive)
    // after @ >= 1 chars, without special symbols
    // after must be dot
    // after dot 2-4 chars

    public static void main(String[] args) {
        checkEmail("exaMple5@maiL.com"); // true
        checkEmail("exaMple5@maiL..com"); // false
        checkEmail("exaMple5@ma5iL.com"); // false
        checkEmail("exam%ple@mail.com"); // false
        checkEmail("example@@mail.com"); // false
        checkEmail("example@ma@il.com"); // false
        checkEmail("@mail.com"); // false
        checkEmail("example@mail.commm"); // false
        checkEmail("example@mail.c%m"); // false
        checkEmail("example@ma7il.com"); // false
        checkEmail("exaple@ma7il.com"); // false
    }

    public static void checkEmail(String email) {
        String regEx = "\\w+@[a-z]+[.][a-z]{2,4}";
        System.out.println(email + " " + Pattern.compile(regEx, Pattern.CASE_INSENSITIVE).matcher(email).matches());
    }
}
