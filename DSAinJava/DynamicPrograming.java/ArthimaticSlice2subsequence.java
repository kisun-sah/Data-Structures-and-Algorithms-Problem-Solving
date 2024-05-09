import java.util.HashMap;
import java.util.Map;

/**
 * leetcode problem no : 446
 * 
 * leetcode solution link(https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)
 * 
 */
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int result = 0;
        Map<Long, Integer>[] mp = new HashMap[n];

        for(int i=0; i<n; i++){
            mp[i] = new HashMap<>();

            for(int j=0; j<i; j++){
                Long diff = (long) nums[i] - nums[j];
                int count_at_j = mp [j].getOrDefault(diff , 0);

                result += count_at_j ;

                // Incrementn the count at index i
                mp[i].put(diff , mp[i].getOrDefault(diff , 0)+count_at_j +1);
            }
     
        }
        return result;
    }
}