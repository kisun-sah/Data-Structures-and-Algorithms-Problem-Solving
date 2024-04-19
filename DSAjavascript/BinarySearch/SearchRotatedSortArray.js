/**
 * leetcode problem no 33
 * leetcode solution link(https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1236726053/)
 */
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {

    let start = 0;
    let n = nums.length;
    let end = n-1;
    
    while(start <= end){

        let mid = start + Math.floor((end - start)/2);

        if(nums[mid] == target){
            return mid;
        }
        // check the condition target is present in left side or not

        if(nums[start ] <=  nums[mid]){

            if(target < nums[mid] && target >= nums[start]){

                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        // check the condition in the right target is present or not

        else{
            if(target > nums[mid ] && target <= nums[end]){

                start = mid +1;
            }else{

                end = mid -1;
            }
        }
    }
    return -1;
};