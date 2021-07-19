package org.issxjl2015.algorithm.Lc_131_分割回文串;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        LinkedList<String> track = new LinkedList<>();
        dfs(track, s, 0);
        return ans;
    }

    private void dfs(LinkedList<String> track, String s, int index) {
        if (index == s.length()) {
            ans.add(new LinkedList<>(track));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            // 校验 字符串是否为回文字符串
            if (isValid(s, index, i)) {
                String str = s.substring(index, i + 1);
                track.add(str);
            } else {
                // 非回文串，跳过
                continue;
            }

            dfs(track, s, i + 1);
            track.removeLast();
        }
    }

    private boolean isValid(String s, int start, int end) {
        int l = start, r = end;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
