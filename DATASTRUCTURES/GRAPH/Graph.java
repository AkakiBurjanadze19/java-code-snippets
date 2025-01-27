package DATASTRUCTURES.GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private int vertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>();

        // initialize the adjacency list
        for (int i = 0; i < this.vertices; i++) {
            this.adjacencyList.add(new ArrayList<>());
        }
    }

    // Create an edge between two vertices
    public void addEdge(int source, int destination) {
        this.adjacencyList.get(source).add(destination);
        this.adjacencyList.get(destination).add(source);
    }

    // Perform breadth-first-search traversal on the graph
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[this.vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.println(currentVertex + " ");

            List<Integer> neighbors = this.adjacencyList.get(currentVertex);
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Perform depth-first-traversal on the graph
    public void dfs(int startVertex) {
        boolean[] visited = new boolean[this.vertices];
        dfsUntil(startVertex, visited);
        System.out.println();
    }

    public void dfsUntil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.println(vertex + " ");

        List<Integer> neighbors = this.adjacencyList.get(vertex);
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                dfsUntil(neighbor, visited);
            }
        }
    }
}
