/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OneDimArray;

import java.util.Arrays;

/**
 *
 * @author YNZ
 */
public class UsingOneDimension {

    public static void main(String[] args) {
        int[] a = {12, 34};
        int[] b = new int[9];
        for (int i = 0; i < b.length; i++) {
            b[i] = i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
