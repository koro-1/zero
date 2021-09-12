class Solution63 {
    public int minPathSum(int[][] grid) {
         int min=0;
         int [][]dp=new int[grid.length][grid[0].length];
        for (int i = 0,sum=0; i <grid[0].length ; i++) {

            dp[0][i]=sum+grid[0][i];
            sum=sum+grid[0][i];
        }
        for (int i = 0,sum=0; i <grid.length ; i++) {

            dp[i][0]=sum+grid[i][0];
            sum=sum+grid[i][0];
        }
        for (int i = 1; i <grid.length ; i++) {
            for (int j = 1; j <grid[0].length ; j++) {
                  dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }





     return dp[grid.length-1][grid[0].length-1];
    }

    public static void main(String[] args) {
         int [][]nums={{1,2,3},{4,5,6}};
        System.out.println(new Solution63().minPathSum(nums));
        System.out.println(nums.length);
    }
}