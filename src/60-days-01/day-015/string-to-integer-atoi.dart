import 'dart:math';

final MIN_VALUE = -pow(2, 31);
final MAX_VALUE = pow(2, 31) - 1;

// first solution
// class Solution {
//   int myAtoi(String s) {
//     final str = s.trim();
//     final signOrNumberRegex = RegExp(r'[\-\+\d]');
//     if (str.length == 0 || !signOrNumberRegex.hasMatch(str[0])){
//       return 0;
//     }
//     final numberRegex = RegExp(r'\d');
//     var lastIndex = str.length;
//     var hasDot = false;
//     var value = 0;
//     for (int i = 1; i < str.length; i++){
//       if (str[i] == '.'){
//         if(hasDot){
//           lastIndex = i;
//           break;
//         }
//         hasDot = true;
//       }
//       if (str[i] == '+' || str[i] == '-'){
//         lastIndex = i;
//         break;
//       }
//       if (!numberRegex.hasMatch(str[i])){
//         lastIndex = i;
//         break;
//       }
//     }
//     value = double.tryParse(str.substring(0,lastIndex))?.toInt() ?? 0;
//     if (value < MIN_VALUE){
//       value = MIN_VALUE.toInt();
//     }
//     if (value > MAX_VALUE){
//       value = MAX_VALUE.toInt();
//     }
//     return value;
//   }
// }

// second solution (way better)
class Solution {
  int myAtoi(String s) {
    final regex = RegExp(r'^[\+\-]?\d+\.?\d*');
    final str = regex.stringMatch(s.trim());
    var value = double.tryParse(str ?? "")?.toInt() ?? 0;
    if (value < MIN_VALUE) {
      value = MIN_VALUE.toInt();
    }
    if (value > MAX_VALUE) {
      value = MAX_VALUE.toInt();
    }
    return value;
  }
}
