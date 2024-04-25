/**
 * leetcode problem no : 4 
 *  
 * leetcode solution lin (https://leetcode.com/problems/median-of-two-sorted-arrays/)
 */

function findMedianSortedArrays(nums1, nums2) {
    let m = nums1.length;
    let n = nums2.length;

    let temp = new Array(m + n);

    let i = 0; // for nums1
    let j = 0; // for nums2
    let k = 0; // for temp array

    // Merge arrays nums1 and nums2 into temp array
    while (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
            temp[k] = nums1[i];
            k++;
            i++;
        } else {
            temp[k] = nums2[j];
            k++;
            j++;
        }
    }

    // If there are remaining elements in nums1, add them to temp
    while (i < m) {
        temp[k] = nums1[i];
        k++;
        i++;
    }

    // If there are remaining elements in nums2, add them to temp
    while (j < n) {
        temp[k] = nums2[j];
        k++;
        j++;
    }

    let size = m + n;

    if (size % 2 === 1) { // odd
        return temp[Math.floor(size / 2)];
    } else {
        return (temp[size / 2] + temp[size / 2 - 1]) / 2.0;
    }
}

// Example usage:
let nums1 = [1, 3];
let nums2 = [2,4];
console.log(findMedianSortedArrays(nums1, nums2)); // Output: 2.0
