/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndLocale;

        import java.util.Locale;

/** @author YNZ */
public class UtilDateToLocalDate {

  public static void main(String[] args) {

    Locale.setDefault(new Locale("da", "DK"));

    System.out.println("get current default local in jvm:  " + Locale.getDefault().getCountry());
    System.out.println(
            "get current default local in jvm:  " + Locale.getDefault().getDisplayCountry());
    Locale.getDefault();
  }
}
