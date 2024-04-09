/**
 * problem no :-35 solution on leetcode
 * 
 * leetcode link (https://leetcode.com/problems/search-insert-position/description/)
 * 
 * 
 * 
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */

var searchInsert = function(nums, target) {
    let n = nums.length;
    let start = 0;
    let end = n - 1;
    let ans = n;

    while (start <= end) {
        let mid = start + Math.floor((end - start) / 2);

        if (nums[mid] < target ) {
            start = mid + 1;
        } else {
            ans = mid;
            end = mid - 1;
        }
    }

    return ans;
};

