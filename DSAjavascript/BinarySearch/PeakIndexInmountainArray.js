/**
 * leetcode problem no _852
 * leetcode solution link(https://leetcode.com/problems/peak-index-in-a-mountain-array/)
 */

/**
 * @param {number[]} arr
 * @return {number}
 */
var peakIndexInMountainArray = function(arr) {

    let n = arr.length
    let lo = 1;
    let hi = n-2;

    while(lo <= hi ){

        let mid = lo+Math.floor((hi - lo)/2);

        if(arr[mid ] >= arr[mid -1] && arr[mid ] >= arr[mid +1])
        return mid;

        if(arr[mid] < arr[mid + 1]){
            lo = mid+1;
        }else{
            hi = mid-1;
        }
    }
    return hi;
};