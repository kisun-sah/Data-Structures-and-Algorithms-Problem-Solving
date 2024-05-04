/**
 * leetcode problem no : 62
 * 
 * leetcode solution link(https://leetcode.com/problems/unique-paths/)
 * 
 */

/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */


let dp = Array.from({ length: 101 }, () => Array(101).fill(-1));

function f(m, n, i, j) {
    // Base case 
    if ( i >= m) return 0;
    if ( j >= n) return 0;
    if (i === m - 1 && j === n - 1) {
        dp[i][j] = 1;
        //return dp[i][j];
    }

    if (dp[i][j] !== -1)
        return dp[i][j];

    dp[i][j] = f(m, n, i, j + 1) + f(m, n, i + 1, j);

    return dp[i][j];
}

var uniquePaths = function(m, n) {
    for (let x of dp) {
        x.fill(-1);
    }
    return f(m, n, 0, 0);
};
