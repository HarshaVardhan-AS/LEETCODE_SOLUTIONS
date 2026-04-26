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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insert(root, val);
        return root;
    }
    public TreeNode insert(TreeNode root, int val){
        if(root == null)
        {
            TreeNode node = new TreeNode(val);
            return node;
        }
        else if(val < root.val){
            root.left = insert(root.left, val);
            return root;
        }
        else{
            root.right = insert(root.right, val);
            return root;
        }
    }
}