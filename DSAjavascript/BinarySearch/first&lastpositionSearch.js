/*
* @param {number[]} nums
* @param {number} target
* @return {number[]}


leetcode problem 
link(https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/)
*/
var searchRange = function(nums, target) {

  
   const first = findFirst(nums, target);
   const last = findLast(nums, target);
   return [first, last];
}

function findFirst(nums, target) {
   let left = 0;
   let right = nums.length - 1;
   let first = -1;

   while (left <= right) {
       const mid = Math.floor(left + (right - left) / 2);

       if (nums[mid] === target) {
           first = mid;
           right = mid - 1;
       } else if (nums[mid] < target) {
           left = mid + 1;
       } else {
           right = mid - 1;
       }
   }

   return first;
}

function findLast(nums, target) {
   let left = 0;
   let right = nums.length - 1;
   let last = -1;

   while (left <= right) {
       const mid = Math.floor(left + (right - left) / 2);

       if (nums[mid] === target) {
           last = mid;
           left = mid + 1;
       } else if (nums[mid] < target) {
           left = mid + 1;
       } else {
           right = mid - 1;
       }
   }

   return last;


};
// Example usage:
const nums = [5, 7, 7, 8, 8, 10];
const target = 8;

const [firstIndex, lastIndex] = searchRange(nums, target);
console.log(`First occurrence index: ${firstIndex}`);
console.log(`Last occurrence index: ${lastIndex}`);