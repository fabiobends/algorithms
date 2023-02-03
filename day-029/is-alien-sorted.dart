class Solution {
  bool isAlienSorted(List<String> words, String order) {
    if (words.length == 1) return true;
    int j = 0;
    for (int i = 0; i < words.length - 1; i++){
      String currentWord = words[i];
      String nextWord = words[i+1];
      int currentLetterOrderIndex = order.indexOf(currentWord[j]);
      int nextLetterOrderIndex = order.indexOf(nextWord[j]);
      if (currentLetterOrderIndex > nextLetterOrderIndex){
        return false;
      }
      if (currentLetterOrderIndex == nextLetterOrderIndex){
        while (j < currentWord.length - 1){
          j++;
          currentLetterOrderIndex = order.indexOf(currentWord[j]);
          if (j < nextWord.length){
            nextLetterOrderIndex = order.indexOf(nextWord[j]);
          } else {
            nextLetterOrderIndex = -1;
          }
          if (currentLetterOrderIndex > nextLetterOrderIndex){
            return false;
          }
          if (currentLetterOrderIndex < nextLetterOrderIndex){
            break;
          }
        }
        j = 0;
      }
    }
    return true;  
  }
}