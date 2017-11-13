/*
 * If you throw an exception in a method; then you need to ADD throws 
 * 
 * 
 */
package Exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YNZ
 */

public class HandleThrowException {
    
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (Exception ex) {
            Logger.getLogger(HandleThrowException.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static void doSomething() throws Exception {
        doSomethingElse();
    }

    private static void doSomethingElse() throws Exception {
        throw new Exception();
    }
    
}
