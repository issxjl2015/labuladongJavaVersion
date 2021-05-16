package org.issxjl2015.contest.biweeklycontest.biweeklycontest52;

public class Lc_5744_旋转盒子 {

    public char[][] rotateTheBox(char[][] box) {
        int n = box.length, m = box[0].length;
        char[][] ans = new char[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n - i - 1] = box[i][j];
            }
        }

        for (int j = 0; j < n; j++) {
            int pos = m - 1;
            for (int i = m - 1; i >= 0; i--) {
                if (ans[i][j] == '*') {
                    pos = i - 1;
                } else if (ans[i][j] == '#') {
                    ans[i][j] = '.';
                    ans[pos--][j] = '#';
                }
            }
        }

        return ans;
    }
}
