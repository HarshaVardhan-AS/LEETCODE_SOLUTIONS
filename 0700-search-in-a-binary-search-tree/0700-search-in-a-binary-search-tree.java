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
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        find(root, val);
        return ans;
        
    }
    public void find(TreeNode root, int val){
        if(root == null)
        return;
        if(root.val == val){
        ans = root;
        return;
        }
        if(root!= null && root.val!= val){
            if(root.val < val){
                find(root.right, val);
            }
            else if(root.val > val){
                find(root.left, val);
            }
            
        }
    }
}