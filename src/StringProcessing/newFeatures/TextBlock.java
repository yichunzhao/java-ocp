package StringProcessing.newFeatures;

/**
 *'\ indicates a new line in the text block.
 *
 */
public class TextBlock {

    static String textBlock = """
    \sThis is a text block
    it has multiple lines.
    red\s\
    yellow\s\
    blue
    """;

    public static void main(String[] args){
        System.out.printf("text block: \n %s\n", textBlock);
    }
}
