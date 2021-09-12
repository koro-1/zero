import com.sun.org.apache.bcel.internal.generic.SWAP;

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
class Solution20 {

    public TreeNode invertTree(TreeNode root) {


        if (root==null) return root;

        root.left=invertTree(root.right);
        root.right=invertTree(root.left);

       return  root;



    }

    public  void  swap(int a, int b)
    {int temp=0;

        temp=a;
        a=b;
        b=temp;
    }

    public static void main(String[] args) {
      new Solution20().invertTree( new TreeNode(3,new TreeNode(6,null,null),new TreeNode(8,null,null)));
    }
}