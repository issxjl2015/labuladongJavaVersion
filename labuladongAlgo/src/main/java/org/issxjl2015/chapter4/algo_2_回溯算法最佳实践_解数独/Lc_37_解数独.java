package org.issxjl2015.chapter4.algo_2_回溯算法最佳实践_解数独;

public class Lc_37_解数独 {

    public void solveSudoku(char[][] board) {
        boolean ans = backtrack(board, 0, 0);
    }

    public boolean backtrack(char[][] board, int i, int j) {
        int m = 9, n = 9;

        if (j == n) {
            // 穷举到最后一列的话，就换到下一行重新开始
            return backtrack(board, i + 1, 0);
        }

        if (i == m) {
            return true;
        }

        // 如果当前位置是预设数字，不用操心
        System.out.println("i = " + i + ", j = " + j);
        if (i < 9 && j < 9 && board[i][j] != '.') {
            return backtrack(board, i, j + 1);
        }

        for (char ch = '1'; ch <= '9'; ch++) {
            // 遇到不合法的数字，直接跳过
            if (!isVaild(board, i, j, ch)) {
                continue;
            }
            // 做选择
            board[i][j] = ch;
            // 开始穷举下一个位置
            backtrack(board, i, j + 1);
            // 撤销选择
            board[i][j] = '.';
        }
        return true;
    }

    public boolean isVaild(char[][] board, int r, int c, char n) {
        for (int i = 0; i < 9; i++) {
            // 判断行是否存在重复
            if (board[r][i] == n) {
                return false;
            }
            // 判断列是否存在重叠
            if (board[i][c] == n) {
                return false;
            }
            // 判断 3 x 3 方框是否存在重叠
            if (board[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] == n) {
                return false;
            }
        }
        return true;
    }
}
