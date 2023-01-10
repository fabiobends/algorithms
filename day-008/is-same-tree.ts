// Definition for a binary tree node.
class TreeNode {
  val: number;
  left: TreeNode | null;
  right: TreeNode | null;
  constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
    this.val = val === undefined ? 0 : val;
    this.left = left === undefined ? null : left;
    this.right = right === undefined ? null : right;
  }
}

function isSameTree(p: TreeNode | null, q: TreeNode | null): boolean {
  // 1. both empty
  if (p === null && q === null) return true;

  // 2. both non-empty
  if (p !== null && q !== null) {
    return (
      p.val === q.val &&
      p.left?.val === q.left?.val &&
      p.right?.val === q.right?.val &&
      isSameTree(p.left, q.left) &&
      isSameTree(p.right, q.right)
    );
  }

  // 3. one empty, and one not
  return false;
}
