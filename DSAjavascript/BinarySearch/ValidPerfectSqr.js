/**
 * 364 :no problem solution
 * 
 * leetcode link(https://leetcode.com/problems/valid-perfect-square/) 
 */

/**
 * @param {number} num
 * @return {boolean}
 */
var isPerfectSquare = function(num) {
    let lo= 1;
    let hi =num;

    while(lo<=hi){

        let mid = lo+Math.floor((hi-lo)/2);

        if(mid*mid==num){
            return true;

        }else if(mid*mid<num){

            lo= mid+1;

        }else{
            hi =mid -1;
        }

    }
    return false;
};

// 
console.log(isPerfectSquare(16));