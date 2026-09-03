package day12;

public class HasCYCLE {

    static boolean dfs(int node, int parent, int[][] graph, boolean[] visited) {
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                if (dfs(next, node, graph, visited))
                    return true;
            } else if (next != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] graph = {
                { 1, 2 },
                { 0, 2 },
                { 0, 1 }
        };

        boolean[] visited = new boolean[3];

        System.out.println(dfs(0, -1, graph, visited)
                ? "Cycle Found"
                : "No Cycle");
    }
}
