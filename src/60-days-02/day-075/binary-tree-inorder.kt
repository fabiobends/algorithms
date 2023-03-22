class Solution {
    fun inorderTraversal(root: TreeNode?): List<Int> {
      val resultList = mutableListOf<Int>()
      inOrder(root, resultList)
      return resultList
    }
    
    fun inOrder(root: TreeNode?, list: MutableList<Int>) {
      if (root == null) return
      inOrder(root.left, list)
      list.add(root.`val`)
      inOrder(root.right, list)
    }
}