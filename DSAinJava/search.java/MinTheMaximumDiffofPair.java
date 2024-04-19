import java.util.Arrays;

/**
 * 
 * leetcode problem no :- 2616 
 * leetcode solution link(https://leetcode.com/problems/minimize-the-maximum-difference-of-pairs/submissions/1234261497/)
 * 
 */
class MinTheMaximumDiffofPair {

    private boolean conformatleastPpairwithatmosMindiff(int[] nums , int p , int mid){
        int countpair = 0;
        int i = 0;
        while(i < nums.length-1){
            if(nums[i+1]-nums[i]<= mid){
                countpair ++;
                i +=2;
            }else{
                i++;
            }
        }
        return countpair >= p;
    }
    public int minimizeMax(int[] nums, int p) {
          
          Arrays.sort(nums);
        int n= nums.length;
        int lo = 0;
        int hi = nums[n-1]-nums[0];
        int ans = hi;

        while(lo <= hi){

            int mid = lo + (hi -lo )/2;

            if(conformatleastPpairwithatmosMindiff(nums , p , mid)){
                ans =mid;
                hi = mid -1 ;

            }else{

                lo = mid + 1;

            }
            

        }

        return ans;
        
        
    }
};