/**
 * 34 problem solution 
 * leetcode link(https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 */

 class Solution {
    public int[] searchRange(int[] nums, int target) {
     int first = findfirst(nums , target);
     int last = findlast(nums , target );

     return new int[]{first , last};
    }

    private int findfirst(int[] nums , int target){

        int left = 0 , right = nums.length-1;

        int first = -1;

        while(left <= right ){

            int mid = left +(right-left)/2;

            if(nums[mid]==target ){
                first = mid;

                right = mid-1;

            }else if(nums[mid]<target ){

                left = mid+1;

            }else{
                right =mid -1;
            }
          
        }
               return first;
    }
    private int findlast(int[] nums , int target ){
        int left = 0 , right = nums.length -1;
        int last = -1;

        while(left <= right){

           int  mid = left +(right-left)/2;

            if(nums[mid]==target ){

                last = mid;
                left = mid +1;

            }else if(nums[mid]< target ){
                  left = mid +1;

            

            }else{
              
                  right = mid -1;

            }
            
        }
              return last;
    }


    
}
    

