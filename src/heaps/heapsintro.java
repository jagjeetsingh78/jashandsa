package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class heapsintro {

    static void main() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(293);
        pq.add(-123);
        pq.add(0);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.remove();
        System.out.println(pq.peek());
        System.out.println(pq);
         for(int ja :pq)  {
             System.out.println(ja+" ");
             System.out.println("jashan");
         }
        PriorityQueue<Integer> pm= new PriorityQueue<>(Collections.reverseOrder());
        pm.add(293);
        pm.add(-123);
        pm.add(0);
        System.out.println(pm);
        System.out.println(pm.peek());
        System.out.println(pm.size());
        pm.remove();
        System.out.println(pm.peek());
        System.out.println(pm);
    }
}
