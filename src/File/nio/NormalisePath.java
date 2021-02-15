package File.nio;

import java.nio.file.Paths;

/**
 * path.normalise() removing redundant path information. only this method removing redundant info.
 */
public class NormalisePath {

    public static void main(String[] args) {
        //get empty string, return current path
        System.out.println("current path: " + Paths.get("").toAbsolutePath());

        System.out.println("current path: " + Paths.get("myTest.txt").toAbsolutePath());

        System.out.println("current path: " + Paths.get("./", "myTest.txt"));

        //. standing for the current directory; it is a redundant info.
        System.out.println("current path: after normalise " + Paths.get("./", "myTest.txt").normalize());
    }
}
