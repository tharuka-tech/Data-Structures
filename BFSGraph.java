package graphTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSGraph {

	private Map<Character, List<Character>> adjacencyList;

    public BFSGraph() {
        adjacencyList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(char vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge to the graph
    public void addEdge(char source, char destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source); // For undirected graph
    }

    // Perform BFS starting from a given vertex
    public void bfs(char startVertex) {
        Set<Character> visited = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        
        // Start BFS with the initial vertex
        visited.add(startVertex);
        queue.add(startVertex);
        
        while (!queue.isEmpty()) {
            char vertex = queue.poll();
            System.out.print(vertex + " ");
            
            // Visit all the adjacent vertices
            for (char neighbor : adjacencyList.getOrDefault(vertex, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BFSGraph graph = new BFSGraph();

	        // Adding vertices
	        graph.addVertex('A');
	        graph.addVertex('B');
	        graph.addVertex('C');
	        graph.addVertex('D');

	        // Adding edges
	        graph.addEdge('A', 'B');
	        graph.addEdge('A', 'C');
	        graph.addEdge('B', 'D');
	        graph.addEdge('C', 'D');

	        System.out.println("BFS starting from vertex A:");
	        graph.bfs('A');

	}

}
