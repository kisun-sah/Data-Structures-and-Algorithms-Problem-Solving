
/**
 * leetcode :no 1544 - problem solution 
 * link here(https://leetcode.com/problems/make-the-string-great/description/?envType=daily-question&envId=2024-04-05)
 * 
 */

public class makegoodString {


    
        public String makeGood(String s) {
           
    
           //create new string to store a value of s.
            StringBuilder sb = new StringBuilder(s);
            int i=0;
            
                 //Here we define a condition to check length -1
                  while(i<sb.length()-1){
    
                char currentChar = sb.charAt(i); // i= index 0
    
                char nextChar = sb.charAt(i+1); // i+1 = index 1 
                if(currentChar - nextChar == 32 || nextChar - currentChar == 32){ //here we check  the condition currentchar  or nextcharecter between different the value of 32 then remove the both element (32 = ASCII value of char)
    
    
                    sb.delete(i,i+2);
                    if(i>0){  // when i is greater then index 0 then decrease 
                        i--;
                    }
                }else{
    
                    //else increase
                    i++;
                }
            }
            return sb.toString();
     
            
        }
    }
    

