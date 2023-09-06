package lesson22.task1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class DelimiterTest {

    public static void main(String[] args) {

        String source = "Hello12World123I9Love77Java";
        String regEx = "[0-9]{1,3}"; // = delimiter: 1 or 2 or 3 numbers from [0 till 9]
        Pattern pattern = Pattern.compile(regEx);

        String[] words = pattern.split(source); // split() return array of Strings
        System.out.println(Arrays.toString(words)); // [Hello, World, I, Love, Java]
        Arrays.stream(words).forEach(x -> System.out.print(x + " ")); // Hello World I Love Java
        System.out.println();

        String source2 = "   Apple   Banana    Orange   Peach      Mango   ";
        String trimmed = source2.trim(); // trim only start and end
        System.out.println(trimmed); // Apple   Banana    Orange   Peach      Mango

        String replaced = trimmed.replaceAll("[ ]*", " "); // >= 0 blanks -> 1 blank
        System.out.println(replaced); //  A p p l e  B a n a n a  O r a n g e  P e a c h  M a n g o

        String replaced2 = trimmed.replaceAll("[ ]+", " "); // >= 1 blanks -> 1 blank
        System.out.println(replaced2); // Apple Banana Orange Peach Mango

    }
}
