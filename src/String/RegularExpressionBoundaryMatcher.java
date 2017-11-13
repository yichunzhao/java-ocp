/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
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
