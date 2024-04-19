/**
 * 
 * leetcode problem no : 69
 * 
 * leetcode solution link (https://leetcode.com/problems/sqrtx/)
 * 
 * 
 */

/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    

    // here we define  the value of low and high 
    let low = 1;
    let high = x;

    while (low <= high){
         

         //here we find the mid value 
        let mid = low +Math.floor((high - low)/2);

        if(mid * mid == x){ // if mid * mid is the value of x return mid value .

            return mid ;

        }else if(mid * mid > x){ // if mid is greater then mid then search the left area of mid

            high = mid -1;
        }else {
            low = mid +1;   // else search of right area of mid
        }

        
    }
    return high ;
};