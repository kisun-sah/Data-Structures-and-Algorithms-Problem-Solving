/**
 * leetcode problem no :- 70
 * 
 * leetcode solution link(https://leetcode.com/problems/climbing-stairs/)
 */

/**
 * @param {number} n
 * @return {number}
 */
let dp;
function f(n){

   //Base case 
   if(n <0){
       return 0;
   }
   if(dp[n] !== -1) return dp[n];
   

       let res =0;
       let one_st =0;
       let two_st =1;

       for(let i=0;i<n;i++){

           res = one_st + two_st;
           one_st = two_st;
           two_st = res;

       }
         return dp[n] = res;
          
}

var climbStairs = function(n) {

   dp =Array(46).fill(-1);
   return f(n);

   
};