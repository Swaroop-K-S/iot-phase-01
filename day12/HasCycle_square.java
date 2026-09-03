package day12;

import java.util.LinkedList;
import java.util.Queue;

public class HasCycle_square {
    public static void main(String[] args) {

        int[][] graph = {
                { 1, 3 },
                { 0, 2 },
                { 1, 3 },
                { 0, 2 }
        };

        boolean[] visited = new boolean[4];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.add(next);
                } else {
                    System.out.println("Cycle Found");
                    return;
                }
            }
        }

        System.out.println("No Cycle");
    }
}
