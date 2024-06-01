/**
 * leetcode problem no (387)
 * solution link(https://leetcode.com/problems/first-unique-character-in-a-string/)
 */

/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    for(let i=0;i< s.length ; i++){
        let count = Array(26).fill(0);
        for(let  i=0 ; i<s.length ; i++){
              count[s[i].charCodeAt(0) - 'a'.charCodeAt(0)]++
        }
        for(let i=0 ;i < s.length ; i++){
            if( count[s[i].charCodeAt(0) - 'a'.charCodeAt(0)] == 1) return i;
        }
        return -1;
    }
};