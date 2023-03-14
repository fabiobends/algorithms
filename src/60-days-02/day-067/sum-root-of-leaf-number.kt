class Solution {
    fun sumNumbers(root: TreeNode?): Int {
      return sumNodes(root, 0)
    }

    fun sumNodes(root: TreeNode?, currentSum: Int): Int {
      if(root == null) return 0
      val currentValue = currentSum * 10 + root.`val`
      if(root.left == null && root.right == null) return currentValue
      val leftSum = sumNodes(root.left, currentValue)
      val rightSum = sumNodes(root.right, currentValue)
      return leftSum + rightSum
    }
}