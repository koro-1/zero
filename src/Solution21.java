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
class Solution21 {
    public boolean isValidBST(TreeNode root) {
         List<Integer>list=new ArrayList<>();
         list=bianli(root,list);
        for (int i = 0; i <list.size()-1 ; i++) {

            if (list.get(i)>=list.get(i+1))return  false;

        }
        return true;





    }
      public  List<Integer> bianli(TreeNode root, List<Integer>list){
          if (root==null)return list;

         bianli(root.left,list);

          list.add(root.val);

          bianli(root.right,list);



          return  list;
      }


    public static void main(String[] args) {

     boolean b=new Solution21().isValidBST(new TreeNode(2,new TreeNode(2),new TreeNode(2)));
     boolean a=   new Solution21().isValidBST(new TreeNode(5,new TreeNode(1),new TreeNode(4,new TreeNode(3),new TreeNode(6)) ));
        System.out.println(b);
    }
}