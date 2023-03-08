import 'dart:math';

class Solution {
  String addBinary(String a, String b) {
    List<String> result = [];
    int lastIndexA = a.length - 1;
    int lastIndexB = b.length - 1;
    int maxIndex = max(lastIndexA, lastIndexB);
    int carry = 0;
    int i = 0;
    while (i <= maxIndex) {
      int value = carry;
      if (lastIndexA - i >= 0) {
        value += int.parse(a[lastIndexA - i]);
      }
      if (lastIndexB - i >= 0) {
        value += int.parse(b[lastIndexB - i]);
      }
      int remainder = value % 2;
      result.add(remainder.toString());
      if (value > 1) {
        carry = 1;
      } else {
        carry = 0;
      }
      i++;
    }
    if (carry == 1) {
      result.add(carry.toString());
    }
    return result.reversed.join();
  }
}
