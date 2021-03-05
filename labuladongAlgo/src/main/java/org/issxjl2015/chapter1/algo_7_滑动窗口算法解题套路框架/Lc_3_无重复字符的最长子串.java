package org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架;

import java.util.HashMap;
import java.util.Map;

public class Lc_3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int ans = 1;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                // 存在重复元素，则将左边界右移
                left = Math.max(left, map.get(c) + 1);
            }
            // 最大长度要基于更新后的左边界来判定
            ans = Math.max(ans, right - left + 1);
            map.put(c, right);
            right++;
        }
        return ans;
    }
}
