class Solution42 {
    public int deleteAndEarn(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length;
        int max = nums[0];
        for (int b:nums
             ) {
            max=Math.max(max,b);
        }


        int []all=new int[max+1];
        for (int a:nums
             ) {
              all[a]++;
        }
//                                       22 333 4  0 0 2 3 10
        int []dp=new int[max+1];
        dp[1]=all[1]*1;
        dp[2]=Math.max(dp[1],dp[0]+2*all[2]);
        for (int i = 3; i <=max ; i++) {
            dp[i]=Math.max(dp[i-1],dp[i-2]+all[i]*i);
        }



      return dp[max];
    }

    public static void main(String[] args) {
        int []num={3,4,2};
        System.out.println( new Solution42().deleteAndEarn(num));  ;
    }
}

