function QuickSort(arr){
  if(arr.length <= 1){
    return arr;
  }

  const pivot = arr[arr.length - 1];
  const leftArr = [];
  const rightArr = [];

  for(let i=0; i < arr.length-1;i++){
    if(arr[i] < pivot){
      leftArr.push(arr[i]);
    }
    else{
      rightArr.push(arr[i])
    }
  }

  return [...QuickSort(leftArr) ,pivot,...QuickSort(rightArr)];

}

const arr = [1,5,2,99,81,100,144,121,91,85,74,10];
console.log(QuickSort(arr));

