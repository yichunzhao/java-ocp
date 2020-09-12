
package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/** @author YNZ */

public class TextFileReadWrite {

  public static void main(String[] args) throws IOException {

    String str =
        "Israeli Prime Minister Benjamin Netanyahu praised the US decision as \"brave and moral\", a statement said.\n"
            + "The agency is known for designating world heritage sites such as Syria's Palmyra and the US Grand Canyon.\n"
            + "Unesco head Irina Bokova earlier called the US withdrawal a matter of \"profound regret\".\n"
            + "The US withdrawal will become effective at the end of December 2018 - until then, the US will remain a full member. The US will establish an observer mission at the Paris-based organisation to replace its representation, the state department said.\n"
            + "Israeli Prime Minister Netanyahu tweeted he had instructed his foreign ministry to \"prepare Israel's withdrawal... in parallel with the United States\".";
    try (FileWriter fw = new FileWriter(new File("mytest.txt"))) {
      fw.write(str);
    }
  }
}
