function pairs(k: number, arr: number[]): number {
  // Write your code here
  let numberOfPairs = 0
  arr.sort((a,b)=>a-b)
  for (let i = 0; i < arr.length - 1; i++){
    for (let j = i + 1; j < arr.length; j++){
      if((arr[j] - arr[i]) === k){
        numberOfPairs++
        break
      }
    }
  }
  return numberOfPairs
 }