// global variable that holds the user's input
const inputLines: Array<string> = []

function main() {
  // remove first row that holds numbers of operations
  // use all operations from 1 to inputLines.length
  const commands = inputLines.slice(1)
  const strings = ['']
  commands.forEach(command => {
    const pair = command.split(' ')
    const operation = pair[0]
    const input = pair[1]
    const lastString = strings[strings.length - 1]
    switch(operation){
      case '1': {
        let currentString = lastString
        currentString += input
        strings.push(currentString)
        break 
      }
      case '2': {
        const remainingString = lastString.substring(0, lastString.length - Number(input))
        strings.push(remainingString)
        break
      }
      case '3': {
        console.log(lastString[Number(input) - 1])
        break
      }
      case '4': {
        strings.pop()
      }
    }
  })
}