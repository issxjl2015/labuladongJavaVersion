package org.issxjl2015.algorithm.Lc_200_岛屿数量;

/**
 * 0 —— 海洋格子
 * 1 —— 陆地格子（未遍历过）
 * 2 —— 陆地格子（已遍历过）
 *
 */
public class Solution {
    private int res;
    public int numIslands(char[][] grid) {
        res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int row, int col) {
        if (row >= grid.length || col >= grid[0].length || row < 0 || col < 0) {
            return;
        }

        if (grid[row][col] != '1') {
            return;
        }

        grid[row][col] = '2';
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }

}
