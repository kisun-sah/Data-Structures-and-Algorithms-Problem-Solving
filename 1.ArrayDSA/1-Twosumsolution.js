// In the Below that are a Leetcode solution submmit link - you can show my solution on Leetcoode

//https://leetcode.com/problems/two-sum/submissions/1205145370/

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let n = nums.length;
    for(i=0;i<=n-2;i++){

        for(j=i+1;j<n;j++){

          if(nums[i]+nums[j]==target){
            return[i,j];
          }
        }
    }
    
};