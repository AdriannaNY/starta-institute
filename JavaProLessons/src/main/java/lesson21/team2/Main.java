package lesson21.team2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        File dir = new File("taskDir");
        dir.mkdir();

        List<String> allowedFormats = new ArrayList<String>();
        allowedFormats.add(".png");
        allowedFormats.add(".jpg");
        allowedFormats.add(".jpeg");


        File fileTxt = new File("taskDir/test.txt");
        fileTxt.createNewFile();
        File fileDoc = new File("taskDir/test.doc");
        fileDoc.createNewFile();
        File filePng = new File("taskDir/test.PNG");
        filePng.createNewFile();
        File fileJpeg = new File("taskDir/test.JPEG");
        fileJpeg.createNewFile();
        File fileJpg = new File("taskDir/test.jpg");
        fileJpg.createNewFile();
        File fileAvi = new File("taskDir/test.AVI");
        fileAvi.createNewFile();

        printImageFilesFromDir(dir.listFiles());
    }

    public static void printImageFilesFromDir(File[] filesArray) {
        try {

            for (File filename : filesArray) {
                int pointIndex = filename.getName().lastIndexOf('.');


                if (filename.getName().toLowerCase().substring(pointIndex).contains("jpeg") ||
                        filename.getName().toLowerCase().substring(pointIndex).contains("png") ||
                        filename.getName().toLowerCase().substring(pointIndex).contains("jpg")) {

                    System.out.println(filename.getName());
                }
            }

        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}
