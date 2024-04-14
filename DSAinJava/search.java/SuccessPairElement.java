import java.util.Arrays;

/**
 * 2300: problem in leetcode
 * link (https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/)
 */
public class SuccessPairElement {

  
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
          int[] result = new int[spells.length];
          Arrays.sort(potions);
      
          for (int i = 0; i < spells.length; ++i)
            result[i] = potions.length - binarysearch(spells[i], potions, success);
      
          return result;
        }
      
        // Returns the first index i s.t. spell * potions[i] >= success.
        private int binarysearch(int spell, int[] potions, long success) {
       int l = 0;
       int n= potions.length;
       int r = n-1;
      
       while(l <= r){
          int mid = l+(r-l)/2;
      
          long midval = potions[mid];
      
          if(midval *spell < success ){
      
              l = mid +1;
      
          }else{
              r = mid -1;
          }
       }
          return l;
        }
      }
    

