package org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架;

import java.util.HashMap;
import java.util.Map;

/**
 * 用滑动窗口算法实现无重复字符的最长子串
 *
 */
public class Lc_3_无重复字符的最长子串_2 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        int ans = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 进行窗口内一系列的数据更新
            // 此处更新就只需要累加次数即可
            map.put(c, map.getOrDefault(c, 0) + 1);

            // 判断左侧窗口是否要收缩，只要窗口内存在重复元素，那么就要一直收缩下去
            while (map.get(c) > 1) {
                char d = s.charAt(left);
                left++;
                // 进行窗口内数据的一系列更新
                map.put(d, map.get(d) - 1);
            }
            // 更新ans
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
