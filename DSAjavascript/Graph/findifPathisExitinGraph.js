/**
 * leetcode problem no (1971)
 * 
 *               (DFS) recursion
 */

/**
 * @param {number} n
 * @param {number[][]} edges
 * @param {number} source
 * @param {number} destination
 * @return {boolean}
 */
function dfs(src, dest, g, visited) {
    if (src == dest) return true;

    visited.add(src); // Add the source node to visited

    for (const neighbour of g[src]) {
        if (!visited.has(neighbour)) {
            // If we have not already visited the neighbour, go deeper
            if (dfs(neighbour, dest, g, visited)) {
                return true;
            }
        }
    }
    return false;
}

var validPath = function(n, edges, source, destination) {
    // Create the graph
    const g = new Array(n);

    for(let i=0; i<n; i++){

        g[i] =[];
    }

    // Populate the graph
    for (let i = 0; i < edges.length; i++) {
        let u = edges[i][0];
        let v = edges[i][1];
        g[u].push(v);
        g[v].push(u);
    }

    // Call dfs to check if there is a valid path
    return dfs(source, destination, g, new Set());
};
