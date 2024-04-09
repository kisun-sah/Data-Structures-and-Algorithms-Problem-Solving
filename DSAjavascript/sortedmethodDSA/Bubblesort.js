

function bubblesort( arr ){

let n = arr.length;

for(let i = 0 ; i <n ; i++ ){

     isSwapped = false;

    for(let j = 0 ; j<n-i-1 ; j++){

        if(arr[j]>arr[j+1]){

            let temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;

            isSwapped = true;
        }
    }

      if(isSwapped == false){
    return;
    }
}

}

const arr= [1,3,2,6,3,4,98,6,44,3 ];
bubblesort(arr);


console.log(arr);
