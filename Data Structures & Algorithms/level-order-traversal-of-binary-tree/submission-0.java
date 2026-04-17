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
    public void level(TreeNode root, List<List<Integer>> li, int level){
        if(root==null) return;
        if(level < li.size()){
            li.get(level).add(root.val);
        }
        else{
            List<Integer> a = new ArrayList<>();
            a.add(root.val);
            li.add(a);
        }
        level(root.left, li, level+1);
        level(root.right, li, level+1);
        return;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = 0;
        List<List<Integer>> arr= new ArrayList<>();
        level(root, arr, level);
        return arr;
    }
}
