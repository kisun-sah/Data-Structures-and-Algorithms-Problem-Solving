/**
 * leetcode problem : 740
 * 
 * leetcode link(https://leetcode.com/problems/delete-and-earn/)
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
let dp;
function f(nums ,i){
   //Base case 
   let n = nums.length;
   if(i >=n) return 0;

   if(dp[i] != -1) return dp[i];

   let result;
   result = Math.max(f(nums ,i+1), f(nums, i+2) +nums[i] *i);
   return dp[i]= result;
}
var deleteAndEarn = function(nums) {
   dp = Array(10001).fill(-1);
   let max = 0;
   for (let i of nums) 
       max = Math.max(max, i);
   let map = new Array(max + 1).fill(0);
  
   for (let i of nums) 
       map[i]++;
   return f(map, 1);

  
}

