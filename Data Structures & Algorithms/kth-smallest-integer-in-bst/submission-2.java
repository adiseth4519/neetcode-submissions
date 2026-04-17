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
    int ans=-1;
    int c=1;
    public void bst(TreeNode root, int k){
        if(ans!=-1) return;
         if(root == null) return;
         bst(root.left, k);
         if(ans==-1 && c==k){
            ans= root.val;
         }
         else c++;
         bst(root.right, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        bst(root, k);
        return ans;
    }
}
