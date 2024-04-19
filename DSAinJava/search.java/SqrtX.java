/**
 * leetcode problem no : 69
 * 
 * leetcode solution link (https://leetcode.com/problems/sqrtx/submissions/1235180046/)
 */

public class SqrtX {

   
        public int mySqrt(int x) {
    
            // here we define intlizetion the value of low and value of high 
    
            int low  = 1;
            int high = x;
    
            while (low <= high ){
                  
                  //Here we find the mid value of x 
            long  mid = low + (high - low )/2;
    
                if(mid * mid  == x){    // if mid * mid is value of x then return mid 
    
                    return (int) mid;
    
                }else if (mid * mid  > x){// if mid * mid greater then value of x then search less then mid value
    
                    high =(int) mid -1;
    
                }else {
                    low =(int) mid +1;   // else search greater than mid value 
                }
    
    
            }
            return high ;
    
    
            
        }
    }

    
    

