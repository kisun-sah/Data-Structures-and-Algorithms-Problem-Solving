
/**
 * 2300 : problem in leetcode
 * 
 * link (https://leetcode.com/problems/successful-pairs-of-spells-and-potions/)
 */
/**
 * 
 * @param {number[]} spells
 * @param {number[]} potions
 * @param {number} success
 * @return {number[]}
 */
var successfulPairs = function(spells, potions, success) {
    // Sort the potions array
    potions.sort((a, b) => a - b);
    

    const n = spells.length;
    let pairs = new Array(n).fill(0);

    for (let i = 0; i < n; i++) {
        let left = 0;
        let right = potions.length - 1;

        // Apply binary search for each spell
        while (left <= right) {
            let mid = Math.floor((left + right) / 2);
            if (spells[i] * potions[mid] < success) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Count the number of successful pairs for the current spell
        pairs[i] = potions.length - left;
    }

    return pairs;
};
