/**
 * 
 * leetcode problem no: 337
 * 
 * leetcode solution link(https://leetcode.com/problems/combination-sum-iv/description/)
 */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

let arr;
let dp;

function f ( target){

    //Base case

    if ( target == 0)
    return 1;

    if (dp[target ] != -1){
        return dp[target];
    }

  let  result = 0;
  let n = arr.length;
    for(let  k  = 0; k<n ; k++)
       if( target - arr[k] >= 0){

        result  += f(target - arr[k]);
         
       }

      return dp[target] = result;


}
var combinationSum4 = function(nums, target) {
  arr = nums;
    dp = Array(1005).fill(-1);
    
     return f(target);
};