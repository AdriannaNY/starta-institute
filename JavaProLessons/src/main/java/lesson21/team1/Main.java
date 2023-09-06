package lesson21.team1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

//        1. Создать папку.
//        2. В этой папке создать несколько файлов с разными расширениями -
//        .txt, .doc, .PNG, .AVI, .jpg, .JPEG и т.д.
//        3. Вывести в консоль список всех файлов изображений
//        (учитывать, что расширение может быть написано в разных регистрах).

        File dir = new File("DirImg");
        dir.mkdir();
        File file1 = new File("DirImg/file1.txt");
        file1.createNewFile();
        File file2 = new File("DirImg/file2.doc");
        file2.createNewFile();
        File file3 = new File("DirImg/file3.PNG");
        file3.createNewFile();
        File file4 = new File("DirImg/file4.AVI");
        file4.createNewFile();
        File file5 = new File("DirImg/file5.jpg");
        file5.createNewFile();
        File file6 = new File("DirImg/file6.JPEG");
        file6.createNewFile();

        System.out.println("All files:");
        System.out.println(Arrays.toString(dir.list()));
        // [file1.txt, file4.AVI, file3.PNG, file5.jpg, file2.doc, file6.JPEG]

        List<String> list = new ArrayList<>();
        list.add("png");
        list.add("jpg");
        list.add("jpeg");

        File[] files = dir.listFiles(x -> list.contains(x.getName()
                .substring(x.getName()
                        .lastIndexOf(".") + 1)
                .toLowerCase()));

        System.out.println("Files with images:");
        Arrays.stream(files).forEach(x -> System.out.println(x.getName()));
        // file3.PNG
        // file5.jpg
        // file6.JPEG

    }
}
