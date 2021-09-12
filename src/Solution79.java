public class Solution79 {

    public int lengthOfLIS(int[] nums,int n){
        if(n == 0) return 0;
        int res = 1;
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int num:nums){
            int i = 0,j = res;
            while(i < j){
                int mid = (i + j)>>1;
                if(dp[mid] >= num) j = mid;
                else i = mid + 1;
            }
            dp[i] = num;
            if(j == res) res++;
        }
        return res;
    }
    public static void main(String[] args) {
           int []nums ={3,8,3,2,4};
        System.out.println(new Solution79().lengthOfLIS(nums,6));

    }
}
