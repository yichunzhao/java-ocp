/*
 * LinkedList and ArrayDeque both implement Deque interface
 * 
 * 
 */
package Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Queue;
import java.util.TreeSet;

/**
 *
 * @author YNZ
 */
public class ListUsage {

    private enum Directions {
        EAST, SOUTH, WEST, NORTH,
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(19);
        list.add(29);

        //list allow duplicated elements. the first occurrence will be obtained. 
        System.out.println("" + list.indexOf(4));

        //insertion in the list; o(n)
        list.add(0, 1000);
        System.out.println("" + list);
        //what retain mean?

        List<Integer> listCopy = new ArrayList<>(list);

        Set<Integer> needed = new HashSet<>();
        needed.add(1);
        needed.add(9);
        needed.add(19);
        listCopy.retainAll(needed);
        System.out.println("what left" + listCopy);

        //remove()
        listCopy = new ArrayList<>(list);
        System.out.println("" + listCopy);
        listCopy.remove(4);
        System.out.println("what left" + listCopy);
        //what direction to count for the first occurence
        //search from the left to right, or another way around.
        //lets do a new test

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(3);
        list1.add(5);
        list1.add(13);
        list1.add(15);
        list1.add(25);

        System.out.println("what have in list1: " + list1);
        list1.remove(Integer.valueOf(5));
        System.out.println("what left in list1: " + list1);
        //first occrence happends from the left to right. 

        System.out.println(" before remove all: " + list1);
        List<Integer> notNeeded = new ArrayList<>();
        notNeeded.add(2);
        notNeeded.add(3);
        list1.removeAll(notNeeded);
        System.out.println(" after  remove all: " + list1);

        //removeAll will remove all occurence of specified instances. 
        //dupliated elements will be removed
        //then how about using remove? can remove remove duplicated elements? 
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(3);
        list2.add(5);
        list2.add(13);
        list2.add(15);
        list2.add(25);

        System.out.println(" Before remove : " + list2);
        list2.remove(Integer.valueOf(5));
        System.out.println(" After  remove : " + list2);
        //only the first occrence beign removed

        //a deque is a double-ended Q; it can be used to represent
        //a Q or a stack. 
        Deque<Integer> q = new LinkedList<>(); //generic tyep inference. 
        Deque<Integer> stack = new LinkedList<>();

        q.offer(1);
        q.offer(100);
        q.offer(300);

        //fifo, Q
        System.out.println("query on the head: " + q.peek());

        //lifo, stack
        stack.push(23);
        stack.push(45);
        stack.push(99);

        System.out.println("Query the head : " + stack.peek());
        System.out.println("Peek just a query : " + stack);
        System.out.println("Poll query and remove : " + stack.poll());
        System.out.println("Peek just a query : " + stack);
        Integer removed = stack.pop();
        System.out.println("removed: " + removed);

        System.out.println("Pop = Poll First  : " + stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(23);
        queue.add(32);
        queue.add(32);
        queue.add(40);

        Integer head = queue.poll();  //query and remove
        System.out.println("head : " + head);
        System.out.println("what left in the queue: " + queue);

        //tree set stores comparable instances, or transfer a comparator
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(10);
        treeSet.add(34);
        treeSet.add(81);
        treeSet.add(94);

        System.out.println("treeSet: " + treeSet);

        //how about enum? it implements Comparable interface
        Set<Directions> ds = new TreeSet<>();
        ds.add(Directions.WEST);
        ds.add(Directions.SOUTH);
        ds.add(Directions.NORTH);
        ds.add(Directions.EAST);
        System.out.println("how treeset will sort enum? : " + ds);
        //wow, they are sorted again by their natural orders as declaring 
        //the enum. 

        //list methods
        // add, remove, query, iterator, mis
        List<Integer> listX = new ArrayList<>();
        System.out.println("list: " + list);
        listX.addAll(list);
        listX.add(1000);
        System.out.println("listZ : " + listX);

        //query on object or index
        int ix = listX.indexOf(Integer.valueOf("10"));
        System.out.println("ix= " + ix);
        Integer x = listX.get(2);
        ix = listX.lastIndexOf(Integer.valueOf(1000));
        System.out.println("1000 last occurence ix : " + ix);

        List<Integer> subListX = listX.subList(1, 4);
        System.out.println("subListX : " + subListX);

        System.out.println("contains 1000 : " + listX.contains(Integer.valueOf(1000)));

        //remove by object and index
        listX.remove(Integer.valueOf(1000));
        System.out.println("after removal : " + listX);

        //firstOccurent is removed
        listX.add(0, Integer.valueOf(1000));
        System.out.println("after inserting at ix=0 : " + listX);

        //now we try to remove all 1000
        boolean done = listX.removeAll(Arrays.asList(1000));
        System.out.println("removed all 1000 from listX? " + done);
        System.out.println("lets see listX now: " + listX);

        //so when you want to remove all duplicated instances from the list, you
        //need to use removeAll(Collection specified)
        //list is an interface, it implements  both Collection and Iterable. 
        //set is an interface, it implements both Collection and Iterable.
        //Deque is an interface, it implments Queue interface, which implements collection and iterable
        Queue<Integer> que = new LinkedList<>(listX);
        Queue<Integer> aryQ = new ArrayDeque<>(listX);
        Deque<Integer> dq = new LinkedList<>(listX);
        System.out.println("Queue is a Collection?  " + (que instanceof Collection));
        System.out.println("Queue is a Collection?  " + (que instanceof Iterable));
        System.out.println("what que have ? " + que);
        //add(E) or offer(E) at the tail
        //push(E) at the head
        //query: element(), peek() on the head
        //query and remove: poll()
        //remove: remove the element

        System.out.println("query a Q head : " + que.peek());
        System.out.println("query a Q head : " + que.element());

        que.offer(Integer.valueOf(250));
        que.add(Integer.valueOf(38));
        System.out.println("what que have ? " + que);
        System.out.println("query a Q head : " + que.element());

        //Queue are implemented by Both LinkedList and arrayDeque. 
        que.add(null);
        //aryQ.add(null);
        System.out.println("what que have ? " + que);

        //Deque
        System.out.println("what deque have ? " + dq);

        dq.push(Integer.valueOf(38));
        dq.offer(Integer.valueOf(250));
        System.out.println("push head offer tail what deque have ? " + dq);
        System.out.println("query head on deque: " + dq.peek());
        System.out.println("push head offer tail what deque have ? " + dq);
        
        dq.remove();
        dq.poll();
        
        Integer[] aa = new Integer[listX.size()];
        listX.toArray(aa);
        System.out.println("List to array : " + Arrays.toString(aa));
        

    }

}
