import 'dart:io';

String BracketMatcher(String str) {
  // code goes here
  RegExp exp = RegExp(r'[a-zA-Z]');
  str = str.replaceAll(exp, '');
  str = str.replaceAll(' ', '');
  var match = true;
  while (match) {
    var oldStr = str;
    str = str.replaceAll('()', '');
    if (oldStr == str) {
      match = false;
    }
  }
  if (str.length > 0) return '0';
  return '1';
}

// keep this function call here
void main() {
  String input = stdin.readLineSync() ?? '';
  print(BracketMatcher(input));
}
