/**
 * Well I tried
 *   let num = n.repeat(k);
     if(num.length > 1){
       num = sumDigits(num)
       return superDigit(num, 1)
     }
     return Number(num)
 *  but I didn't work and I still don't know why
 */
function sumDigits(num: string): string {
  const splitNum = num.split('')
  const sum = splitNum.reduce((acc, current)=> acc += Number(current),0)
  return sum.toString()
}
  
function superDigit(n: string, k: number): number {
  return 1 + (k * Number(sumDigits(n)) - 1) % 9
}