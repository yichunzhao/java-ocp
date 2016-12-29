/* Before java 8
 * how to transfer a function into another function by its argument.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * I almost made 40 line code. 
 */
package java8;

/**
 *
 * @author YNZ
 */

/*
 define an interface
*/
interface Runable {

    void run();
}

/*
 impl. class implements the interface 
*/
class RunImp implements Runable {

    @Override
    public void run() {
        System.out.println("I am running ...");
    }

}

/*
 transfer external runable impl. into another function as an argument.
*/
class Excecutor{
    void excecute(Runable r){
        r.run();
    } 
    
}
public class TransferFunction {
    public static void main(String[] args) {
        Excecutor e = new Excecutor();
        Runable r = new RunImp();
        e.excecute(r);
        
        //in Java 8
        
        
    }

}
