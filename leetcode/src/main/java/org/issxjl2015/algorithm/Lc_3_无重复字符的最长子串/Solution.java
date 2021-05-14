package org.issxjl2015.algorithm.Lc_3_无重复字符的最长子串;

import java.util.HashMap;
import java.util.Map;

/**
 * 用 map 来判断是否字符重复
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int len = s.length();
        Map<Character, Integer> map = new HashMap<>();

        int left = 0, right = 0;
        while (right < len) {
            char c = s.charAt(right);
            right++;

            while (left < right && map.containsKey(c)) {
                char d = s.charAt(left);
                left++;
                map.put(d, map.get(d) - 1);
                if (map.get(d) == 0) {
                    map.remove(d);
                }
            }
            map.put(c, 1);
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
