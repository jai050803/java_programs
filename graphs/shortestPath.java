import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class ShortestPath {
    public static int shortestPath(Map<Integer, List<Integer>> graph, int src, int dst) {
        if (src == dst) return 0;
        if (!graph.containsKey(src)) return -1;

        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer, Integer> distance = new HashMap<>();

        queue.add(src);
        distance.put(src, 0);

        while (!queue.isEmpty()) {
            int currentVertex = queue.remove();
            int currentDistance = distance.get(currentVertex);

            for (int neighbor : graph.getOrDefault(currentVertex, new ArrayList<>())) {
                if (!distance.containsKey(neighbor)) {
                    int neighborDistance = currentDistance + 1;
                    if (neighbor == dst) return neighborDistance;

                    distance.put(neighbor, neighborDistance);
                    queue.add(neighbor);
                }
            }
        }

        return -1;
    }

    private static Map<Integer, List<Integer>> buildGraph(int vertices, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int vertex = 0; vertex < vertices; vertex++) {
            graph.put(vertex, new ArrayList<>());
        }

        for (int[] edge : edges) {
            int source = edge[0];
            int destination = edge[1];
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }

        return graph;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
        Map<Integer, List<Integer>> graph = buildGraph(n, edges);

        int answer = shortestPath(graph, 0, 4);
        System.out.println("Shortest path from 0 to 4: " + answer);
    }
}
