import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final int vertices;
    private final List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjacencyList.get(vertex);
    }

    public int getVertices() {
        return vertices;
    }

    public void printGraph() {
        for (int vertex = 0; vertex < vertices; vertex++) {
            System.out.println(vertex + " -> " + adjacencyList.get(vertex));
        }
    }

    public static Graph createSampleGraph() {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        return graph;
    }

    public static void main(String[] args) {
        Graph graph = createSampleGraph();
        graph.printGraph();
    }
}
