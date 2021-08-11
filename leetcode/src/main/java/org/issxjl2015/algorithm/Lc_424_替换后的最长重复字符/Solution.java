package org.issxjl2015.algorithm.Lc_424_替换后的最长重复字符;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/20:26
 * @Description: 这个代码不能AC，仅供参考，是个错误思路，请注意
 */
public class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        int l = 0, r = 0;
        int cnt = 0;
        while (r < s.length()) {
            // 左指针的初值
            char startCh = s.charAt(l);
            char d = s.charAt(r);
            r++;
            // 对不同值进行计数
            if (d != s.charAt(l)) {
                cnt++;
            }
            // 更新ans
            if (cnt == k) {
                ans = Math.max(ans, r - l);
            }
            // 不同值大于 k，右移左指针
            while (cnt > k) {
                char c = s.charAt(l);
                l++;
                // 判断cnt是否减一，得根据左指针的初值来判定
                if (c != startCh || r - l == 1) {
                    cnt--;
                }
            }
        }
        // 如果不同值小于 k，说明最长为字符串的长度
        return cnt < k ? s.length() : ans;
    }
}
