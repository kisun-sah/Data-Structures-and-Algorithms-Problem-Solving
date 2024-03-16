/**
 * This is leetcode  problem solving solution link
 * 
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/1205226490/
 */



/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(numbers, target) {
    let n = numbers.length;
    let i = 0;
    let j= n-1;

    while(i < j){
        if(numbers[i] + numbers[j] == target){
            return[i+1 , j+1 ]; // 0 index -->  1

        }
        else
            if(numbers[i] + numbers[j] > target ){

                j--;
            }else{
                i++;
            }

        
    }
    
};