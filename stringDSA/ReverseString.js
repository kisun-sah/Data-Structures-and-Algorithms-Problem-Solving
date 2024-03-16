/**
 * This is Leetcode link so when you cheak my solution ffollow the link.
 * https://leetcode.com/problems/reverse-string/submissions/1205195904/
 * 
 *  */ /**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function(s) {
    let n = s.length;
    let i = 0;
    let j = n-1;

    while(i<=j){
        //swaping the values

        let temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        // moving to the next position 
         i++;
         j--;
    }
    
};