class TreeNode {
  int val;
  TreeNode? left;
  TreeNode? right;
  TreeNode([this.val = 0, this.left, this.right]);
}

class Solution {
  int maxDepth(TreeNode? root) {
    if (root == null) return 0;
    int maxDepthLeft = maxDepth(root.left) + 1;
    int maxDepthRight = maxDepth(root.right) + 1;
    if (maxDepthLeft > maxDepthRight) {
      return maxDepthLeft;
    }
    return maxDepthRight;
  }
}
