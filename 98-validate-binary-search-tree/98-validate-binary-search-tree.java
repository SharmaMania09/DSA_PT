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
    public boolean isValidBST(TreeNode root) {
        
        return isValidBst(root, null, null);
        
    }
    
    public boolean isValidBst(TreeNode root, TreeNode min, TreeNode max)
    {
        if(root == null)
            return true;
        if(min != null && root.val <= min.val)
            return false;
        if(max != null && root.val >= max.val)
            return false;
        return (isValidBst(root.left, min, root) && isValidBst(root.right, root, max));
    }
}