import java.util.Arrays;

/**
 * leetcode problem no: 
 * leetcode solution link(https://leetcode.com/problems/number-of-longest-increasing-subsequence/)
 */
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n], count = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        int res = 0, maxi = 1;

        for (int i = 0; i < n; ++i) {
            for (int f = 0; f < i; ++f) {
                if (nums[f] < nums[i] && 1 + dp[f] > dp[i]) {
                    dp[i] = 1 + dp[f];
                    count[i] = count[f];
                } else if (nums[f] < nums[i] && 1 + dp[f] == dp[i])
                    count[i] += count[f];
            }
            maxi = Math.max(maxi, dp[i]);
        }

        for (int i = 0; i < n; ++i) {
            if (dp[i] == maxi)
                res += count[i];
        }

        return res;
    }
}