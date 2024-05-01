/**
 * leetcode problem no :- 120
 * 
 * leetcode solution link ()
 * 
 */

/**
 * @param {number[][]} triangle
 * @return {number}
 */
let dp;
let matrix;
function f(row , col ){

   // Base case 
   if(row == matrix.length-1)
   return matrix[row] [col];

   if(dp[row][col] != -1) return dp[row][col];

   return dp[row] [col] = matrix[row ] [col ] + Math.min(f(row + 1,col ),f(row+1,col+1));


}
var minimumTotal = function(triangle) {
   dp =Array(205);
   for(i=0;i<dp.length;i++){

       dp[i] =Array(205).fill(-1);
   }
   matrix = triangle ;
   return f(0,0);
};