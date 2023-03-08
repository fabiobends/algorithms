class TreeNode {
  int val;
  TreeNode? left;
  TreeNode? right;
  TreeNode([this.val = 0, this.left, this.right]);
}

class Solution {
  TreeNode? invertTree(TreeNode? root) {
    if (root == null) {
      return null;
    }
    TreeNode? leftNode = invertTree(root.left);
    TreeNode? rightNode = invertTree(root.right);
    root.left = rightNode;
    root.right = leftNode;
    return root;
  }
}
