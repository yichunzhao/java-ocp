package Array;

import java.util.Arrays;

public class ArraysFill {

    public static void main(String[] args) {
        long[] a = new long[20];
        Arrays.fill(a, 2L);
        System.out.println(Arrays.toString(a));

        int[] b = new int[20];
        //fill 6 from index 15 to 17
        Arrays.fill(b, 6, 10, 17);
        System.out.println(Arrays.toString(b));
    }
}
