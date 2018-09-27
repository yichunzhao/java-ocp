/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

import java.util.List;

/**
 *
 * @author YNZ
 */
@FunctionalInterface
interface Calculator<T, R> {

    R calculate(T a1, T a2);
}

@FunctionalInterface
interface Filter<T> {

    List<T> filtering(List<T> a);
}

public class CalculatingFunction {

    public static void main(String[] args) {

        Calculator<Integer, Integer> sum = (a1, a2) -> a1 + a2;
        Calculator<Integer, Integer> substraction = (a1, a2) -> a1 - a2;

        System.out.println("" + sum.calculate(2, 3));
        System.out.println("" + substraction.calculate(4, 6));
        
        
        
        

    }

}
