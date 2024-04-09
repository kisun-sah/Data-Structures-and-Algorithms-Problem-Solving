 /**
  * @param {*The given input array inside which we need to find an element} arr 
  * @param {*x is the element expected to be found } x 
  */

 function binarySearch(arr , x){
    let n =arr.length;
    //declare the search space
    let lo =0, hi =n-1;
    while(lo<=hi){
        let mid = Math.floor((lo+hi)/2);
        if(arr[mid]==x){
            //we found the index at which x is present 
            return mid;

        }else if(arr[mid]<x){
            //we need tovdiscard the left half
            lo=mid+1;


        }else{
          //we need to discard the right half
            hi=mid-1;
        }
    }
    //if loop is end and we returned in the loop , means element is not present .
    return -1;

 }

 let arr=[-5,1,2,5,7,12,16,19,20,43,67,69,98];
 console.log(binarySearch(arr,19));