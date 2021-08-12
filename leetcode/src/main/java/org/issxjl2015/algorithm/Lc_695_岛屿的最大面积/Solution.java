package org.issxjl2015.algorithm.Lc_695_岛屿的最大面积;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/12/23:15
 * @Description:
 */
public class Solution {
    int value = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    value = 0;
                    dfs(grid, i, j);
                    ans = Math.max(ans, value);
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] grid, int row, int col) {
        if (row >= grid.length || col >= grid[0].length || row < 0 || col < 0) {
            return;
        }
        if (grid[row][col] != 1) {
            return;
        }
        grid[row][col] = 2;
        value++;

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}
