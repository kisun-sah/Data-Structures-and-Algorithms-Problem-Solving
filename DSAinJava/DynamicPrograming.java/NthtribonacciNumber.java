import java.util.Arrays;

/**
 * leetcode problem no :- 1137
 * 
 * leetcode solution like(https://leetcode.com/problems/n-th-tribonacci-number/)
 */

 class Solution {

    public static int[] dp = new int[38];
   public static int f(int n){
       //Base case 
       if(n ==0) return 0;

       if(dp[n] != -1) return dp[n];

       if(n ==1||n==2) return 1;

       int a= f(n-1);
       int b= f(n-2);
       int c= f(n-3);

       int result = (a+b+c);

       return dp[n] = result;
   }
   public int tribonacci(int n) {
       Arrays.fill(dp,-1);
       return f(n);
   }
}