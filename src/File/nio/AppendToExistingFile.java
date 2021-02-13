package File.nio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

/**
 * appending content to an existing file.
 * <p>
 * Files->Paths->Path or File
 */
public class AppendToExistingFile {
    private static final String fileName = "myAppendedFile.txt";
    private static final String fileDir = "myDirectory";

    public static void main(String[] args) {
        //target path(file) to create:
        Path myPath = Paths.get(fileDir, fileName);

        if (Files.notExists(myPath)) {
            try {
                Files.createFile(myPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter(myPath.toFile(), true))) {
            pw.println(LocalDateTime.now());
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
