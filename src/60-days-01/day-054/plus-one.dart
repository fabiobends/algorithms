class Solution {
  List<int> plusOne(List<int> digits) {
    int carry = 1;
    List<int> result = [];
    for (int i = digits.length - 1; i >= 0; i--) {
      final value = digits[i] + carry;
      if (value == 10) {
        result.add(0);
      } else {
        result.add(value);
        carry = 0;
      }
    }
    if (carry == 1) {
      result.add(1);
    }
    return result.reversed.toList();
  }
}
