package org.issxjl2015.chapter4.algo_3_回溯算法最佳实践_括号生成;

import java.util.LinkedList;
import java.util.List;

public class Lc_22_括号生成 {
    // 记录所有合法的括号组合
    List<String> ans = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return ans;
        }

        StringBuffer track = new StringBuffer();
        backtrack(n, n, track);
        return ans;
    }

    public void backtrack(int left, int right, StringBuffer track) {
        if (left < 0 || right < 0) {
            return;
        }
        // 左括号剩余太多，肯定不合法
        if (right < left) {
            return;
        }

        if (left == 0 && right == 0) {
            ans.add(track.toString());
            return;
        }
        // 做选择
        track.append("(");
        // 回溯迭代
        backtrack(left - 1, right, track);
        String ss = track.toString();
        // 撤销选择
        track.deleteCharAt(ss.length() - 1);

        track.append(")");
        backtrack(left, right - 1, track);
        String tt = track.toString();
        track.deleteCharAt(tt.length() - 1);
    }
}
