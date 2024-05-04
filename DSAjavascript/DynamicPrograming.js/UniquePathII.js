/**
 * leetcode problem no:63
 * 
 * leetcode solution link(https://leetcode.com/problems/unique-paths-ii/)
 */

/**
 * @param {number[][]} obstacleGrid
 * @return {number}
 */


let dp = Array.from({ length: 101 }, () => Array(101).fill(-1));

function f(obstacleGrid, m, n, i, j) {
    // Basic case
    if (i < 0 || i >= m) return 0;
    if (j < 0 || j >= n) return 0;
    if (obstacleGrid[i][j] === 1) return 0;
    if (i === m - 1 && j === n - 1) {
        dp[i][j] = 1;
    }

    if (dp[i][j] !== -1) return dp[i][j];

    let right = f(obstacleGrid, m, n, i, j + 1); // col going to the right direction
    let down = f(obstacleGrid, m, n, i + 1, j); // row is going to the down direction

    dp[i][j] = right + down;

    return dp[i][j];
}

var uniquePathsWithObstacles = function(obstacleGrid) {
    let m = obstacleGrid.length; // row
    let n = obstacleGrid[0].length; // col

    for (let x of dp) {
        x.fill(-1);
    }

    return f(obstacleGrid, m, n, 0, 0);
}

    
