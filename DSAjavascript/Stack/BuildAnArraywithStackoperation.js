
/**
 * leetcode problem no :- 1441
 * leetcode solution link (https://leetcode.com/problems/build-an-array-with-stack-operations/submissions/1267832471/)
 */

/**
 * @param {number[]} target
 * @param {number} n
 * @return {string[]}
 */
var buildArray = function(target, n) {

    const ans =[]; // ans is similay work as stack

    let i =1;
      for(const element of target){
        while(i < element){
            ans.push("Push");
            ans.push("Pop");
            i++;
        }
        
       ans. push("Push");
        i++
    }
    return ans;
};