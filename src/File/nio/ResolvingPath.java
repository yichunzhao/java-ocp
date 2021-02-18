package File.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Resolving path means join two relative path together.
 * <p>
 * resolve(String) and resolve(Path) is used to join a relative path to another path.
 *
 * resolve doesn't work on the real file system;
 */
public class ResolvingPath {

    public static void main(String[] args) {
        Path p1 = Paths.get("myFolder", "myDoc");
        Path p2 = Paths.get("myDetails", "myNext");

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        Path pBoth = p1.resolve(p2);
        System.out.println("combined: " + pBoth);

        //resolveSibling, it means to resolve against the given parent, and given sibling
        ///parent: /mydir combine newworld.java
        //used to rename a file
        Path path = Paths.get("/mydir/eWorld.java");
        Path renamePath = path.resolveSibling(Paths.get("newWorld.java"));
        System.out.println(renamePath);
    }

}
