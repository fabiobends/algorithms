fun solution(N: Int, A: IntArray): IntArray {
  var defaultNum = 0
  var maxNum = 0
  val ans = IntArray(N)
  for (value in A) {
    if (value > N) {
      defaultNum = maxNum
    } else {
      if(ans[value - 1] < defaultNum){
        ans[value - 1] = defaultNum
      }
      ans[value - 1] += 1
      if (ans[value - 1] > maxNum) {
        maxNum = ans[value - 1]
      }
    }
  }

  for (i in 0 until ans.size) {
    if(ans[i] < defaultNum){
      ans[i] = defaultNum
    }
  }
  
  return ans
}