/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDimArray;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author YNZ
 */
public class UsingFlatMap {

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {2, 3}};
        Arrays.asList(a).stream().forEach(e -> System.out.println("" + Arrays.toString(e)));
        Arrays.asList(a).stream().forEach(e -> System.out.println("" + Arrays.toString(e)));

    }
}
