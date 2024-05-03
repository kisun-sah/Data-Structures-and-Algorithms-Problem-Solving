/**
 * leetcode problem : 740
 * 
 * leetcode link(https://leetcode.com/problems/delete-and-earn/)
 */
public class EarnandDelete {
    Integer[] dp;
    public int sol(int[] map,int idx){
       if(idx>=map.length) return 0;
       if(dp[idx]!=null) return dp[idx];
       
       int result=Math.max(sol(map,idx+1),sol(map,idx+2)+map[idx]*idx);
       return dp[idx]=result;
   }
   public int deleteAndEarn(int[] nums) {
       int max=0;
       for(int i:nums) max=Math.max(max,i);
       int map[]=new int[max+1];
       dp=new Integer[max+1];
       for(int i:nums) map[i]++;
       return sol(map,1);
   }
    
}
