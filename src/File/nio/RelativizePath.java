package File.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * It is used construct a relative path between two relative paths or two absolute paths.
 */
public class RelativizePath {

    public static void main(String[] args) {
        Path dir = Paths.get("code");
        Path file = Paths.get("code/java/IO.java");

        //file relative to dir;
        System.out.println("relativize file ref. to dir: " + file.relativize(dir));
        System.out.println("relativize dir ref. to file: " + dir.relativize(file));

        Path p1 = Paths.get("/code");
        Path p2 = Paths.get("/java/IO.java");
        System.out.println("p1:" + p1.toAbsolutePath());
        System.out.println("p2:" + p2.toAbsolutePath());

        System.out.println("relativize p2 ref to p1: " + p1.relativize(p2));
        System.out.println("relativize p1 ref to p2: " + p2.relativize(p1));
    }

}
