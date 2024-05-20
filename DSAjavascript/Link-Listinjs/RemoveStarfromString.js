/**
 * leetcode problem no :- 2390
 * 
 * leetcode solution link (https://leetcode.com/problems/removing-stars-from-a-string/)
 */



/**
 * @param {string} s
 * @return {string}
 */
var removeStars = function(s) {
    let st = [];
    for(let i =0 ;i<s.length; i++ ){

        if(s[i] != '*'){

            st.push(s[i]);
        }else{

            st.pop();
        }

    }
    return st.join('');

};
