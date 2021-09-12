import java.util.Arrays;

class Solution45 {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);
      int left=0,right=nums.length-1,max=0;
      while (left<right){

          max=Math.max(max,nums[left]+nums[right]);
          left++;right--;
      }

        return max;
    }

    public static void main(String[] args) {
        int[] nums={3,5,4,2,4,7};
        System.out.println(new Solution45().minPairSum(nums));   ;
    }
}