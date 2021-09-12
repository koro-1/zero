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
class Solution23 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

         if (root1==null)return root2;
         if (root2==null)return root1;


                int a=0,b=0;
          a= root1.val;
          b= root2.val;
        TreeNode root=  new TreeNode(a+b);
        root.right=mergeTrees(root1.right,root2.right);
        root.left=mergeTrees(root1.left,root2.left);
        return  root;





    }

    public static void main(String[] args) {
        new Solution23().mergeTrees(new TreeNode(3,new TreeNode(6,new TreeNode(3),null),new TreeNode(6,null,null)),new TreeNode(3,new TreeNode(6,null,null),new TreeNode(6,null,null)));
    }
}