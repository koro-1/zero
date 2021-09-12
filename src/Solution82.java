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
class Solution82 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
         int deep= maxDepth(root);
        for (int i = 0; i <deep ; i++) {
            list.add(huisu(root,i,new ArrayList<>()));
        }
        return list;



    }
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;

        if (root.right!=null) return  Math.max(1+maxDepth(root.right),1+maxDepth(root.left));
        else if (root.left!=null) return  Math.max(1+maxDepth(root.right),1+maxDepth(root.left));
        else return 1;


    }
    public List<Integer> huisu(TreeNode root,int index,List<Integer>list){
        if (root==null) return null;

        if (index==0) {
            list.add(root.val);
            return list;
        }
         huisu(root.left,index-1,list);
         huisu(root.right,index-1,list);
        return list;
    }

    public static void main(String[] args) {

        System.out.println(new Solution82().levelOrder( new TreeNode(3,new TreeNode(4,new TreeNode(2),new TreeNode(8)),new TreeNode(5,new TreeNode(6),null))));
    }


}