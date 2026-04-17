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
    public void bst(TreeNode root, ArrayList<Integer> arr){
        if(root==null) return;
        bst(root.left, arr);
        arr.add(root.val);
        bst(root.right, arr);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        bst(root, arr);
        return arr.get(k-1);
    }
}
