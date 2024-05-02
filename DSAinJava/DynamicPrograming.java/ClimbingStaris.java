import java.util.Arrays;

/**
 * leetcode problem no :- 70
 * 
 * leetcode solution link(https://leetcode.com/problems/climbing-stairs/)
 */
public class ClimbingStaris {

     public static int[] dp = new int[46];
    public static int f(int n){
        //Base case 
        if(n<0) return 0;

        if(dp[n] != -1){
          return dp[n];
        }

        int res =0;
        int one_st =0;
        int two_st =1;
        for(int i=0 ;i<n; i++){
            
            res = one_st + two_st;
            one_st =  two_st;
            two_st = res;


        }
        return dp[n] =res;
    }
    public int climbStairs(int n) {
         
         Arrays.fill(dp, -1);
       return  f(n);
    }  
    
    
}
