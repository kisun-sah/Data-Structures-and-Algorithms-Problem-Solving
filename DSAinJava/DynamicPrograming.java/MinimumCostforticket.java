import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * leetcode problem no : 983
 * leetcode solution link(https://leetcode.com/problems/minimum-cost-for-tickets/)
 * 
 */

 class Solution {


    public static int[] c;
    public static int lastday;
    public static int[] dp;
    public static HashSet<Integer> s;

    public static int f(int day){
         if (day > lastday) return 0;

        if (!s.contains(day)) return f(day + 1);

        if (dp[day] != -1) return dp[day];
        
        int ans = Math.min(c[0] + f(day + 1), Math.min(c[1] + f(day + 7), c[2] + f(day + 30)));

        return dp[day] = ans;
    }
    public int mincostTickets(int[] days, int[] costs) {
        
      dp = new int[400];
        Arrays.fill(dp, -1);
        s = new HashSet<>();
        for (int day : days) {
            s.add(day);
        }
        c = costs;
        lastday = days[days.length - 1];
        return f(1);
    }
        
    }
