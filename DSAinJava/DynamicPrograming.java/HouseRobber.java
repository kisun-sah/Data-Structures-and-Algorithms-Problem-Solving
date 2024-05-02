
/**
 * leetcode problem no : 198
 * leetcode solution lin(https://leetcode.com/problems/house-robber/)
 * 
 */
import java.util.Arrays;

public class HouseRobber {

       // Top down approach 
    public static int[] dp = new int[101];
    public static int f(int[] nums , int i){

        //Base case
      int   n= nums.length;
        if(i >= n) return 0;

        if(dp[i] != -1) return dp[i];

        int take = nums[i] +f(nums,i+2);
        int skip =f(nums,i+1);

        int result = Math.max(take,skip);
        
        return dp[i] = result;
    }
    public int rob(int[] nums) {
   
       Arrays.fill(dp,-1);
        return f(nums,0);
        
    }
    
}
