class Solution {
  fun isSymmetric(root: TreeNode?): Boolean {
    return isMirror(root, root)
  }

  fun isMirror(n1: TreeNode?, n2: TreeNode?): Boolean {
    if(n1 == null && n2 == null) return true
    if(n1 != null && n2 != null && n1.`val` == n2.`val`)
      return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left)
    return false
  }
}