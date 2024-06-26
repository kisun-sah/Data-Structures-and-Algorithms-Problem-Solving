
public class lowerbound {
    




    /**
     * 
     * @param x  the element expected to be found 
     * @return The index of the element if found, otherwise -1.
     * 
     */

     public static int  lowerbound(int[]arr ,int x) {
       int n= arr.length;
        int lo = 0, hi =n-1;
        int ans =n;

        while (lo<=hi) {
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]<x){
                //we need to discard the left 

                lo= mid +1;

            }else{
              //we got a candidate ans which is >= x and we can find btr on left side
                   ans =mid;
                hi = mid -1;
            }
        }
        //if the loop ends we never returned in the loop , is not present 

        return ans;
     }
    

    public static void main(String[] args) {
        
        int[] arr ={-6,1,3,5,6,8,9,12,23,34,56,78,89,90,98};
        
        System.out.println(lowerbound(arr ,7));
    }


   
}
