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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        findPostOrder(root, list);
        return list;
    }
    
    public static void findPostOrder(TreeNode root, List<Integer> list)
    {
        if(root == null)
            return;
        
        findPostOrder(root.left, list);
        findPostOrder(root.right, list);
        list.add(root.val);
    }
}