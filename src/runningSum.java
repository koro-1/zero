import java.util.Arrays;

public class runningSum {
    public int[] runningSum(int[] nums) {

        int []nums2;
         nums2=nums.clone();
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {

            nums[i]=nums[i]+sum;
            sum=sum+nums2[i];

        }
        for (int a:nums
             ) {
            System.out.println(a);
        }


return  nums;
    }

    public static void main(String[] args) {
        int  []nums={1,2,3,4};
        System.out.println(new runningSum().runningSum(nums));
    }


}
