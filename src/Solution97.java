class Solution97 {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;


        for (int i = n-2; i >=0 ; i--) {
            for (int j = 0; j <n ; j++) {
               int  best=matrix[i+1][j];


                if (j>0)best=Math.min(best,matrix[i+1][j-1]);

                if (j+1<n)best=Math.min(best,matrix[i+1][j+1]);

                matrix[i][j]+=best;


            }
        }
        int ans=Integer.MAX_VALUE;
        for (int c:matrix[0]
             ) {
             ans=Math.min(ans,c);
        }


        return ans;







    }

    public static void main(String[] args) {
        int dp[][]={{2, 10000000, 10000000, 10000},
                {3, 4, 10000, 10000},
                {6, 5, 7, 100000},
                {4, 1, 8, 1000000}};
        System.out.println(new Solution97().minFallingPathSum(dp));
    }
}