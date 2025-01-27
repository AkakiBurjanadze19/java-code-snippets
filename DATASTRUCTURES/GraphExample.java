package DATASTRUCTURES;

public class GraphExample {
    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        System.out.println("BFS traversal: ");
        graph.bfs(0);

        System.out.println("DFS traversal: ");
        graph.dfs(0);
    }
}
