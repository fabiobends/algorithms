/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */
function flippingMatrix(matrix: number[][]): number {
  // Write your code here
  let max = 0
  let total = 0
  let n = matrix.length/2
  for (let row = 0; row < n; row++){
    for (let column = 0; column < n; column++){
      max = 0
      max = Math.max(matrix[row][column], max)
      max = Math.max(matrix[row][2*n - column - 1], max)
      max = Math.max(matrix[2*n - row - 1][column], max)
      max = Math.max(matrix[2*n - row - 1][2*n - column - 1], max)
      total += max
} }
  return total
}