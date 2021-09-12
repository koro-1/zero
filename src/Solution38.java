import java.util.Arrays;

class Solution38 {
    public boolean canJump(int[] nums) {

        int len =nums.length; int max=0;
        for (int i =0; i <=nums.length-1 ; i++) {
            if (max<i)return false;
             max=Math.max(max,i+nums[i]);

             if (max>=nums.length-1)return true;

        }

        return false;
    }

    public static void main(String[] args) {
        int num[]={3,2,1,0,4}; ;
        System.out.println(Arrays.toString(Arrays.copyOfRange(num, 1, 3)));
        new Solution38().canJump(num);
    }
}