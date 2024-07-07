/**
 * leetcode problem no : 200
 * 
 * leetcode solution link (https://leetcode.com/problems/number-of-islands/)
 */

/**
 * @param {character[][]} grid
 * @return {number}
 */
const dir = [
    [1, 0],
    [-1, 0],
    [0, 1],
    [0, -1]
];
function dfs(grid, i, j) {
    if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] !== '1') {
        return;
    }

    grid[i][j] = '$';

    for (const [di, dj] of dir) {
        dfs(grid, i + di, j + dj);
    }
}

var numIslands = function(grid) {




if (grid.length === 0) {
    return 0;
}

const m = grid.length;
const n = grid[0].length;
let count = 0;

for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
        if (grid[i][j] === '1') {
            dfs(grid, i, j);
            count++;
        }
    }
}

return count;
};

