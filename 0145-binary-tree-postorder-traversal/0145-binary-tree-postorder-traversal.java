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
    
    
     public void postorderTraversal(List<Integer> res, TreeNode A) {
        if(A==null)
        return ;
        postorderTraversal(res,A.left);
        postorderTraversal(res,A.right);     
        res.add(A.val);
    }
    

    
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> res= new ArrayList<>();
        
        postorderTraversal(res,root);
        return res;
    }
}