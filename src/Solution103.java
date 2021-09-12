class NumMatrix {
    int [][]sum;
    /*public NumMatrix(int[][] matrix) {

        int n=matrix.length;


        if (n>0){
            int m=matrix[0].length;
            sum =new int[n+1][m+1];


            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    sum[i+1][j+1]=sum[i+1][j+1]+sum[i+1][j+1]+matrix[i][j]-sum[i][j];
                }
            }

        }
    }*/
    int[][] sums;

    public NumMatrix(int[][] matrix) {
        int m = matrix.length;
        if (m > 0) {
            int n = matrix[0].length;
            sums = new int[m + 1][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sums[i + 1][j + 1] = sums[i][j + 1] + sums[i + 1][j] - sums[i][j] + matrix[i][j];
                }
            }
        }
    }


    public int sumRegion(int row1, int col1, int row2, int col2) {
        return  sum[row2+1][col2+1] - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */