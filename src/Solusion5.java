class Solusion5 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (right < left) {
            return null;
        }
        int index = left + (right - left) / 2;   //int num[]={5,6,7,8,9,10};
        TreeNode root = new TreeNode(nums[index]);
        root.left = sortedArrayToBST(nums, left, index-1);
        root.right = sortedArrayToBST(nums, index + 1, right);
        return root;
    }

    public static void main(String[] args) {
         int num[]={5,6,7,8,9,10};
        System.out.println(new Solusion5().sortedArrayToBST(num));
    }

}