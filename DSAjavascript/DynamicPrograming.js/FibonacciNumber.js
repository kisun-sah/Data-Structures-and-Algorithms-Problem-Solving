/**
 * leetcode problem no :-509
 * leetcode solution link (https://leetcode.com/problems/fibonacci-number/JavaScript/)
 */

/**
 * @param {number} n
 * @return {number}
 */

let dp=[]  ; // Array to store computed values

function f(n) {
    if (n === 0 || n === 1)
        return n; // Base case for Fibonacci sequence

    if (dp[n] !== -1)
        return dp[n]; // If value is already computed, return it from dp array

    // If the value is not computed yet, compute it recursively
    return dp[n] = f(n - 1) + f(n - 2);
}
var fib = function(n) {
    dp = new Array(100005).fill(-1);
     return f(n);
    
};