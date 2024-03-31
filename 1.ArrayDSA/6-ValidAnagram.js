//https://leetcode.com/problems/valid-anagram/submissions/1206322732/

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {

    if(s.length != t.length) return false;

    // prepare free map of a

    const mp = {};

    for(let i =0 ; i< s.length ; i++){

        if(mp[s[i]]){
            // if it is defined , we land here

            mp[s[i]] +=1;   
        }else{
            //if it is underfined , we land here

            mp[s[i]] =1;
        }
    }

    for(let i = 0 ; i< t.length; i++){
        if(mp[t[i]] === undefined){
            // there is a character in t, which is not present in s

            return false;

        }else{
            mp[t[i]] -= 1 // if occ found , dec freq

            if(mp[t[i]] == 0){
                delete mp[t[i]];
            }
        }
    }
      return Object.keys(mp).length == 0;
    
};