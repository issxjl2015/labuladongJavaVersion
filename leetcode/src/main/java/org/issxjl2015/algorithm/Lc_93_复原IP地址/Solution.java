package org.issxjl2015.algorithm.Lc_93_复原IP地址;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<String> restoreIpAddresses(String s) {
        List<String> ans = new LinkedList<>();
        dfs(s, 0, new ArrayList(), ans);
        return ans;
    }

    private void dfs(String s, int startIndex, List<String> path, List<String> ans) {
        // 终止条件：
        // 1、ip 段最多 4 段，超过 4 段终止。
        // 2、如果等于 4 段，但不是一开始完整的字符串也终止。
        // 3、如果 4 段，并且组合起来是一开始的字符串，则添加到结果里面去。
        if (path.size() > 4) {
            return;
        }
        if (path.size() >= 4 && startIndex != s.length()) {
            return;
        }

        if (path.size() == 4) {
            ans.add(String.join(".", path));
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            // 过滤条件：如果字符串在 0-255 之外，过滤。如果字符串存在 01 这种情况，过滤
            String newStr = s.substring(startIndex, i + 1);
            if ((newStr.length() > 1 && newStr.startsWith("0")) || newStr.length() > 3) {
                continue;
            }
            int value = Integer.parseInt(newStr);
            if (value < 0 || value > 255) {
                continue;
            }

            // 做选择
            path.add(newStr);
            // 进入下一层决策树
            dfs(s, i + 1, path, ans);
            // 撤销选择
            path.remove(path.size() - 1);
        }
    }
}
