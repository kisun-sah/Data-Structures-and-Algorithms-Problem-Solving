/**
 * leetcode problem no (20)
 */



/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let st = [];
       
       for (let ch of s) {
           if (st.length === 0 || ch === '(' || ch === '{' || ch === '[') {
               st.push(ch);
               continue;
           }
       if(ch == ')'){

           if(st[st.length -1] == '('){
           st . pop();
           }else{
               return false;
           }
       }
       else   if(ch == '}'){

           if(st[st.length -1] == '{'){
           st . pop();
           }else{
               return false;
           }
       }
       else   if(ch == ']'){

           if(st[st.length -1] == '['){
           st . pop();
           }else{
               return false;
           }
       }
   }
   return st.length == 0;
   
};