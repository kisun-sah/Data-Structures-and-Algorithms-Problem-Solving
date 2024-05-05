import java.util.Arrays;

/**
 * leetcode problem no : 2742
 * 
 * leetcode solution link(https://leetcode.com/problems/painting-the-walls/)
 */class PaintingtheWalls {

    public static int[][] dp = new int[501][501];
    public static int n;
    public static int f(int idx , int remain ,int[] cost ,int[] time ){

        //Base case
        if(remain <= 0)
        return 0 ; // no cost

        if(idx == n)
            return 1000000000; // invalid case 

            if(dp[idx][remain] != -1)
             return dp[idx][remain]; // 

            // else 
           
            int paint_idx = cost[idx] + f(idx +1 , remain - 1 -time[idx] , cost , time);
            int No_paint = f(idx+1 , remain , cost ,time);

       

            return  dp[idx][remain] =  Math.min(paint_idx , No_paint);
        
    }
    public int paintWalls(int[] cost, int[] time) {

        n = cost.length;

        for(int[] x : dp){
            Arrays.fill(x ,-1); // otimize the time 
        }
        return f(0 , n ,cost , time);

        
    }
}