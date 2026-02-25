package queues;

import java.util.LinkedList;
import java.util.Queue;

public class printqueue {

    static void main() {


        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
       printjashan(q);


    }



    static void  printjashan(Queue<Integer> q){

        int n = q.size();
        for(int i =0; i<n ;i++){

            int m = q.remove();
            IO.println(m);
            q.add(m);
        }
   }



}
