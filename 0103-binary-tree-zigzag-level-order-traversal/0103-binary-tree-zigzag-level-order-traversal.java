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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        q.offer(root);
        boolean rtl = false;
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int n = q.size();
            for(int i = 0; i<n; i++){
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left!=null)
                q.offer(node.left);
                if(node.right!=null)
                q.offer(node.right);
            }
            if(rtl){
                Collections.reverse(temp);
                res.add(temp);
                rtl = false;
            }
            else{
                res.add(temp);
                rtl = true;
            }

        }
        return res;
        
    }
}