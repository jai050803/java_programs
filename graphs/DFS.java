public class DFS {
    public static void traverse(Graph graph, int startVertex) {
        boolean[] visited = new boolean[graph.getVertices()];
        traverseFrom(graph, startVertex, visited);
    }

    private static void traverseFrom(Graph graph, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : graph.getNeighbors(vertex)) {
            if (!visited[neighbor]) {
                traverseFrom(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = Graph.createSampleGraph();
        System.out.print("DFS traversal: ");
        traverse(graph, 0);
        System.out.println();
    }
}
