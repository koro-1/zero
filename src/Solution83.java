import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
class Solution83 {
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer>set=new HashSet<>();
        Object[] a= huisu(root,set).toArray();
        Arrays.sort(a);
        if (a.length==1) return -1;
         int c=(int)a[1];

        System.out.println(Arrays.toString(a));

         return c;
    }
    public Set<Integer> huisu(TreeNode root, Set<Integer> set){
        if (root==null) return set;
        set.add(root.val);
        huisu(root.left,set);
        huisu(root.right,set);
        return set;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(9,new TreeNode(2147483647,new TreeNode(5),new TreeNode(2)),new TreeNode(3));
        System.out.println(new Solution83().findSecondMinimumValue(root));
    }

}