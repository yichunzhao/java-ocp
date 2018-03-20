/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateAndLocale;

import java.sql.Date;

/**
 *
 * @author YNZ
 */

public class SqlDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date today = new Date(System.currentTimeMillis());
        System.out.println("" + today);
        
        
    }

}
