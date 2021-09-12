class Solution27 {
    public int maxSubArray(int[] nums) {

        int []dp=new int[nums.length+1];
      int max=  dp[0]=0;
        dp[1]=-2;
        for (int i = 2; i <=nums.length ; i++) {

            dp[i]=Math.max(dp[i-1],0)+nums[i-1];
            max=Math.max(max,dp[i]);
            return  max;
        }










        return 0;

    }
}