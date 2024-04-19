/**
 * leetcode problem no :-81
 * leetcode solution link(https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
 * 
 */
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {boolean}
 */
var search = function(nums, target) {

    let start = 0;
    let end = nums.length-1;

    while(start <= end){

        let mid = start + Math.floor((end-start)/2);

        if(nums[mid] == target){
            return true;
        }
        if(nums[mid] == nums[start]){

            start ++;
            continue;
        }
        //Here check the condition in left side target is present or not

        if(nums[mid] > nums[start]){
            if(target < nums[mid] && target >= nums[start]){

                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        // Here check in the right side
        else{
            if(target > nums[mid] && target <= nums[end]){

                start = mid +1;
            }else{
                end = mid -1;
            }
        }
    }
    return false;
};