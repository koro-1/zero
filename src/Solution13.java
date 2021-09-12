public class Solution13 {
    int sum=0;
    public int diameterOfBinaryTree(TreeNode root) {
        shendubianli(root);
        return sum;
    }

    public int shendubianli(TreeNode node) {
    if ( node==null)return  0;

    int l=shendubianli(node.left);
    int r=shendubianli(node.right);
    sum =Math.max(sum,l+r);
    return Math.max(r,l)+1;




    }
}
