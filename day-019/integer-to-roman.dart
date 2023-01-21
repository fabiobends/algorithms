class Solution {
  String intToRoman(int num) {
    final dividers = <int>[1000,900,500,400,100,90,50,40,10,9,5,4,1];
    final letters = <String>['M','CM','D','CD','C','XC','L','XL','X','IX','V','IV','I'];
    var str = '';
    for (int i = 0; i < dividers.length; i++){
      if (num >= dividers[i]){
        final reminder = num % dividers[i];
        final repeat = (num / dividers[i]).floor();
        str += letters[i]*repeat + intToRoman(reminder);
        break;
      }
    }
    return str;
  }
}