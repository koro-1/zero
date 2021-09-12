public class Solution102 {
    int[][] s;
    int n, m;
    public int[][] matrixBlockSum(int[][] mat, int k) {
        n = mat.length; m = mat[0].length;
        s = new int[n+1][m+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                s[i][j] = s[i-1][j] + s[i][j-1] - s[i-1][j-1] + mat[i-1][j-1];//1
            }
        }

        int[][] res = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int x1 = Math.max(0, i-k);
                int y1 = Math.max(0, j-k);
                int x2 = Math.min(n-1, i+k);
                int y2 = Math.min(m-1, j+k);
                res[i][j] = calc(x1, y1, x2, y2);
            }
        }
        return res;
    }

    int calc(int x1, int y1, int x2, int y2){
        x1++; x2++; y1++; y2++;
        return s[x2][y2] - s[x1-1][y2] - s[x2][y1-1] + s[x1-1][y1-1];// 2
    }
}
