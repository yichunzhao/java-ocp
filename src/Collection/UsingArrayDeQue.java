/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayDeque;
import java.util.Queue;



/**
 *
 * @author YNZ
 */
public class UsingArrayDeQue {

    public static void main(String[] args) {
        

        Queue<String> products = new ArrayDeque<>();
        products.add("p1");
        products.add("p2");
        products.add("p3");
        System.out.print(products.peek());
        System.out.print(products.poll());
        System.out.println(products);
        

    }

}
