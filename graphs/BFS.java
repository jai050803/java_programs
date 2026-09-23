import java.util.ArrayDeque;
import java.util.Queue;

public class BFS {
    public static void traverse(Graph graph, int startVertex) {
        boolean[] visited = new boolean[graph.getVertices()];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.remove();
            System.out.print(currentVertex + " ");

            for (int neighbor : graph.getNeighbors(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = Graph.createSampleGraph();
        System.out.print("BFS traversal: ");
        traverse(graph, 0);
        System.out.println();
    }
}
