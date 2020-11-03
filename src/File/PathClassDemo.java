package File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * move, copy, and delete file is with Path class. this additional functionalities are not available in the File class.
 */
public class PathClassDemo {

    public static void main(String[] args) {
        Path path = Paths.get("myFile.txt");
        System.out.println(path);

        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        File anotherFile = new File(".\\myDirectory\\myFile.txt");
        try {
            anotherFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //some useful info. about this file
        Path antherPath = Paths.get(".\\myDirectory\\myFile.txt");
        System.out.println(antherPath.getParent());
        System.out.println(antherPath.getFileSystem());
        System.out.println(antherPath.getNameCount());
        System.out.println(antherPath.getRoot());
        System.out.println(antherPath.getFileName());

    }

}
