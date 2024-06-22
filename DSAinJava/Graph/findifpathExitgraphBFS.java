import java.util.*;
/**
 * leetcode problem no (1971)
 * 
 *               (BFS) recursion
 */

public class findifpathExitgraphBFS {
    
    // DFS function
    @SuppressWarnings("unused")
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

    // BFS function
    private boolean bfs(int src, int dest, List<List<Integer>> graph, Set<Integer> visited) {
        if (src == dest) return true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited.add(src);

        while (!queue.isEmpty()) {
            int el = queue.poll();
            for (int neighbour : graph.get(el)) {
                if (neighbour == dest) return true;
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
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

        // Uncomment one of the following lines to use either DFS or BFS
        // return dfs(source, destination, graph, new HashSet<>());
        return bfs(source, destination, graph, new HashSet<>());
    }
}

   




    

