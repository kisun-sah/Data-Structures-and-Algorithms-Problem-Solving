/**
 * 
 * solution link
 * liycode solution (https://leetcode.com/problems/make-the-string-great/submissions/1224113167/?envType=daily-question&envId=2024-04-05)
 */


function makeGood(s) {
    let sb = s;
    let i = 0;
    
    while (i < sb.length - 1) {
        let currentChar = sb[i];
        let nextChar = sb[i + 1];
        
        // Calculate the ASCII difference to check if characters are case-insensitive equal
        if (Math.abs(currentChar.charCodeAt(0) - nextChar.charCodeAt(0)) === 32) {
            // Remove the adjacent characters
            sb = sb.substring(0, i) + sb.substring(i + 2);
            
            // Update index considering the possibility of reducing i
            if (i > 0) {
                i--;
            }
        } else {
            // Move to the next character
            i++;
        }
    }
    return sb;
};

