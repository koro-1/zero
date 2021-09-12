class Solution101 {
    public int maxSideLength(int[][] mat, int threshold) {
        //二分查找
        int row = mat.length, col = mat[0].length;
        int[][] prefix = new int[row + 1][col + 1];
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= col; ++j) {
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }

        int left = 0, right = Math.min(row, col), mid = 0, res = 0;
        while (left < right) {
            mid = (left + right + 1)/2;
            boolean flag = false;
            for (int i = 1; i + mid <= row + 1; ++i) {
                for (int j = 1; j + mid <= col + 1; ++j) {
                    int temp = prefix[i + mid - 1][j + mid - 1] - prefix[i + mid - 1][j - 1] - prefix[i - 1][j + mid - 1] + prefix[i - 1][j - 1];
                    if (temp <= threshold) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
/*
class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        //枚举+优化
        int row = mat.length, col = mat[0].length;
        int[][] prefix = new int[row + 1][col + 1];
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= col; ++j) {
                prefix[i][j] = prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1] + mat[i - 1][j - 1];
            }
        }

        int r = Math.min(row, col), res = 0;
        for (int i = 1; i <= row; ++i) {
            for (int j = 1; j <= col; ++j) {
                for (int k = res + 1; k <= r; ++k) {
                    if (i + k - 1 <= row && j + k - 1 <= col && (prefix[i + k - 1][j + k - 1] - prefix[i + k - 1][j - 1] - prefix[i - 1][j + k - 1] + prefix[i - 1][j - 1] <= threshold)) {
                        res = k;
                    } else {
                        break;
                    }
                }
            }
        }
        return res;
    }
}*/
