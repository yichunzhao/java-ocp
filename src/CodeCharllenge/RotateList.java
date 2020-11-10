package CodeCharllenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * input 1,2,3,4,5
 * head -> 1; tail ->5,
 * if right shift k=2
 * head -> 4; tail->3
 * output 4,5,1,2,3
 * <p>
 * if right shit k=3
 * output 3,4,5,1,2
 * head->3 and tail ->2
 * <p>
 *
 * <p>
 * Assuming the length of the list is l; k>=0 integers.
 * real shift:  rs = k % l
 * after right shifting k position.
 * tail_: index (l-rs)-1
 * head_: index (l-rs)
 * so the list is divided into two parts; starting from the new head: head_ to the end;
 * and the start of list to the new tail, tail_
 * <p>
 * I think this could be a simple solution without any shifting operations.
 */
public class RotateList {
    static List<Integer> list = new ArrayList<>();

    static {
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
    }

    public static void main(String[] args) {
        System.out.println("original:" + list);
        System.out.println("k=2: " + rotateRight(list, 2));
        System.out.println("k=3: " + rotateRight(list, 3));
        System.out.println("k=6: " + rotateRight(list, 5));
        System.out.println("k=7: " + rotateRight(list, 7));
    }

    static List<Integer> rotateRight(List<Integer> list, int k) {
        List<Integer> result = new ArrayList<>();

        int l = list.size();

        //the real shift amount, when shift is much bigger than the length of list
        int rs = k % l;
        if (rs == 0) {
            result.addAll(list);
            return result;
        }

        //new head position: it divides the list into two parts
        int newHead = l - rs;

        //new head Part.
        result.addAll(list.subList(newHead, l));

        //new tail part.
        result.addAll(result.size(), list.subList(0, newHead));

        return result;
    }
}
