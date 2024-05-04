/**
 * leetcode problem no:64
 * 
 * leetcode solution lin(https://leetcode.com/problems/minimum-path-sum/)
 */
/**
 * @param {number[][]} grid
 * @return {number}
 */

let dp = Array.from({ length: 205 }, () => Array(205).fill(-1));

function f(grid, row, col, m, n) {
    // Base case
    if (row === m - 1 && col === n - 1)
        return grid[row][col];

    if (dp[row][col] !== -1) return dp[row][col];

    if (row === m - 1) // on going to the right direction
        return dp[row][col] = grid[row][col] + f(grid, row, col + 1, m, n);

    if (col === n - 1) // on going down direction
        return dp[row][col] = grid[row][col] + f(grid, row + 1, col, m, n);

    return dp[row][col] = grid[row][col] + Math.min(f(grid, row, col + 1, m, n), f(grid, row + 1, col, m, n));
}

var minPathSum = function(grid) {
    let m = grid.length; // row
    let n = grid[0].length; // col

    for (let x of dp) {
        x.fill(-1);
    }

    return f(grid, 0, 0, m, n);
}

    
