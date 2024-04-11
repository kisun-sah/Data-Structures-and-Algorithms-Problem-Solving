/**
 * 162. Find Peak Element
 * 
 * leetcode solution link(https://leetcode.com/problems/find-peak-element/description/)
 * 
 * 
 * 
 * 
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function(nums) {

    
    
    let  n= nums.length;
    let  low = 0, high =n-1;

    while(low<=high){
        let  mid = low+Math.floor((high-low)/2);

        if(n==1)return 0;
        
        if((mid == 0 || nums[mid]>nums[mid-1 ] ) && (mid == n-1 || nums[mid] > nums[mid+1])){
         return mid;

       }else if(nums[mid]<nums[mid+1]){
            low = mid+1;

        }else{
            high = mid-1;
        }   

    } 
    return 1;
    
};
