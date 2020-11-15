package StringProcessing;

import java.util.Locale;

/**
 * String and Locale: How Locale impacts the String
 */
public class StringLocale {
    private static final String str = "President Trump is treated with the steroid dexamethasone after oxygen level drops on Friday and Saturday, his doctor says";

    public static void main(String[] args) {

        String str_uk = str.toLowerCase(Locale.UK);
        String str_cn = str.toLowerCase(Locale.CHINA);
        String str_fr = str.toLowerCase(Locale.FRANCE);
        String str_tr = str.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println("str_uk: " + str_uk);
        System.out.println("str_cn: " + str_cn);
        System.out.println("str_fr: " + str_fr);
        System.out.println("str_tr: " + str_tr);
    }
}
