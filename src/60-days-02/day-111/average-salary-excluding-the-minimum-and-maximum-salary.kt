class Solution {
  fun average(salary: IntArray): Double {
    var amount: Double = 0.0
    for (number in salary){
      if (number != salary.min() && number != salary.max()){
        amount += number
      }
    }
    return amount / (salary.size - 2)
  }
}

