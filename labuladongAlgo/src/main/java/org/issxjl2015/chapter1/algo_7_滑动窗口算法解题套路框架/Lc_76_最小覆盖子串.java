package org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架;

import java.util.HashMap;
import java.util.Map;

public class Lc_76_最小覆盖子串 {

    public String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>(), window = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }

        // 滑动窗口的左右边界
        int left = 0, right = 0;
        // 满足条件的个数，用于判定条件
        int valid = 0;

        int start = 0, len = Integer.MAX_VALUE;

        while (right < s.length()) {
            // c 是 移入滑动窗口的字符
            char c = s.charAt(right);

            right++;

            // 进行窗口内的数据更新
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c)) ) {
                    valid++;
                }
            }

            // 判断是否全部满足
            while (valid == need.size()) {
                // 更新最小子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }

                // d 是移出窗口左侧的字符
                char d = s.charAt(left);
                // 收缩左侧窗口
                left++;
                // 进行窗口内数据的一系列的更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }

        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

}
