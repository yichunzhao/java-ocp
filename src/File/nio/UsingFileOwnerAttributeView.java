package File.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Optional;


/**
 * view is used to update file attributes; FileOwnerAttributeView provides methods
 * <p>
 * UserPrincipal getOwner(): get current file owner
 * setOwner(UserPrincipal user): change to a new owner.
 * <p>
 * UserPrincipal is an interface
 */
public class UsingFileOwnerAttributeView {

    public static void main(String[] args) {
        Path path = Paths.get("mytest.txt");

        //in case OS, it returns a null view; so you need to check it before using it.
        FileOwnerAttributeView ownerAttributeView = Optional.ofNullable(Files.getFileAttributeView(path, FileOwnerAttributeView.class))
                .orElseThrow(() -> new IllegalStateException("the OS doesn't support"));

        try {
            UserPrincipal owner = ownerAttributeView.getOwner();
            System.out.printf("current file owner : %s \n", ownerAttributeView.getOwner());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
