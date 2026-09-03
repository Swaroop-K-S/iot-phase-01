package day12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    static boolean isBipartite(final int graph[][]) {
        final int n = graph.length;
        final int color[] = new int[n];
        Arrays.fill(color, -1);
        final Queue<Integer> queue = new LinkedList<>();
        for (int start = 0; start < n; start++) {
            if (color[start] != -1)
                continue;
            color[start] = 0;
            queue.add(start);
            while (!queue.isEmpty()) {
                int current = queue.poll();
                for (int next : graph[current]) {
                    if (color[next] == -1) {
                        color[next] = 1 - color[current];
                        queue.add(next);
                    } else if (color[next] == color[current]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(final String[] args) {
        int[][] graph = { { 1, 2 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };
        System.out.println(isBipartite(graph));
    }
}
