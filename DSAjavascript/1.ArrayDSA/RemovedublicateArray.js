/**
 * problem no:26
 * 
 * leetcode solution link 
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1222996319/
 * 
 * 
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {

    let count = 0; // here we create count of unique value.
    
    // we create a iteretive to check the length of nums array 
    for(let i=0; i <nums.length; i++){

       // here we initialized the condition to check index o:element is less then indx of last element and index 0:element is equal to next element of array 
        if(i<nums.length-1 && nums[i] == nums[i+1]){
            
            //when the condition is true then skip the element 
            continue;
        }else{

            //else  we store the unique element 

        nums[count]=nums[i];

        count ++;


        }
    }
    return count;
    
};