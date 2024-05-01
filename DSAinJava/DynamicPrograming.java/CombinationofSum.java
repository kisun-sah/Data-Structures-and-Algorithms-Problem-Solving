/**
 * leetcode problem no : 337
 * 
 * leetcode solution link (https://leetcode.com/problems/combination-sum-iv/description/)
 */

import java.util.Arrays;

public class CombinationofSum {

       public static int[] arr;
     public static int[] dp = new int[1005];

    public static int f (int target){

        //Base case

        if ( target == 0)
        return 1;
    
        if (dp[target ] != -1){
            return dp[target];
        }

      int  result = 0;
      int n = arr.length;
        for(int k  = 0; k<n ; k++)
           if( target - arr[k] >= 0){
  
            result  += f(target - arr[k]);
             
           }

          return dp[target] = result;


    }
    public int combinationSum4(int[] nums, int target) {
         arr = nums;
           Arrays.fill(dp , -1);  
        
         return f(target);
    }
    
}
