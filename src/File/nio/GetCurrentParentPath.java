package File.nio;

import java.nio.file.Paths;

/**
 * .. how to get current and parent path
 */
public class GetCurrentParentPath {

    public static void main(String[] args) {
        //how to get the current path.
        System.out.println(Paths.get("").toAbsolutePath());
        System.out.println("name count: " + Paths.get("").toAbsolutePath().getNameCount());

        //get current parent path.
        System.out.println(Paths.get("").toAbsolutePath().getParent());
    }

}
