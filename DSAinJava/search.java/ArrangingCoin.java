/**
 * problem no :- 441 leetrcode 
 * 
 * leetcode solution link(https://leetcode.com/problems/arranging-coins/submissions/1228015361/)
 * 
 */


public class ArrangingCoin {
    
        public int arrangeCoins(int n) {
    
            
        long  lo = 1; 
        long   hi = n;
        long  ans =1;
    
        while(lo<=hi){
            long  mid = lo+ (hi-lo)/2;
             long  value =(mid*(mid+1))/2 ;
    
             //if(value == n)
             if(value <= n){
                ans = mid;
                lo=mid+1;
             }else{
    
                hi = mid -1;
             }
        }
    
            return (int)ans;
    
            
        }
    
}
