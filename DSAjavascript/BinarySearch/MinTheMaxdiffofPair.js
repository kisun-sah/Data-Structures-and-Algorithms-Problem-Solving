/**
 * leetcode problem no :- 2616
 * 
 * leetcode solution link(https://leetcode.com/problems/minimize-the-maximum-difference-of-pairs/submissions/1234261497/)
 */
/**
 * @param {number[]} nums
 * @param {number} p
 * @return {number}
 */


function conformatleastPpairwithatmosMindiff(  nums, p  , mid){

    let countpair = 0;
    let i = 0 ;

    while(i < nums.length -1){

        if(nums[i+1]-nums[i] <= mid){
            countpair ++;
            i +=2;
        }else{
            i++;
        }
    }
    return countpair >= p;
}
var minimizeMax = function(nums, p) {

nums.sort(function(a, b){return a - b});
let n = nums.length;
let lo = 0;
let hi = nums[n-1] - nums[0];
let ans =hi;

while(lo <= hi){
    mid =lo+Math.floor((hi-lo)/2);

    if(conformatleastPpairwithatmosMindiff(nums, p  , mid)){
          ans = mid;
         hi = mid -1;

    }else{
        lo = mid+1;
    }
}
return ans;



};
