/**
 * leetcode problem no :- 300
 * leetcode solution link(https://leetcode.com/problems/longest-increasing-subsequence/)
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
 
let  arr;
let  dp; 

 function  f( i){

     //Base case 
     if(i == 0) return 1;

     if(dp[i] != -1) return dp[i];

      result =1;
     for(let j=0; j<=i-1; j++){
         if(arr[j] < arr[i]) {

             result = Math.max(result , 1+ f(j));
         }
     }
     return dp[i] = result ;
 }
var lengthOfLIS = function(nums) {
  let ans = Number.MIN_SAFE_INTEGER ;

     dp =Array(2505).fill(-1);

     arr = nums;
     for( i=0 ; i< nums.length ; i++){
         ans = Math.max(ans , f(i));
     }
     return ans;
 }
 
