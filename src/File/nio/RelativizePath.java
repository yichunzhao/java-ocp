package File.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Relativize path: an opposite operation ref. to path resolve;
 * <p>
 * finding out the path difference between two path; path1 relativize path2, it is read as given path1, how you can
 * find the path to path2.
 * <p>
 * It is used construct a relative path between two relative paths or two absolute paths.
 */
public class RelativizePath {

    public static void main(String[] args) {
        Path dir = Paths.get("code");
        Path file = Paths.get("code/java/IO.java");

        System.out.println("given path dir, how can find the path dir to the file path");
        System.out.println(dir.relativize(file));
    }

}
