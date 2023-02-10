// my solution passed 991/994 (timeout limit)
const MAX_INT = 2147483647; // 2^31 - 1
const MIN_INT = -2147483648; // -2^31

class Solution {
  int divide(int dividend, int divisor) {
    int count = 0;
    bool isNegative = dividend < 0 != divisor < 0;
    int first = dividend.abs();
    int second = divisor.abs();

    if (first < second) return 0;
    if (second == 1){
      if (isNegative) return -first;
      if (first > MAX_INT){
        return MAX_INT;
      }
      return first;
    }
   
    while (first >= second){
      first -= second;
      count++;
    }

    return isNegative ? -count : count;
  }
}

// accepted solution in Dart, optimized
// import 'dart:math';

// class Solution {
//   int minimum = pow(-2, 31).toInt();
//   int maximum = pow(2, 31).toInt() - 1;
//   int divide(int dividend, int divisor) {
//     int res = 0;
//     int sign = 1;
//     var d = dividend.abs();
//     var dv = divisor.abs();
//     sign = (dividend * divisor).isNegative ? -1 : 1;
//     while (d >= dv) {
//       var tmp = dv;
//       var mul = 1;
//       while (d >= tmp) {
//         d -= tmp;
//         res += mul;
//         tmp += tmp;
//         mul += mul;
//       } 
//     }
//     res = res * sign;
//     if (sign.isNegative) {
//       return max(minimum, res);
//     } else {
//       return min(maximum, res);
//     }
//   }
// }