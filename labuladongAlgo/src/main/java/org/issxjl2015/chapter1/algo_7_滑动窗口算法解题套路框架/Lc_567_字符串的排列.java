package org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架;

import java.util.HashMap;
import java.util.Map;

/**
 * 判断 s2 是否包含 s1 的排列
 *
 * 核心：s2 是否包含 s1 的排列，直接判断s1的字符和频次，在s2的子串中是否有即可，
 * 至于怎么排列的，不关心，因为题目要求的就是 s1 的排列
 *
 */
public class Lc_567_字符串的排列 {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        // 将字符放入need中
        for (int i = 0; i < s1.length(); i++) {
            need.put(s1.charAt(i), need.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left = 0, right = 0;
        int vaild = 0;

        while (right < s2.length()) {
            char c = s2.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    vaild++;
                }
            }

            // 判断是否收缩：收缩窗口的时机是窗口大小大于 s1 的长度，因为不管怎么排列，长度肯定不会变
            while (right - left >= s1.length()) {
                // 在这里判断是否找到合法的子串
                if (vaild == need.size()) {
                    return true;
                }
                char d = s2.charAt(left);
                left++;
                // 更新窗口内的一系列的数据
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d))) {
                        vaild--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        // 未找到符合条件的子串
        return false;
    }
}
