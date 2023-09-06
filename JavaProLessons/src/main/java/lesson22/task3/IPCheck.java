package lesson22.task3;

import java.util.regex.Pattern;

public class IPCheck {

    // Check IP address:
    // must be 4 blocks split with dot
    // numbers 0 - 255
    // zero allowed 005

    public static void main(String[] args) {

        checkIP("055.2.165.255"); // true
        checkIP("000.0.00.000"); // true
        checkIP("000.0.00.0000.");
        checkIP(".000.0.00.0000");
        checkIP("000..0.00.0000");
        checkIP("000.0.00.0000.0");
        checkIP("005.256.0.13");
        checkIP("005.2a55.0.13");
        checkIP("005.255.0.13.0");
        checkIP("00256.255.0.13");
        checkIP("0.005.255.0.13");
        checkIP("0.005.255");
    }

    // For 1 block:
    // Любое число из одной цифры 0-9
    // Любое двузначное число 0-99
    // Трёхзначные, которые начинаются с 1 либо 0
    // Трёхзначное число, которое начинается на 2, при этом не может быть больше 255
    // Использовать знак |

    public static void checkIP(String ip) {
        String regExFor1Block = "([0-9]{1,2}|(0|1)[0-9]{2}|2[0-4][0-9]|25[0-5])";
        String regEx = regExFor1Block + "\\." + regExFor1Block + "\\." + regExFor1Block + "\\." + regExFor1Block;
        System.out.println(ip + " " + Pattern.compile(regEx).matcher(ip).matches());

    }
}
