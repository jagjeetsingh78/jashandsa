package graphs;

import java.util.*;

public class checkpathexits {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // Step 1: Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Fill graph (undirected)
        for (int k = 0; k < edges.length; k++) {
            int a = edges[k][0];
            int b = edges[k][1];

            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        // Step 3: Visited array
        boolean[] visited = new boolean[n];

        // Step 4: BFS
        bfs(source, adj, destination, visited);

        // Step 5: Check destination
        return visited[destination];
    }

    // ✅ Correct BFS
    static void bfs(int source, List<List<Integer>> adj, int destination, boolean[] visited) {

        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            // 🔥 Optimization: stop early
            if (node == destination) return;

            for (int ele : adj.get(node)) {
                if (!visited[ele]) {   // ✅ FIXED CONDITION
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }
    }
}