public class GaseNumhigerorLower {
    
    /** 
     * 
     * leetcode problem no :- 374
     * 
     * solution link (https://leetcode.com/problems/guess-number-higher-or-lower/description)
     * 
     * 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


    public int guessNumber(int n) {
        
        int lo = 1;
        int hi = n;

        while(lo <= hi){
            int mid =lo+(hi-lo)/2;

            if (guess(mid)==0){
                return mid;
            }else if(guess(mid)== -1){

                hi= mid -1;
            }else{
                lo=mid+1;
            }
        }
        return 1;
    }

    private int guess(int mid) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guess'");
    }

   
};

