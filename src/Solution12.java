import java.util.ArrayList;
import java.util.List;

class Solution12 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n=nums.length,m;
        for (int i = 0; i <n ; i++) {
           m= Math.abs(nums[i])-1;
            nums[m]=-Math.abs(nums[m]);
        }







        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ret.add(i + 1);
            }
        }
        return ret;


    }

    public static void main(String[] args) {
        int []num={4,3,2,7,8,2,3,1};
        new Solution12().findDisappearedNumbers(num);
    }
}