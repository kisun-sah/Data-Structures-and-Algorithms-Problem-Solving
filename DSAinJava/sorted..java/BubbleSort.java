public class BubbleSort {

    public static void bubblesort(int[] arr){
        int n = arr.length;


        for(int i = 0 ; i < n ;  i++){

            Boolean isSwapped = false;

            for(int j = 0 ; j<n-i-1; j++){ //why j < n-i-1 --> because in every iteration we push the biggest element to last so, no need to compair to it's 

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;

                    isSwapped =true;
                }
            }
            //if no swapping occured then  array is sorted .

            if(isSwapped == false) return; //return from function an array is sorted
        }
        

    }
    public static void main(String[] args) {
      int[] arr={1,3,2,6,3,4,98,6,44,3 }  ;
       bubblesort(arr);
       for(int i : arr){

        System.out.println(i);
       }
        
    }
}
