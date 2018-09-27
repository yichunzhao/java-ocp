/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author YNZ
 */

final class BirthDay{
    final private Date birth; 

    public BirthDay(Date birth) {
        this.birth = birth;
    }
    
    public LocalDateTime getBirthDateTime() throws CloneNotSupportedException{
        return (LocalDateTime)birth.clone();
    }
}

public class ImmutableObjectUsage {
    
}
