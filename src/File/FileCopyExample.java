package File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Files static method copy to copy a File
 */
public class FileCopyExample {

    public static void main(String[] args) {
        Path source = Paths.get(".\\myDirectory\\myFile.txt");
        Path dest = Paths.get(".\\myDirectory\\copyOfMyFile.txt");

        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
