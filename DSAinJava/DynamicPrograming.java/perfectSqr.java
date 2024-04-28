/**
 * problem no :- 279
 * leetcode solution link(https://leetcode.com/problems/perfect-squares/description/)
 */
import java.util.Arrays;
public class perfectSqr {
  


     private int solve(int n, int[] dp) {
        if (n == 0) return 0;

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = n;
        for (int i = 1; i * i <= n; i++) {

            int result = 1+ solve(n-i*i,dp);
            ans = Math.min(ans, result);
        }

        dp[n] = ans;
        return ans;
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n, dp);
    }
}

   
    

