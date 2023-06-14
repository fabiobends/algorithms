class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  private int min = Integer.MAX_VALUE;
  private int val = -1;

  public int getMinimumDifference(TreeNode root) {
    if (root.left != null) {
      getMinimumDifference(root.left);
    }
    if (val >= 0)
      min = Math.min(min, root.val - val);
    val = root.val;
    if (root.right != null) {
      getMinimumDifference(root.right);
    }
    return min;
  }
}