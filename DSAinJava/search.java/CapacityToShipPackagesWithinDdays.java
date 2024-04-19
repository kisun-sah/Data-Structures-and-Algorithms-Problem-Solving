/**
 * problem no :- 1011 in leetcode;
 * 
 * solution link in leetcode(https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)
 * 
 * 
 */

 class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        int right = 0;
        int size = weights.length;
        int left = weights[0];

        for(int i=0; i<= size-1; i++){

            if(weights[i] > left){
                left = weights[i];
            }
            right = right+weights[i];
        }

        int ans = 0;
        while(left <= right){
            int mid = (left + right)/2;

            if(possible(weights ,days , mid)){
                ans = mid; 
                right = mid-1;
            }else{
                left = mid+1;
            }
      
        }
              return ans;

       
    }
     public  boolean possible(int []weights , int days, int capacity ){
            int currdays = 1;
            int currweights =0;

            for(int weight : weights){
                if(currweights + weight > capacity){
                    currdays ++;
                    currweights = 0;

                }
               currweights += weight;
            }
                if(days >= currdays){
                    return true;
                }
                return false;
        }

    
}