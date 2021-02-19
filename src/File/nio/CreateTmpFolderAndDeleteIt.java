package File.nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * creating a tmp folder at the current working dir. and creating a temporal file; afterwards, removing the tmp folder.
 */

public class CreateTmpFolderAndDeleteIt {

    public static void main(String[] args) {
        //creating a tmp folder at the current path
        Path t = Paths.get("tmp");
        Path l = Paths.get("tmp", "myLog.log");

        System.out.printf("re: %s, ab: %s \n", t, t.toAbsolutePath());
        System.out.printf("re: %s, ab: %s \n", l, l.toAbsolutePath());

        if (Files.notExists(t)) {
            try {
                Files.createDirectory(t);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (Files.notExists(l)) {
            try {
                Files.createFile(l);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("l file exists? %b \n", Files.exists(l));
        System.out.printf("re: %s, ab: %s \n", l, l.toAbsolutePath());

        boolean deleted = false;
        try {
            deleted = Files.deleteIfExists(l);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (deleted) {
            System.out.printf("the file %s is deleted! \n", l);
            try {
                boolean deletedFolder = Files.deleteIfExists(t);
                if (deletedFolder) System.out.printf("%s is removed \n", t);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("log file exists? %b \n ", Files.exists(l));

    }
}
