
/**
 * 364: no problem solution 
 * leetcode link(https://leetcode.com/problems/valid-perfect-square/)
 * 
 */
public class validPerfectSquare {
   
    public boolean isPerfectSquare(int num) {

        long lo = 1;
        long hi = num;

        while(lo<=hi){ //here we intialized condition lo <= hi this condition is true then go to next process

        // Here we find the mid value of num.
            long mid = lo +(hi - lo)/2; 

            if(mid*mid == num){

               return true;

            }else if(mid*mid < num){

                lo = mid +1; // search the right side of mid
            }else{

                hi = mid -1; // search the left side
            }
        }
        return false;
        
    }
   
    
    
}
