/**
 * leetcode solution  no : 35
 * 
 * solution link (https://leetcode.com/problems/search-insert-position/submissions/1227936759/)
 * 
 */


public class searchInsertPosition {
    

    // this mithod is lower bound
    public static int  lowerbound(int[]arr ,int x) {
        int n = arr.length;
        int start=0,end=n-1;
        int ans =n;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid]< x){

                start = mid +1;
            }else{
                ans =mid;

                end=mid -1;
            }
        }
              return ans;
    
        }
      
    public int searchInsert(int[] nums, int target) {

        return lowerbound(nums,target);

       
        
    }
}
//[1,2,5,6] target =5
//output = 2
    

