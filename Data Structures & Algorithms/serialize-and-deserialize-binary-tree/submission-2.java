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

public class Codec {

    public void encode(TreeNode root, StringBuilder sb){
        if(root==null) {
            sb.append("N,");
            return;
        }
        sb.append(root.val).append(",");
        encode(root.left, sb);
        encode(root.right, sb);
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        encode(root, sb);
        return sb.toString();
    }
    public TreeNode decode(Queue<String> tokens){
        String token= tokens.poll();
        if(token.equals("N")) return null;
        TreeNode root= new TreeNode(Integer.parseInt(token));
        root.left= decode(tokens);
        root.right= decode(tokens);
        return root;
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> tokens= new LinkedList<>(Arrays.asList(data.split(",")));
        return decode(tokens);
    }
}
