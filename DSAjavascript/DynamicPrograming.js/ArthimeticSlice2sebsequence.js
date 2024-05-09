/**
 * leetcode problem no : 446
 * 
 * leetcode solution link(https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)
 * 
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var numberOfArithmeticSlices = function(nums) {
    const n  = nums.length;
    let result = 0;
    const  mp = new Array(n);

    for(let i =0; i<n; i++){
        mp[i] = new Map();

        for(let j=0; j<i; j++){
            const diff = nums[i] - nums[j];

            let count_at_j = mp[j].get(diff)||0;

            result += count_at_j ;

            // Increment the count at index i
            mp[i].set(diff , (mp[i].get(diff)||0) + count_at_j + 1);

        }
       
    }
     return result;
}; 