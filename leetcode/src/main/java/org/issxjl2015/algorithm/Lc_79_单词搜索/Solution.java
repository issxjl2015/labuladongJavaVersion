package org.issxjl2015.algorithm.Lc_79_单词搜索;

public class Solution {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int k) {
        // 所有字符都有了，触发退出条件
        if (k == word.length()) {
            return true;
        }
        // 越界，直接返回 false
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) {
            return false;
        }

        if (word.charAt(k) != board[i][j]) {
            return false;
        }

        char t = board[i][j];
        // 进回溯前，修改字符（避免匹配后，被二次使用）
        board[i][j] = '0';
        boolean res = dfs(board, word, i + 1, j, k + 1)
                || dfs(board, word, i - 1, j, k + 1)
                || dfs(board, word, i, j - 1, k + 1)
                || dfs(board, word, i, j + 1, k + 1);
        // 出回溯后，改回原有字符
        board[i][j] = t;
        return res;
    }
}
