package heaps;
import java.util.*;
public class laststone {
    static void main() {
        int[] arr = {2,7,4,1,8,1};

        lastStoneWeight(arr);

    }



      static void  lastStoneWeight(int[] stones) {

//            if (stones.length == 1) return stones[0];

            Arrays.sort(stones);

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(stones[stones.length - 1]);
          System.out.println(pq);


            for (int j = stones.length - 2; j >= 0; j--) {
                if(pq.isEmpty()) {
                    pq.add(stones[j]);
                }
                if (!pq.isEmpty() && stones[j] > pq.peek()) {
                    int m = pq.remove();

                    pq.add(stones[j] - m);
//                    System.out.println((stones[j] - m));
//                    System.out.println(pq);
//                    System.out.println("1");
                }

                if (!pq.isEmpty() && stones[j] == pq.peek()) {
                      pq.remove();
//                     System.out.println("all elements are removed ");
//                    System.out.println("2");
                }

                if (!pq.isEmpty() && stones[j] < pq.peek()) {
                    int m = pq.remove();
                    pq.add(m - stones[j]);
//                    System.out.println(m - stones[j]);
//                    System.out.println("3");
                }
                System.out.println(pq);
            }

            System.out.println(pq);







        }

}
