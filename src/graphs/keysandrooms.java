package graphs;
import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();
        q.add(0);           // start from room 0
        visited[0] = true;

        while (!q.isEmpty()) {
            int room = q.poll();

            for (int key : rooms.get(room)) {
                if (!visited[key]) {
                    visited[key] = true;
                    q.add(key);
                }
            }
        }

        // check if all rooms are visited
        for (int i = 0; i < n; i++) {
            if (!visited[i]) return false;
        }

        return true;
    }
}
public class keysandrooms {


    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {

            int n = rooms.size();
            boolean[] visited = new boolean[n];

            Queue<Integer> q = new LinkedList<>();
            q.add(0);           // start from room 0
            visited[0] = true;

            while (!q.isEmpty()) {
                int room = q.poll();

                for (int key : rooms.get(room)) {
                    if (!visited[key]) {
                        visited[key] = true;
                        q.add(key);
                    }
                }
            }

            // check if all rooms are visited
            for (int i = 0; i < n; i++) {
                if (!visited[i]) return false;
            }

            return true;
        }
    }
}
