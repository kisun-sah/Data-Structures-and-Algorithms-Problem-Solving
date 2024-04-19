
/**
 * leetcode problem no  : 153
 * leetcode solution link(https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
 */

public class FindMinimumRotedSortArray {
    public int findMin(int[] nums) {

        int n = nums.length;
        int end = n-1;
        int start = 0;

        while(start < end ){

            int mid = start + (end - start )/2;

            if( nums[mid] > nums[end]){

                start = mid +1;

            }else{
                end = mid;
            }
        }
        return nums[start];
    }
}
