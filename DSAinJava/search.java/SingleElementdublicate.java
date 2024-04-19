  /**
   * leetcode problem no 540
   * leetcode solution link(https://leetcode.com/problems/single-element-in-a-sorted-array/)
   */

class Solution {
    public int singleNonDuplicate(int[] nums) {

        int  start = 0 ;
        int n = nums.length;
        int end = n-1;

        while(start < end ){

            int mid = start +(end - start )/2;

            if((mid % 2 )== 1){

                mid --;
            }
            if(nums[mid] != nums[mid + 1]){
                end = mid ;
            }else{

                start = mid +2;
            }
        }
        return nums[start];
    }
}