// you can write to stdout for debugging purposes, e.g.
// console.log('this is a debug message');

// first
function solution(A) {
  let isGoingUp = false
  let isGoingDown = false
  let result = 0
  for (let i = 0; i < A.length - 1; i++){
      if (i === 0){
          while (i < A.length - 1 && A[i+1] === A[i]){
              i++;
          }
          result++
          if (i === A.length - 1 || i === A.length){
              break;
          }
      }
      if (A[i+1] === A[i]) { 
          continue
      } else if (A[i+1] > A[i]){
          isGoingUp = true
          if(isGoingDown){
              isGoingDown = false
              result++
          }
      } else {
          isGoingDown = true
          if(isGoingUp){
              isGoingUp = false
              result++
          }
      }
      
  }
  if (A[A.length - 1] != A[A.length - 2]) result++
  return result
}

// second
const COLS = 'BCDEFGHJ';

function solution(N, S) {
    if (S.length === 0) return N*2
    let aisleSeats = 0
    const map = new Map()
    const seats = S
        .split(' ')
        .filter(value => 
            value[value.length - 1] != 'A' 
         && value[value.length - 1] != 'K')   
    for (let i = 0; i < seats.length; i++){
        let row, col
        if (seats[i].length === 3){
            row = seats[i][0] + seats[i][1]
            col = seats[i][2]
        } else {
            row = seats[i][0]
            col = seats[i][1]
        }
        if(!map.has(row)){
            map.set(row, COLS.replace(col, ' '))
        } else {
            const str = map.get(row) || ''
            map.set(row, str.replace(col, ' '))
        }
    }
    map.forEach((value, key) => {
        if (
           value[3] === 'D' 
        || value[4] === 'E'
        || value[5] === 'F'
        || value[6] === 'G'){
            aisleSeats++
        } else if (
            value[0] === 'B' 
         || value[1] === 'C'
         || value[2] === 'D'
         || value[3] === 'E'){
            aisleSeats++
         } else if (
            value[5] === 'F' 
         || value[6] === 'G'
         || value[7] === 'H'
         || value[8] === 'J'){
            aisleSeats++
         }
    })
    return (N - map.size)*2 + aisleSeats
}

// third
function solution(A) {
  // Implement your solution here
  let max = 0
  A.sort((a,b) => a - b)
  for (let i = 0; i < A.length - 1; i++){
      max = Math.max(max, Math.ceil((A[i+1] - A[i] - 1) / 2))
  }
  return max
}

