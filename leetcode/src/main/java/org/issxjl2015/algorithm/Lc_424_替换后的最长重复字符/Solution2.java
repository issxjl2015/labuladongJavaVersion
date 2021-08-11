package org.issxjl2015.algorithm.Lc_424_替换后的最长重复字符;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/20:26
 * @Description: 
 */
public class Solution2 {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        // 双指针范围内，重复字符出现次数的历史最大值
        int maxCnt = 0;
        int[] num = new int[26];
        while (r < s.length()) {
            num[s.charAt(r) - 'A']++;
            maxCnt = Math.max(maxCnt, num[s.charAt(r) - 'A']);
            // 不能用while,因为maxCnt需要实时更新
            if (r - l + 1 - maxCnt > k) {
                num[s.charAt(l) - 'A']--;
                l++;
            }
            r++;
        }
        return r - l;
    }
}
