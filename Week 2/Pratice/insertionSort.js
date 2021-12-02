function insertionSort(arr){
  let arrSize = arr.length,
      i,
      j;
  for(i=1; i<arrSize; i++)
    for(j=i; j>0; j--){
      if(arr[j]<arr[j-1]) [arr[j], arr[j-1]] = [arr[j-1], arr[j]];  
      else break;
    }
}
var arr = [10,2,4,6,8,1,0];
insertionSort(arr);
console.log(arr);
