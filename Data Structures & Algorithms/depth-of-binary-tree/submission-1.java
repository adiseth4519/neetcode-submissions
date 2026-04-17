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
    public int depth(TreeNode root, int d){
        if(root == null) return d;
        int d1 = depth(root.left, d+1);
        int d2 = depth(root.right, d+1);
        int max = Math.max(d1, d2);
        return max;
    }
    public int maxDepth(TreeNode root) {
        int max = depth(root, 0);
        return max;
    }
}
