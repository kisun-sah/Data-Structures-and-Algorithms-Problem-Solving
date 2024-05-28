import java.util.Stack;

/**
 * leetcode problem no (20)
 */
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new  Stack <Character>();

        for(char ch : s.toCharArray()){

            if(st.isEmpty()||ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
                continue;

            }
            if(ch == ')'){
                if(st.peek() == '('){
                    st.pop();
                }else{
                    return false;
                }

            }
            else   if(ch == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }else{
                    return false;
                }

            }
               else   if(ch == ']'){
                if(st.peek() == '['){
                    st.pop();
                }else{
                    return false;
                }

            }
        }

        return st.isEmpty();
        
    }
}