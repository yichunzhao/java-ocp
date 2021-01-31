package File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * appending content to an existing file.
 * <p>
 * Files->Paths->Path or File
 */
public class AppendToExistingFile {
    private static final String fileName = "myAppendedFile.txt";

    public static void main(String[] args) {

        //target file to create:
        Path myPath = Paths.get("myDirectory", fileName);

        try {
            if (Files.notExists(myPath)) {
                Files.createFile(myPath);
            }

            PrintWriter pw = new PrintWriter(new FileWriter(myPath.toFile(), true));
            pw.println("first line text:: ....... ");
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter pw1 = new PrintWriter(new FileWriter(myPath.toFile(), true));
            pw1.println("writing another line .....");
            pw1.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
