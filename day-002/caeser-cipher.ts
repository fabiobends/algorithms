/*
 * Complete the 'caesarCipher' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */

function caesarCipher(s: string, k: number): string {
    // Write your code here 
    const alphabet = 'abcdefghijklmnopqrstuvwxyz';
    const shift = k % alphabet.length 
    const rightChunk = alphabet.substring(shift, alphabet.length)
    const leftChunk = alphabet.substring(0, shift)
    const rotatedAlphabet = rightChunk.concat(leftChunk)
    const alphabetArray = alphabet.split("");
    const rotatedAlphabetArray = rotatedAlphabet.split("");
    const stringArray = s.split("")
    const isUppercaseRegExp = /[A-Z]/;
    const isLetterRegExp = /[a-zA-Z]/;
    const encryptedString = stringArray.map(item => {
      if (isLetterRegExp.test(item)){  
        if (!isUppercaseRegExp.test(item)){
          const index = alphabetArray.findIndex(letter => letter === item)
          return rotatedAlphabetArray[index] 
        }
        else {
          const index = alphabetArray.findIndex(letter => letter.toUpperCase() === item)
          return rotatedAlphabetArray[index].toUpperCase() 
        }
      }
      return item
    })
    
    return encryptedString.join("")
}
