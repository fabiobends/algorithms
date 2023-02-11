/**
 * @param {string} s
 * @param {string[]} words
 * @return {number[]}
 */
var findSubstring = function (s, words) {
  // Initialise an array to store our answers in
  let answers = [];

  // Calculate the total length of the words
  const wordLength = words[0].length;
  const totalLengthOfWords = words.length * wordLength;

  // Loop through the string, until there is insufficient space left to find all words
  for (let i = 0; i <= s.length - totalLengthOfWords; i++) {
    // If the string from this point contains all target words, store the starting position
    if (doesStringContainAllWords(s.substring(i), words.slice(), wordLength)) {
      answers.push(i);
    }
  }

  return answers;
};

function doesStringContainAllWords(string, words, wordLength) {
  // If all words have been found
  if (!words.length) return true;

  // Loop through all words
  for (let i = 0; i < words.length; i++) {
    // Store the length of the target word (as it may be spliced)

    // Check if the word in question matches is found at the start of the string
    if (string.substring(0, wordLength) === words[i]) {
      // Remove the found word from the words array
      words.splice(i, 1);
      // Look for the remaining words in the rest of the string
      return doesStringContainAllWords(
        string.substring(wordLength),
        words,
        wordLength
      );
    }
  }

  // If no words were found in the current string
  return false;
}
