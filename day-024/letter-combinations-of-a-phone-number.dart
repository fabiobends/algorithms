final Map<String, String> chars = {
  '2': 'abc',
  '3': 'def',
  '4': 'ghi',
  '5': 'jkl',
  '6': 'mno',
  '7': 'pqrs',
  '8': 'tuv',
  '9': 'wxyz'
};

class Solution {
  List<String> letterCombinations(String digits) {
    if (digits.length == 0) return [];
    
    final firstDigit = digits[0];
    final charsInDigit = chars[firstDigit] ?? "";
    if (digits.length == 1) return charsInDigit.split("");

    final allCombinations = List<String>.empty(growable: true);
    final rest = digits.substring(1);
    final combinationsWithoutFirst = letterCombinations(rest);

    for (int i = 0; i < charsInDigit.length; i++){
      for (int j = 0; j < combinationsWithoutFirst.length; j++){
        allCombinations.add("${charsInDigit[i]}${combinationsWithoutFirst[j]}");
      }
    }
  
    return allCombinations;
  }
}