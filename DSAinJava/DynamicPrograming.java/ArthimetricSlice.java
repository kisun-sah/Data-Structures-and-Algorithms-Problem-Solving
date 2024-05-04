/**
 * leetcode problem no :413
 * leetcode solution link(https://leetcode.com/problems/arithmetic-slices/)
 */
public class ArthimetricSlice {
    public int numberOfArithmeticSlices(int[] nums) {

        int  n = nums.length;
        int[] dp = new int[n];
         int ans =0;
 
        for(int i =2;i<n;i++){
         
          if(nums[i] - nums[i-1] == nums[i-1] -nums[i-2]){
 
             dp[i]= dp[i-1]+1;
          }
        }
 
       for(int i =0; i<n; i++){
 
         ans = ans+dp[i];
       }
 
 
      return ans;
         
     }
}
