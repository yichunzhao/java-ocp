/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringProcessing.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Character classes: When used in regex pattern, [] enclosing a set of characters
 *
 * <p>Predefined character classes. Java Regex supports predefined character classes.
 *
 * <p>if you want to include a backslash (\), then you must escape the \ in the pattern by preceding
 * in with another \ (.) any character(may or may not match line terminators) (\d) [0-9] (\D) [^0-9]
 * \s A white space character: [space, \t(tab),\n(new line), \x0B(end of line), \f(form feed),
 * \r(carriage)] \S A nonwhite space character: [^\s] \w A word character:[a-zA-Z_0-9] \W A non word
 * character: [^\w]
 *
 * <p>Matching boundaries
 *
 * <p>\b: a word boundary \B: a non-word boundary ^ Beginning of a line $ End of a line
 *
 * @author YNZ
 */
public class RegularExpressionBoundaryMatcher {

  public static String Dog_Matcher = "\\bdog\\B";
  public static String Dog_NonWordBoundary_Matcher = "\\bdog\\B";
  public static String testStr = "dogee is a small dog";

  public static void main(String[] args) {
    Pattern p = Pattern.compile(Dog_Matcher);
    Matcher m = p.matcher(testStr);
    System.out.println(m.find());
  }
}
