
/**
 * leetcode problem no (1971)
 * 
 *               (BFS) recursion
 */
/**
 * @param {number} n
 * @param {number[][]} edges
 * @param {number} source
 * @param {number} destination
 * @return {boolean}

 BFS
 */
 function bfs(src , dest , g, visited){
    if(src == dest) return true;

    const qu = [];
    qu.push(src);

    visited.add(src);
    while(!qu.length == 0){
        const el = qu.shift();
        for(const neighbour of g[el]){
            if(neighbour == dest) return true;

            if(!visited.has(neighbour)){
                visited.add(neighbour);
                qu.push(neighbour);
            }
        }
    }
    return false;
 }
var validPath = function(n, edges, source, destination) {

    // create the graph 
    const g = new Array(n);
    for(let i=0; i<n; i++){
        g[i] =[];
    }

    // populated the graph
    for(let i=0; i<edges.length; i++){

        let u = edges[i][0];
        let v = edges[i][1];
        g[u].push(v);
        g[v].push(u);
    }
    return bfs(source , destination , g , new Set());
    
};