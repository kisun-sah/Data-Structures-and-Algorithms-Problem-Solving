



public class Binarysearch {
    /**
     * 
     * @param x  the element expected to be found 
     * @return The index of the element if found, otherwise -1.
     * 
     */

     public static int  binarySearch (int[]arr ,int x) {
       int n= arr.length;


        //declare the search space 

        int lo = 0, hi =n-1;

        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if(arr[mid]==x){

                //we found the index at which x is present
                return mid;

            }else if(arr[mid]<x){
                //we need to discard the left 
                lo= mid +1;

            }else{
                //we need to discard the right 

                hi = mid -1;
            }
        }
        //if the loop ends we never returned in the loop , is not present 

        return -1;
     }
    

    public static void main(String[] args) {
        
        int[] arr ={-6,1,3,5,6,8,9,12,23,34,56,78,89,90,98};
        
        System.out.println(binarySearch(arr ,56));
    }


   
}