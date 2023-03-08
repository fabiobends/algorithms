import 'dart:math';

class TreeNode {
  int val;
  TreeNode? left;
  TreeNode? right;
  TreeNode([this.val = 0, this.left, this.right]);
}

class Solution {
  int minDistance = pow(10, 5).toInt();
  // Initially, it will be null.
  TreeNode? prevValue;

  void inorderTraversal(TreeNode? root) {
    if (root == null) {
      return;
    }
    inorderTraversal(root.left);
    // Find the difference with the previous value if it is there.
    if (prevValue != null) {
      minDistance = min(minDistance, (root.val) - (prevValue?.val ?? 0));
    }
    prevValue = root;
    inorderTraversal(root.right);
  }

  int minDiffInBST(TreeNode? root) {
    inorderTraversal(root);
    return minDistance;
  }
}
