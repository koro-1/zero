class Solution36 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[n];                // 10 15 20 14 17
    }


    public static void main(String[] args) {
         int []a={1,1,15,1,1};
        System.out.println(new Solution36().minCostClimbingStairs(a));

    }
}