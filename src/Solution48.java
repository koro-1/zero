import java.util.ArrayList;
import java.util.HashMap;
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
class Solution48 {
            int num=0;
            HashMap<Integer,TreeNode>map=new HashMap<>();
    public void recoverTree(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        list=bianli(root,list);  int a=list.size()-1,b=-1;
        if (list.get(0)>list.get(1)) { a=0;
        }
         if (list.get(list.size()-2)>list.get(list.size()-1)) { b=list.size()-1;
        }
        for (int i = 1; i <list.size()-1 ; i++) {

            if (list.get(i)>list.get(i-1)&&list.get(i)>list.get(i+1)) a=Math.min(a,i);
            else if (list.get(i)<list.get(i-1)&&list.get(i)<list.get(i+1)) b=Math.max(b,i);

        }
         int temp;
        temp=map.get(a).val;
        map.get(a).val=  map.get(b).val;
        map.get(b).val=temp;






    }
    public  List<Integer> bianli(TreeNode root, List<Integer>list){
        if (root==null) { return list;}

        bianli(root.left,list);

        list.add(root.val);
         map.put(num++,root);
        bianli(root.right,list);



        return  list;
    }

    public static void main(String[] args) {
       TreeNode t=new TreeNode(146,new TreeNode(71,new TreeNode(55,new TreeNode(321,new TreeNode(-33),null),null),null),new TreeNode(-13,new TreeNode(231),new TreeNode(399)));
        new Solution48().recoverTree( t);
        System.out.println(t.toString());
    }
}