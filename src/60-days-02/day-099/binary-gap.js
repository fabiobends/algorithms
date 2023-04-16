function solution(N) {
  const binary = N.toString(2);
  const regex = /0+1/g;
  const answers = binary.match(regex);
  if (!answers) return 0;
  answers.sort((a, b) => b.length - a.length);
  const largestInterval = answers[0];
  return largestInterval.length - 1;
}
