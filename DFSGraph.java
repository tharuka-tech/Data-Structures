package graphTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSGraph {
	private Map<Character, List<Character>> adjacencyList;

    public DFSGraph() {
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

    // Perform DFS starting from a given vertex
    public void dfs(char startVertex) {
        Set<Character> visited = new HashSet<>();
        dfsRecursive(startVertex, visited);
    }

    // Recursive DFS helper method
    private void dfsRecursive(char vertex, Set<Character> visited) {
        // Mark the current vertex as visited
        visited.add(vertex);
        System.out.print(vertex + " ");

        // Recur for all the adjacent vertices
        for (char neighbor : adjacencyList.getOrDefault(vertex, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DFSGraph graph = new DFSGraph();
		        
		       
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
		
		System.out.println("DFS starting from vertex A:");
		graph.dfs('A');

	}

}
