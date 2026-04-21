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
    public boolean isBalanced(TreeNode root) {
       int res = bal(root);
        if(res == -1)
        return false;
        else
        return true;
    }
    public int bal(TreeNode root){
        if(root == null)
        return 0;

        int left = bal(root.left);
        int right = bal(root.right);
        if(left == -1 || right == -1)
        return -1;
        if(Math.abs(left-right) >1){
            return -1;
        }
        else
        return 1+ Math.max(left, right);
    }
}