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
    public void ans(TreeNode root, List<Integer> res, int l){
        if(root==null) return;
        if(l==res.size()){
            res.add(root.val);
        }
        ans(root.right, res, l+1);
        ans(root.left, res, l+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        ans(root, res, 0);
        return res;
    }
}
