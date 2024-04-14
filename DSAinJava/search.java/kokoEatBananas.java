/**
 * 
 * problem no 875 in leetcode;
 * 
 * leetcode link(https://leetcode.com/problems/koko-eating-bananas/)
 */

 class Solution {
    //Method to check if all bananas can be eaten at a certain speed.
    public boolean canEatAllBananasInMidSpeed(int[] piles ,int h ,int mid){

        int totalHoursByKoko = 0;
        for(int i = 0 ; i< piles.length ; i++){
           // total time to finished ith piles,using Math.cell equivalent for integers
            totalHoursByKoko += Math.ceil((double)piles[i]/mid) ;
        }

        return totalHoursByKoko <= h;
    }

    // Method to find the minimum eating speed
    public int minEatingSpeed(int[] piles, int h) {
       int lo = 1;
       int hi = 0;

        //finding the maximum value in piles
        for(int pile : piles){
            hi = Math.max(hi , pile);
        }
        //O(n)

        int ans = hi;

        while(lo <= hi){
            int mid = lo +(hi - lo)/2;  // get mid value of piles

            if(canEatAllBananasInMidSpeed(piles , h , mid)){

                ans = mid;
                hi = mid -1;

            }else{
                lo = mid+1;
            }
        }

        return ans;
    }
}