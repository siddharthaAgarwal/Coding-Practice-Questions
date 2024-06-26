/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int processLeftLeaf(TreeNode root) {
        if (root.left != null && root.left.left == null && root.left.right == null) 
            return root.left.val;
        return 0;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int sum = 0;
        sum += sumOfLeftLeaves(root.left);
        sum += processLeftLeaf(root);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
