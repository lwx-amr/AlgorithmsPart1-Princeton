function selectionSort(arr){
  let arrSize = arr.length,
      minIndex,
      i,
      j;
  for(i=0; i<arrSize-1; i++){
    minIndex = i;
    for(j=i+1; j<arrSize; j++){
      if(arr[j]<arr[minIndex]){
        minIndex = j;
      }
    }
    if(minIndex !== i)
      [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];  
  }
}

var arr = [10,2,4,6,8,1,0];
selectionSort(arr);
console.log(arr);
