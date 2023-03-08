class Solution {
  int compress(List<String> chars) {
    int length = chars.length;
    if (length == 1) return 1;

    int i = 0, result = 0;
    while (i < length) {
      int count = 1;
      while (i < length - 1 && chars[i] == chars[i + 1]) {
        count++;
        i++;
      }
      chars[result++] = chars[i++];
      if (count > 1) {
        final String countStr = count.toString();
        for (int j = 0; j < countStr.length; j++) {
          chars[result++] = countStr[j];
        }
      }
    }
    return result;
  }
}
