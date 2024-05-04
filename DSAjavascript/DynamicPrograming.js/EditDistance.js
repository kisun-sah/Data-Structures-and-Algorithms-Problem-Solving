/**
 * leetcode problem no: 72
 * 
 * leetcode solution lin(https://leetcode.com/problems/edit-distance/)
 * 
 */
/**
 * @param {string} word1
 * @param {string} word2
 * @return {number}
 */
let dp = Array.from({ length: 505 }, () => Array(505).fill(-1));

function f(word1 ,word2 ,i , j){

   //Base case 
   if(i ==word1.length)
     return word2.length-j;

     if(j == word2.length)
       return word1.length-i;

       if(dp[i][j] != -1){
           return dp[i][j];
       }

   
   //let ans ;
   if(word1[i] == word2[j]){

       return dp[i][j] =f(word1 ,word2 , i+1, j+1);
   }else{
       //Insert
       let insAns =1+ f(word1 ,word2 ,i,j+1);

       //Delete
       let delAns = 1+ f(word1 , word2 ,i+1 , j);

       //Replace
       let repAns = 1+f(word1 ,word2 ,i+1 ,j+1);

       dp[i][j] = Math.min(insAns , Math.min(delAns , repAns));
   }
   return dp[i][j];
}
var minDistance = function(word1, word2) {

  for (let x of dp) {
       x.fill(-1);
   }
    return f(word1 ,word2 ,0 ,0);
   
};