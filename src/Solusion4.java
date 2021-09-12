

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
class Solusion4 {
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;

        if (root.right!=null) return  Math.max(1+maxDepth(root.right),1+maxDepth(root.left));
       else if (root.left!=null) return  Math.max(1+maxDepth(root.right),1+maxDepth(root.left));
         else return 1;


    }
}