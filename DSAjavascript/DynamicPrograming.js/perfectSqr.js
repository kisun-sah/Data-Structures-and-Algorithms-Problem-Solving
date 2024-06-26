/**
 * leetcode problem no;- 279
 * 
 * leetcode solution link (https://leetcode.com/problems/perfect-squares/description/)
 */

/**
 * @param {number} n
 * @return {number}
 */
function dp(num, memo) {
    if(num < 0) return 10000;
    if(num === 0) return 0;
    if(memo[num] !== -1) return memo[num];
    let mini = 100000;
    for(let i = 1; i <= 100; i++) {
        mini = Math.min(mini, 1 + dp(num - i*i, memo));
    }
    return memo[num] = mini;
}

var numSquares = function(n) {
    let memo = Array(10001).fill(-1);
    return dp(n, memo);
};

