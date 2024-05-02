/**
 * leetcode problem no:746
 * 
 * leetcode solution link(https://leetcode.com/problems/min-cost-climbing-stairs/)
 */
import java.util.Arrays;

public class MinCostclimbingStairs {
  int[] dp=new int[1000];
    public int f(int i , int[] cost){
         int n = cost.length;
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];

        int result =cost[i]+Math.min(f(i+1,cost),f(i+2,cost));
        return dp[i] = result;
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
      
        Arrays.fill(dp,-1);
        return Math.min(f(1,cost),f(0,cost));
    }
    
}
