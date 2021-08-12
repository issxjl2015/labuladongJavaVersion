package org.issxjl2015.algorithm.Lc_994_腐烂的橘子;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/12/22:48
 * @Description:
 */
public class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        // 新鲜橘子个数
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    count++;
                } else if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int round = 0;
        while (count > 0 && !queue.isEmpty()) {
            round++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] orange = queue.poll();
                int row = orange[0];
                int col = orange[1];

                if (row + 1 < grid.length && grid[row + 1][col] == 1) {
                    count--;
                    grid[row + 1][col] = 2;
                    queue.add(new int[]{row + 1, col});
                }

                if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                    count--;
                    grid[row - 1][col] = 2;
                    queue.add(new int[]{row - 1, col});
                }

                if (col + 1 < grid[0].length && grid[row][col + 1] == 1) {
                    count--;
                    grid[row][col + 1] = 2;
                    queue.add(new int[]{row, col + 1});
                }

                if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                    count--;
                    grid[row][col - 1] = 2;
                    queue.add(new int[]{row, col - 1});
                }
            }
        }

        if (count > 0) {
            return -1;
        }
        return round;
    }
}
