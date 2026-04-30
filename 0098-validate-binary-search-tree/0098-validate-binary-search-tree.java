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
    boolean valid = true;
    long prev  = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null)
        return true;
        inorder(root);
        return valid;

        
    }
    public void inorder(TreeNode root){
        if(root == null)
        return;
        if(valid == false)
        return;
        inorder(root.left);
        if(root.val <= prev){
            valid = false;
            return;
        }
        else{
            prev = root.val;
        }
        inorder(root.right);

    }
}