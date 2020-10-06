package StringProcessing;

/**
 * replace(char old, char new)
 * replace(CharSequence oldString, CharSequence replacement): replace exact String
 * replaceAll(String regEx, String replacement): replace regEx
 * replaceFirst(String regEx, String replacement) replace regEx
 */
public class StringReplace {
    private static String str = "RENT-TENT";
    private static String target = "cat cup copp";

    public static void main(String[] args) {

        //replace(char old, char new)
        System.out.printf("replace 'R' with 'W' %s \n ", str.replace('R', 'W'));

        //replace(CharSequence regEx, CharSequence new)
        System.out.printf("replace subString with anotherSubString %s \n ",
                str.replace(str.subSequence(2, 5), str.subSequence(3, 7)));

        //Patten.compile(charSequence var0, 16): 16 means literal
        //the matching exactly literal string sequence
        System.out.println("replace exact string: " + target.replace("c.p", "()"));
        System.out.println("accept CharSequence: " + target.replace(new StringBuilder("cat"), "()"));

        //replaceAll(String regEx,String replacement);it doesn't accept CharSequence, i.e. StringBuilder.
        //replace cop that doesn't stand before non-word boundary
        System.out.println("replaceAll: " + target.replaceAll("c.p\\B", "()"));
        String newString = target.replaceAll("c.p\\b", "()");
        System.out.println(newString);

        //replaceFist(String regEx, String replacement)
        System.out.printf("replace first 'c' by 'd' %s \n ", target.replaceFirst("\\bcop", "d"));
        System.out.println(target.replaceFirst("c.p\\b", "()"));

    }
}
