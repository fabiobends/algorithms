import 'dart:math';

final MIN_VALUE = -pow(2,31);
final MAX_VALUE = pow(2,31) - 1;

class Solution {
  int reverse(int x) {
    final list = x.toString().split("").reversed.toList();
    if (x < 0){
      list.insert(0, '-');
      list.removeLast();
    }
    final reversedNumber = int.parse(list.join(""));
    if (reversedNumber <= MIN_VALUE || reversedNumber >= MAX_VALUE){
      return 0;
    }
    return reversedNumber;
  }
}