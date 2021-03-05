package org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lc_438_找到字符串中所有字母异位词 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            need.put(p.charAt(i), need.getOrDefault(p.charAt(i), 0) + 1);
        }

        int left = 0, right = 0;
        int vaild = 0;
        while (right < s.length()) {
            // 要从右侧移入窗口的字符
            char c = s.charAt(right);
            right++;

            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (need.get(c).equals(window.get(c))) {
                    vaild++;
                }
            }

            while (right - left >= p.length()) {
                // 判断是否找到合适的子串
                if (vaild == need.size()) {
                    // 将索引加到ans结果中
                    ans.add(left);
                }
                // 要从左侧移出窗口的字符
                char d = s.charAt(left);
                left++;
                // 更新窗口内的一系列的数据
                if (need.containsKey(d)) {
                    if (need.get(d).equals(window.get(d))) {
                        vaild--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return ans;
    }
}
