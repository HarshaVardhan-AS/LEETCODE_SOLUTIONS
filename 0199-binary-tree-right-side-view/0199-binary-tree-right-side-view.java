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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        if(root == null)
        return res;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i<n-1; i++){
                TreeNode node = q.poll();
                if(node.left!= null)
                q.offer(node.left);
                if(node.right!=null)
                q.offer(node.right);
            }
            TreeNode node = q.poll();
            res.add(node.val);
            if(node.left!=null)
            q.offer(node.left);
            if(node.right!=null)
            q.offer(node.right);
        }
        return res;
        
    }
}