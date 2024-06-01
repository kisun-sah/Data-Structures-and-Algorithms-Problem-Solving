/**
 * leetcode problem no (387)
 * solution link(https://leetcode.com/problems/first-unique-character-in-a-string/)
 */

public class firstuniquecharinstring {
    public int firstUniqChar(String s) {
        int[] count = new int[26];

        // Count the occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        firstuniquecharinstring solution = new firstuniquecharinstring();
        String testString = "leetcode";
        int result = solution.firstUniqChar(testString);
        System.out.println("The index of the first unique character is: " + result);
    }
}
