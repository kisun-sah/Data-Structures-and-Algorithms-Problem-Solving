/**
 * leetcode problem no:746
 * 
 * leetcode solution link(https://leetcode.com/problems/min-cost-climbing-stairs/)
 */
/**
 * @param {number[]} cost
 * @return {number}
 */

let dp;
function f(i , cost){
   let n =cost.length;
   if(i >=n) return 0;

   if(dp[i] != -1) return dp[i];

   let a= cost[i]+f(i+1,cost);
   let b= cost[i]+f(i+2,cost);

   let result =Math.min(a,b);

   return dp[i]= result;
}
var minCostClimbingStairs = function(cost) {
    
    dp = Array(1000).fill(-1);
   return Math.min(f(0,cost), f(1, cost));
   
};