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
class Solution5 {
    public boolean isValidBST(TreeNode root) {


        if (root.right==null&&root.left==null)return true;
        if (root.right!=null&&root.right.val>root.val&&root.left==null){
            return isValidBST(root.right);
        }
        else if (root.left!=null&&root.left.val<root.val&&root.right==null){
            return isValidBST(root.left);
        }
       else if (root.right!=null&&root.left!=null&&root.right.val>root.val&&root.left.val<root.val)
      {
          return isValidBST(root.right)&&isValidBST(root.left);
      }




        else return false;

















    }
    public  int util(int n){
        int num=0;
        while (n>0){
            if (n%2==1) num++;


            n/=2;
        }

        return  num;
    }


    public static void main(String[] args) {
       // System.out.println(new Solution5().isValidBST(new TreeNode(1,new TreeNode(1),null)  ));
        System.out.println(new Solution5().util(7));
    }
}