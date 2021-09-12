import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution40 {
    public int maxFrequency(int[] nums, int k) {
        int n=1,max=0,sum=0;
        if (nums.length<=1)return nums.length;

        /*  if (findmin(nums)+k>=findmax(nums)) return nums.length;*/
        Arrays.sort(nums);
        for (int i = nums.length-1; i+1>=max&&i >=1; i--) {
            n=1;   sum=0;
            for (int j = i-1; j>=0; j--) {
                sum=sum+nums[i]-nums[j]; n++;
                if (sum>k) {n--; break;}
            }
            max=Math.max(max,n);
        }
        return  max;










    }

    public static void main(String[] args) {
     int num[]={} ;
        System.out.println(new Solution40().maxFrequency(num,5)); ;
    }
}