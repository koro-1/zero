public class Solution60 {


        public int maxSubArray(int[] nums) {
     int max=0;
            int []dp=new int[nums.length+1];
            dp[0]=0; dp[1]=nums[0];
            for (int i = 2; i <=nums.length ; i++) {

                dp[i]=Math.max(0,dp[i-1])+nums[i-1];
                 max=Math.max(max,dp[i]);
            }
          return max;
        }

    public static void main(String[] args) {
        int []num={1,-2,3,-2};
        new Solution60().maxSubArray(num);
    }


}
