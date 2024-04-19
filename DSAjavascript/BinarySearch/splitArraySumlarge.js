/**
 * 
 * leetcode problem no :- 410
 * 
 * leetcode solution link (https://leetcode.com/problems/split-array-largest-sum/)
 * 
 */

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var splitArray = function(nums, k) {

    // Helper function getMaximum value allover in the nums Ayyay

    getMaximum = function (nums){

        let max = nums[0];
        for(let num of nums){
            max = Math .max(max , num);
        }
        return max;

    }

    // Helper function getSumofArray in present all element in the nums Array

getSumArray = function(nums){
    let sum = 0;

    for(let  num of nums){

        sum += num;
    }

    return sum;

}


// Helper function to check if it's valid to split array into k subarray with maximum.

isValid = function(nums , k , mid){
    currentsum = 0;
    count = 1;

    for(let num of nums){

        currentsum  += num;

        if(currentsum > mid ){
             
             count ++;
             currentsum = num;

             if(count > k ){

                return false;
             }
        }

    }
    return true ;
}


// main Drive function 

let left = this.getMaximum (nums);
let right = this.getSumArray(nums);

while(left < right){

    let mid = left+Math.floor((right - left)/2);

    if(this.isValid(nums , k , mid)){

        right = mid;
    }else {
        left = mid +1;
    }
}
return right;
    
};