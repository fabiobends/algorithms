class Solution {
  List<int> findSubstring(String s, List<String> words) {
    // Initialise an array to store our answers in
    List<int> answers = [];

    // Calculate the total length of the words
    final wordLength = words[0].length;
    final totalLengthOfWords = words.length * wordLength;

    // Loop through the string, until there is insufficient space left to find all words
    for (int i = 0; i <= s.length - totalLengthOfWords; i++) {
      // If the string from this point contains all target words, store the starting position
      if (doesStringContainAllWords(
          s.substring(i), List<String>.from(words), wordLength)) {
        answers.add(i);
      }
    }

    return answers;
  }

  bool doesStringContainAllWords(
      String string, List<String> words, int wordLength) {
    // If all words have been found
    if (words.length == 0) return true;

    // Loop through all words
    for (int i = 0; i < words.length; i++) {
      // Check if the word in question matches is found at the start of the string
      if (string.substring(0, wordLength) == words[i]) {
        // Remove the found word from the words array
        words.removeAt(i);
        // Look for the remaining words in the rest of the string
        return doesStringContainAllWords(
            string.substring(wordLength), words, wordLength);
      }
    }

    // If no words were found in the current string
    return false;
  }
}
