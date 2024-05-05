/**
 * leetcode problem no : 2742
 * 
 * leetcode solution link(https://leetcode.com/problems/painting-the-walls/)
 */
/**
 * @param {number[]} cost
 * @param {number[]} time
 * @return {number}
 */


let dp = Array.from({ length: 501 }, () => Array(501).fill(-1));
let n;

function f(idx, remain, cost, time) {
    // Base case
    if (remain <= 0)
        return 0; // no cost

    if (idx === n)
        return 1000000000; // invalid case

    if (dp[idx][remain] !== -1)
        return dp[idx][remain];

    // else
    let paint_idx = cost[idx] + f(idx + 1, remain - 1 - time[idx], cost, time);
    let No_paint = f(idx + 1, remain, cost, time);

    return dp[idx][remain] = Math.min(paint_idx, No_paint);
}

var paintWalls = function(cost, time) {
    n = cost.length;

    dp.forEach(x => x.fill(-1)); // Optimize the time

    return f(0, n, cost, time);
}
