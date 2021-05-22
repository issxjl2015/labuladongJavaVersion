package org.issxjl2015.algorithm.Lc_22_括号生成;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> ans = new ArrayList<>();
        dfs(n, n, "", ans);
        return ans;
    }

    // left 为剩余的 左括号数量，right 为剩余的 右括号数量
    // track 为生成的字符串， ans 为符合条件的结果
    private void dfs(int left, int right, String track, List<String> ans) {
        // 剩下的左括号比右括号多，说明不合法
        if (right < left) {
            return;
        }
        // 剩余的左括号或者右括号小于 0， 说明不合法
        if (left < 0 || right < 0) {
            return;
        }

        if (left == 0 && right == 0) {
            ans.add(track);
            return;
        }

        track += "(";
        dfs(left - 1, right, track, ans);
        String tmpStr = track;
        track = tmpStr.substring(0, tmpStr.length() - 1);

        track += ")";
        dfs(left, right - 1, track, ans);
        tmpStr = track;
        track = tmpStr.substring(0, tmpStr.length() - 1);
    }
}
