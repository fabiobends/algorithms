// my solution
class Solution {
  int romanToInt(String s) {
    int amount = 0;
    final Map<String, int> romanSpecialLetters = {
      'CM': 900,
      'CD': 400,
      'XC': 90,
      'XL': 40,
      'IX': 9,
      'IV': 4
    };
    final Map<String, int> romanLetters = {
      'M':1000,
      'D':500,
      'C':100,
      'L':50,
      'X':10,
      'V':5,
      'I':1
    };

    romanSpecialLetters.forEach((key, value){
      if(s.contains(key)){
        amount += value;
        s = s.replaceAll(key, '');
      }
    });
    romanLetters.forEach((key, value){
      var matches = key.allMatches(s);
      amount += matches.length*value;
    });

    return amount;  
  }
}

// adaption of an optimized solution
class Solution {
  int romanToInt(String s) {
    int amount = 0;
    int currentValue = 0;
    int nextValue = 0;
    final Map<String, int> romanLetters = {
      'I':1,
      'V':5,
      'X':10,
      'L':50,
      'C':100,
      'D':500,
      'M':1000
    };
    for(int i = 0; i < s.length; i++){
      currentValue = romanLetters[s[i]] ?? 0;
      nextValue = i + 1 < s.length ? romanLetters[s[i+1]] ?? 0 : 0;
      if(currentValue < nextValue){
        amount -= currentValue;
      } else {
        amount += currentValue;
      }
    }
    return amount;
  }
}