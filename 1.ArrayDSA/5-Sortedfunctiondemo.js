

let arr =[3,4,1,6,3,8];

/**
 * if callback of sort function return a negative value
 *  - the first argument is put first and then the second value
 * 
 * else if callback of sort function return a positive value 
 * - the second argument is put first and then the first argument
 *  
 */

/**
 * x =3;
 * y=6;
 * 
 * (x,y)=> x-y
 * 3-6 => -ve
 * 
 * [3,6] 
 * 
 * x= 7;
 * y =2;
 * 
 * (x,y)=> x-y
 * 
 * 7-2 => +ve
 * 
 * [2,7]
 */

arr.sort((x,y) => x-y);
console.log(arr);