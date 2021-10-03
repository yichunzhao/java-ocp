/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndLocale.Local;

import java.util.Arrays;
import java.util.Locale;

/** @author YNZ */
public class UsingLocalisation {

  public static void main(String[] args) {

    Locale[] locals = Locale.getAvailableLocales();
    System.out.println("locals " + Arrays.toString(locals));

    System.out.println("default local : " + Locale.getDefault());
    System.out.println("default local : " + Locale.getDefault().getDisplayCountry());

    msg(Locale.CHINA.getCountry());
    msg(Locale.CHINA.getDisplayCountry());
    msg(Locale.CHINA.getLanguage());
    msg(Locale.CHINA.getDisplayLanguage());
    msg(Locale.PRC.getCountry());
    msg(Locale.PRC.getDisplayCountry());

    Locale denmark = new Locale("dk");

    Locale canada = Locale.CANADA;
    Locale canada1 = new Locale("ca");
    msg("are they equal ? " + canada.equals(canada1));

    msg(Locale.FRANCE.toString());
    msg(Locale.FRENCH.toString());

    Locale defaultLocale = Locale.getDefault();
    System.out.println("current default local: " + defaultLocale);
  }

  public static void msg(String str) {
    System.out.println(str);
  }
}
