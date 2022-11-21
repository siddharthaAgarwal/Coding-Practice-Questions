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
    public int maxDepth(TreeNode A) {
         if(A==null)
            return 0;
        
         // if(A.left==null && A.right==null)
         //    return 1;
        
        
        
        int left = maxDepth(A.left);
        int right = maxDepth(A.right);
        
        return Math.max(left, right)+1;
        
    }
}