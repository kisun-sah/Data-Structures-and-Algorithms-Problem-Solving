/**
 * leetcode problem no :- 81
 * leetcode solution link(https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
 */

 class Solution {
    public boolean search(int[] nums, int target) {

        int s =0;
        int e= nums.length -1;

        while(s <= e){

            int mid = s+ (e-s)/2;

            if(nums[mid] == target){
                return true;
            }
            if(nums[mid ] == nums[s]){

                s++;
                continue;
            }
            // check target is left side
            if(nums[s] < nums[mid]){
                if(target < nums[mid] && target >= nums[s]){
                    e =mid -1;
                }else{
                    s = mid +1;
                }
               
                } else{
                    //check target is right side 
                    if(target > nums[mid] && target <= nums[e]){

                        s = mid +1;
                    }else{

                        e =mid-1;
                        
                    }
            }
        }
        return false;
    }
}