function merge(arr, mock, left, mid, right){
  mock = arr.slice(0);
  let i = left, j = mid+1;
  for(var k=left; k<=right ; k++){
    if(i>mid) arr[k] = mock[j++];
    else if(j>right) arr[k] = mock[i++]; 
    else if(mock[i]<mock[j]) arr[k] = mock[i++]; 
    else arr[k] = mock[j++];   
  }
}
function sort(arr, mock, left, right){
  if(left<right){
    let mid = Math.floor((left+right)/2);
    sort(arr, mock, left, mid);
    sort(arr, mock, mid+1, right);
    if(arr[mid]<arr[mid+1]) return;
    merge(arr, mock, left, mid, right);    
  }
}
var arr = [10, 5, 6 , 2, 8, 3, 1, 0],
    mock = [];
sort(arr,mock,0,arr.length-1);
console.log(arr);

