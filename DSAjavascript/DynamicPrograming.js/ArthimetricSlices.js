/**
 * leetcode problem no :413
 * leetcode solution link(https://leetcode.com/problems/arithmetic-slices/)
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
 



    
var numberOfArithmeticSlices = function(nums) {
    let n = nums.length;
   let ans =0;
   let dp = new Array(n).fill(0);
   
   for(let i =2;i<n;i++)
      if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])

          dp[i] = dp[i-1]+1;
      

  
  for(let i=0; i<n; i++)
  ans = ans+dp[i];

  return ans;


}
 