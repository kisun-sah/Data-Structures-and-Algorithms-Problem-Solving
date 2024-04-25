import java.util.Arrays;

/**
 * leetcode problem no 322
 * leetcode solution lin(https://leetcode.com/problems/coin-change/)
 */

 class coinChange {

    public static int[] c; // global coin array
    public static int[] dp;
    public int f(int amount ){
        if(amount < 0) return Integer.MAX_VALUE; //if ans is less then 0  then it's not possible
        if(amount == 0 ) return 0; // if ans is 0 , give nothing

        if(dp[amount ] != -1) return dp[amount]; 

        int ans= Integer.MAX_VALUE;
        int  n= c.length;
        for(int i =0; i<n; i++){
            if(amount >= c[i]){
                ans = Math.min(ans , f(amount - c[i]));
            }
        }

        // if ans is still Integer.MAX_VALUE , then this amount is not  possible
        if(ans == Integer.MAX_VALUE){

            return dp[amount] =Integer.MAX_VALUE;
        }
        return dp[amount] =1 + ans;
    }
    public int coinChange(int[] coins, int amount) {

        c =coins;
        dp = new int[10005];
        Arrays.fill(dp,-1);
        int ans = f(amount);
        return (ans == Integer.MAX_VALUE) ? -1 : ans;


     
        
        
    }
}

