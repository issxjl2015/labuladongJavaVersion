package org.issxjl2015.algorithm.Lc_59_螺旋矩阵II;

public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        // 上边界初始化
        int top = 0;
        // 右边界初始化
        int right =  n - 1;
        // 下边界初始化
        int bottom = n - 1;
        // 左边界初始化
        int left = 0;
        int num = 1;
        int end = n * n;

        while (num <= end) {

            for (int i = left; i <= right; i++) {
                ans[top][i] = num++;
            }
            // 上边界向下移动
            top++;

            for (int i = top; i <= bottom; i++) {
                ans[i][right] = num++;
            }
            // 右边界向左移动
            right--;

            for (int i = right; i >= left; i--) {
                ans[bottom][i] = num++;
            }
            // 下边界向上移动
            bottom--;

            for (int i = bottom; i >= top; i--) {
                ans[i][left] = num++;
            }
            left++;
        }
        return ans;
    }

}
