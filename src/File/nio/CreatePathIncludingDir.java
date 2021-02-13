package File.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * creating path(fileDir,fileName) by one kick is not allowed.
 */
public class CreatePathIncludingDir {

    private static final String fileName = "myAnotherAppendedFile.txt";
    private static final String fileDir = "myAnotherDirectory";

    public static void main(String[] args) throws IOException {
        Path target = Paths.get(fileDir, fileName);
        System.out.println("target path: " + target);
        Path dir = Paths.get(fileDir);
        System.out.println("target folder: " + dir);

        if (Files.notExists(dir)) {
            Files.createDirectory(dir);
        }

        if (Files.notExists(target)) {
            Files.createFile(target);
        }

    }

}
