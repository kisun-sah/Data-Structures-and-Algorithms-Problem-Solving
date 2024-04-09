/**
  * @param {*The given input array inside which we need to find an element} arr 
  * @param {*x is the element expected to be found } x 
  */

function upperbound(arr ,x){

    let n = arr.length;
    // declare  the search space 

   let  low =0, high=n-1  ;
    let  ans =arr.length;

    while(low<=high){
        let mid=Math.floor((low+high)/2);
        if(arr[mid]<=x){
        // we need to discard left half
            low= mid+1;

        }else{
            //we got a candidate ans which is >= x and we can find btr on left side
              ans = mid;
             high=mid-1;
        }
    }
  
     //if loop is end and we returned in the loop , means element is not present .
     return ans;
    
     }
   
    let arr = [1,2,12,14,30,54,57,59,60,70];

    console.log("index:",upperbound(arr,2));