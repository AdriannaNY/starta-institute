package lesson21.team3;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

//        1. Создать папку.
//        2. В этой папке создать несколько файлов с разными расширениями -
//        .txt, .doc, .PNG, .AVI, .jpg, .JPEG и т.д.
//        3. Вывести в консоль список всех файлов изображений
//        (учитывать, что расширение может быть написано в разных регистрах).

        File dir = new File("someDir");
        dir.mkdir();
        File file = new File("someDir/test.txt");
        file.createNewFile();
        file = new File("someDir/test.doc");
        file.createNewFile();
        file = new File("someDir/test.PNG");
        file.createNewFile();
        file = new File("someDir/test.AVI");
        file.createNewFile();
        file = new File("someDir/test.jpg");
        file.createNewFile();
        file = new File("someDir/test.JPEG");
        file.createNewFile();

        File[] files = dir.listFiles(x -> List.of("png", "jpg", "jpeg").contains(x.getName()
                .substring(x.getName().lastIndexOf(".") + 1).toLowerCase()));

        System.out.println("All files with images:");
        Arrays.stream(files).forEach(x -> System.out.println(x.getName()));
        // test.JPEG
        // test.jpg
        // test.PNG

    }
}
