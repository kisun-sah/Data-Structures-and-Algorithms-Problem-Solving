
public static int f_bu(int i , int[] cost){
    if (cost.length <= 1) return 0;

     int prev2 = cost[0];
     int prev1 = cost[1];
     
     for (i = 2; i < cost.length; i++) {
         int current = cost[i] + Math.min(prev1, prev2);
         prev2 = prev1;
         prev1 = current;
     }
    }
public class MinCostclimbingstairsBU {

    return Math.min(f_bu(1,cost),f_bu(0,cost));
    
}
