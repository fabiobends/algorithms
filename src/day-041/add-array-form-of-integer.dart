class Solution {
  List<int> addToArrayForm(List<int> num, int k) {
    List<int> listK = [];
    String listKtoString = k.toString();
    for (int i = 0; i < listKtoString.length; i++) {
      listK.add(int.parse(listKtoString[i]));
    }
    if (listK.length > num.length) {
      var temp = num;
      num = listK;
      listK = temp;
    }
    final int lastIndexInNum = num.length - 1;
    final int lastIndexInK = listK.length - 1;
    int carry = 0;
    List<int> result = [];
    for (int i = 0; i <= lastIndexInNum; i++) {
      int accumulator = num[lastIndexInNum - i];
      if (i <= lastIndexInK) {
        accumulator += listK[lastIndexInK - i];
      }
      accumulator += carry;
      if (accumulator >= 10) {
        carry = 1;
        accumulator -= 10;
      } else {
        carry = 0;
      }
      result.add(accumulator);
    }
    if (carry == 1) {
      result.add(carry);
    }
    return result.reversed.toList();
  }
}
