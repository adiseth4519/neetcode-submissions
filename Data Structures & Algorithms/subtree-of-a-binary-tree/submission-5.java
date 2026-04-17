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
    public boolean same(TreeNode root, TreeNode subroot){
        if(root==null && subroot==null) return true;
        if(root==null) return false;
        if(subroot==null) return false;
        if(root.val == subroot.val){
            return same(root.left, subroot.left) && same(root.right, subroot.right);
        }
        else return false;
    }
    public boolean find(TreeNode root, TreeNode subroot){
        if(root==null) return false;
        if(same(root, subroot)) return true;
        return find(root.left, subroot) || find(root.right, subroot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        return find(root, subroot);
        
    }
}
