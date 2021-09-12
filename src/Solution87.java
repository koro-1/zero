import java.util.ArrayList;
import java.util.List;

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
class Solution87 {
    List<Integer>list= new ArrayList<>();
    public void flatten(TreeNode root) {
        if (root==null)return;
        bianli(root);
        TreeNode root2=root;
         root2.left=null;

        for (int i = 1; i <list.size() ; i++) {
              root2.right=new TreeNode(list.get(i));
              root2=root2.right;

        }


    }
    public void bianli(TreeNode root){
        if (root==null) return;
        list.add(root.val);
        bianli(root.left);
        bianli(root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(5,null,new TreeNode(6)));
        new Solution87().flatten(treeNode);
    }
}