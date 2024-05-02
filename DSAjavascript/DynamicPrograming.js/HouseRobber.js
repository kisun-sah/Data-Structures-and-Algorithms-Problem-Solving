/**
 * leetcode problem no : 198
 * leetcode solution lin(https://leetcode.com/problems/house-robber/)
 * 
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
let dp;
function f(nums,i){
   //Base case 
   let n= nums.length;
   if(i >= n) return 0;
 
   if(dp[i] != -1) return dp[i];

   let take= nums[i] + f(nums,i+2);
   let skip= f(nums,i+1);

   let result = Math.max(take,skip);

   return dp[i] =result;
}
var rob = function(nums) {
   
   dp = Array(101).fill(-1);
   return f(nums,0);
   
};