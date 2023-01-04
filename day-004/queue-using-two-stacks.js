// it can be done using two stacks, but using `shift` in one single array this problem gets dummy
function processData(input) {
  let stack = [];
  // let stack1 = [];
  // let stack2 = [];
  let queries = input.split("\n").slice(1);
  for (let i = 0; i < queries.length; i++) {
    if (queries[i].charAt(0) === "1") {
      let pair = queries[i].split(" ");
      stack.push(pair[1]);
      // stack1.push(pair[1])
    }
    if (queries[i].charAt(0) === "2") {
      stack.shift()
      /* while (stack1.length > 0) {
        stack2.push(stack1.pop());
      }
      stack2.pop();
      while (stack2.length > 0) {
        stack1.push(stack2.pop());
      }
      */
    }
    if (queries[i].charAt(0) === "3") {
      console.log(stack[0]);
      // console.log(stack1[0]);
    }
  }
}