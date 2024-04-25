/**
 * leetcode problem no 322
 * leetcode solution lin(https://leetcode.com/problems/coin-change/)
 */
/**
 * @param {number[]} coins
 * @param {number} amount
 * @return {number}
 */
var coinChange = function(coins, amount) {
    let dp = new Array(amount+1).fill(0);
    //from dp[0] to dp[amount]
    //init dp[0] = 0
    //calculate dp[1] to dp[amount]
    for(let i=1; i<=amount; i++) {
        let min = Number.POSITIVE_INFINITY
        for(j=0; j<coins.length; j++) {
            if(i-coins[j]>=0) {
                min = Math.min(min, 1+dp[i-coins[j]])
            }
        }
        dp[i] = min
    }
    return dp[amount] !=  Number.POSITIVE_INFINITY ? dp[amount] : -1
};
