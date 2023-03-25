fun solution(number: Int): Int {
  if (number < 3) return 0
  var result = 0
  for (num in 3 until number){
    if (num % 3 == 0){
      result += num
      continue
    } 
    if (num % 5 == 0){
      result += num
    }
  }
  return result
}