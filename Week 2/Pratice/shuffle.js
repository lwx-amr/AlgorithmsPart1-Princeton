function randomizeArray(arr){
  let arrSize = arr.length,
      i,
      randomNum;
  for(i=1; i<arrSize; i++){
    randomNum = Math.floor((Math.random() * i) + 0);
    [arr[i],arr[randomNum]] = [arr[randomNum],arr[i]];  
  }
}
var arr = [1,2,3,4,5,6,7,8,9,10];
randomizeArray(arr);
