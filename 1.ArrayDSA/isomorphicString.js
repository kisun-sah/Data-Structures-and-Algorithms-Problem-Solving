/**
 * 
 * problem no:- (205)leetcode solution.
 * 
 * https://leetcode.com/problems/isomorphic-strings/submissions/1222124845/
 */


/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {

    // Create arrays to store the index of characters in both strings
       let indexS = new Array(200).fill(0); // Stores index of characters in string s
       let  indexT = new Array(200).fill(0); // Stores index of characters in string t
       
       // Get the length of both strings
       let  len = s.length;
       
       // If the lengths of the two strings are different, they can't be isomorphic
       if(len != t.length) {
           return false;
       }
       
       // Iterate through each character of the strings
       for( i = 0; i < len; i++) {
           // Check if the index of the current character in string s
           // is different from the index of the corresponding character in string t
           if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
               return false; // If different, strings are not isomorphic
           }
           
           // Update the indices of characters in both strings
           indexS[s.charAt(i)] = i + 1; // updating index of current character
           indexT[t.charAt(i)] = i + 1; // updating index of current character
       }
       
       // If the loop completes without returning false, strings are isomorphic
       return true;
   
};