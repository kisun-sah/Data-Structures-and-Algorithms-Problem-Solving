 function insertionsort(arr){

    for(let i =1; i<arr.length; i++){

        let element = arr[i];

        let j;
         
        for( j = i-1 ; j>= 0; j--){

            if(arr[j] >element){
                arr[j+1] = arr[j];

            }else{
                   //arr[j] <=  element 
                break;
            }
        }

        arr[j+1] = element; 

    }
}
      
 

 
const arr= [12,3,4,2,5,7,54,2,322,3 ];
insertionsort(arr);


console.log(arr);