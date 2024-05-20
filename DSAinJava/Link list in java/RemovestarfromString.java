/**
 * leetcode problem no :- 2390
 * 
 * leetcode solution link (https://leetcode.com/problems/removing-stars-from-a-string/)
 */

 public class RemovestarfromString{
    public String removeStars(String s) {
        // Using StringBuilder as a stack
        StringBuilder st = new StringBuilder();
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c != '*') {
                // If the character is not '*', append it to the StringBuilder
                st.append(c);
            } else {
                // If the character is '*', remove the last character from the StringBuilder
                if (st.length() > 0) {
                    st.deleteCharAt(st.length() - 1);
                }
            }
        }
        
        // Convert the StringBuilder to a string and return
        return st.toString();
    }

}
