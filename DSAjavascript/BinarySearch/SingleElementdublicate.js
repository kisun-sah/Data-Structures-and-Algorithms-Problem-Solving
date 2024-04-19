/**
 * 
 *  leetcode problem no 540
 * leetcode solution link (https://leetcode.com/problems/single-element-in-a-sorted-array/)
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function (nums) {
    // define two pointers, left and right, to cover the range of the array
    let left = 0;
    let right = nums.length - 1;

    while (left < right) {
        // find the middle index
        let middle = Math.floor((left + right) / 2);
        // check if the middle index is even or odd
        if (middle % 2 === 1) {
            // if the middle index is odd, move it one position to the left
            middle--;
        }
        // check if the middle element is equal to the element to its right
        if (nums[middle] !== nums[middle + 1]) {
            // if so, the single element must be on the right side of the array
              right = middle;
        } else {
            // otherwise, the single element must be on the left side of the array
           
              left = middle + 2;
        }
    }
    // when the loop ends, left and right are equal and point to the single element
    return nums[left];

};