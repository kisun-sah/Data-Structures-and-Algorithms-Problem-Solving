/**
 * problem no:- 26 solution
 * leetcode  solution link :
 * 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1222987098/
 * 
 * 
 */
class removeDuplicateArray {
    public int removeDuplicates(int[] nums) {
        

         
       int count=0;  //Here we create a stpre element count 
        
       // we create a iterative loop for check the value of length of the nums.
        for(int i=0; i<nums.length;i++){
             
             // here we apply the condition  i is  equal to the next element then skip next element else saved in count 
            if(i<nums.length-1 && nums[i]==nums[i+1]){

                continue;
            }else{


                //here we stored total unique element  element count
                nums[count]=nums[i];

                count++;


            }

        }
        return count;
        
    }
}