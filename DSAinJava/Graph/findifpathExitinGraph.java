/**
 * leetcode problem no (1971)
 * 
 *               (DFS) recursion
 */
import java.util.*;

 class Solution {
    
    // DFS function
    private boolean dfs(int src, int dest, List<List<Integer>> graph, Set<Integer> visited) {
        if (src == dest) return true;

        visited.add(src); // Add the source node to visited

        for (int neighbour : graph.get(src)) {
            if (!visited.contains(neighbour)) {
                if (dfs(neighbour, dest, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Main function to check if a valid path exists
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // Create the graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Populate the graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Call dfs to check if there is a valid path
        return dfs(source, destination, graph, new HashSet<>());
    }


}
