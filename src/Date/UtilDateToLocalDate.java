/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author YNZ
 */
public class UtilDateToLocalDate {
    
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        LocalDate localDate = LocalDate.parse(date.toString()); 
        System.out.println("Local date ; " + localDate.toString());
    }
    
}
