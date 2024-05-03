/**
 * leetcode problem no :- 1137
 * 
 * leetcode solution like(https://leetcode.com/problems/n-th-tribonacci-number/)
 */

/**
 * @param {number} n
 * @return {number}
 */
let dp; 
function f(n){

   //Base case 

   if(n == 0)
   return 0;

   if(n==1 || n==2) return 1;

  if(dp[n] != -1) return dp[n]; // optimize the time 

   let  result;
   let a = f(n-1);
   let b = f(n-2);
   let c = f(n-3);

   result =(a+b+c);

   return dp[n] =result;
}
var tribonacci = function(n) {

   dp = Array(38).fill(-1);
   return f(n);
   
};