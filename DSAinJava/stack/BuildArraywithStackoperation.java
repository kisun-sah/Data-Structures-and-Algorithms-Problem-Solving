import java.util.*;

/**
 * leetcode problem no :- 1441
 * leetcode solution link (https://leetcode.com/problems/build-an-array-with-stack-operations/submissions/1267832471/)
 */
class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        Stack <String> ans = new   Stack <String> ();

        int i =1;
        for(int element : target ){

            while(i < element ){
                ans.add("Push");
                ans.add("Pop");
                i++;
            }

            ans.add("Push");
            i++;
        }
        return ans;
    }
}