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
    public void preorderTraversal(List<Integer> res, TreeNode A) {
        if(A==null)
        return ;
        res.add(A.val);
        preorderTraversal(res,A.left);
        preorderTraversal(res,A.right);        
    }
    

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        
        preorderTraversal(res,root);
        return res;
        
    }
}