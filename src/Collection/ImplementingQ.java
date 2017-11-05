/*
 * Deque <- LinkedList, -> Queue
 * 
 * 
 */
package Collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author YNZ
 */
public class ImplementingQ {

    public static void main(String[] args) {

        Deque<Double> q = new LinkedList<>();
        q.offer(Double.valueOf(2.3D));
        q.offer(Double.valueOf(1.7D));
        q.offer(Double.valueOf(7.9D));
        q.offer(Double.valueOf(8.2D));
        
        System.out.println("pull 1: " + q.poll());
        System.out.println("pull 2: " + q.poll());
        System.out.println("peek 1: " + q.peek());
        System.out.println("peek 2: " + q.peek());
    }

}
