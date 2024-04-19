/**
 * leetcode problem no :- 33
 * leetcode solution link (https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1236726053/)
 */
class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0 ;
        int n = nums.length;
        int end = n -1;

        while(start <= end ){

            int mid = start + (end - start )/2;

            if(nums[mid] == target ){

                return mid;

            }
            // ckeck condition target is present in left side or not

            if(nums[start] <= nums[mid]){
                if(target < nums[mid] && target >= nums[start]){

                    end = mid -1;
                }else{
                     start = mid + 1;
                }
            }
            // check the condition target is present in the right side or not 

            else{
                if(target > nums [mid ] && target <= nums[end]){

                    start = mid +1;

                }else{
                    end = mid -1;
                }
            }
        }
        return -1;

    }
}