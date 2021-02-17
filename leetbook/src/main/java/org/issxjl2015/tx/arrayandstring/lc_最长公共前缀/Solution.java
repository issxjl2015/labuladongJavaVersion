package org.issxjl2015.tx.arrayandstring.lc_最长公共前缀;

/**
 * 最长公共前缀：先取出第一个字符串，与剩余的字符串进行比较，只要不相等，就对公共前缀进行截取
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String strs1 = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int len = Math.min(strs1.length(), strs[i].length());
            int j = 0;
            while (j < len && (strs1.charAt(j) == strs[i].charAt(j))) {
                j++;
            }
            strs1 = strs1.substring(0, j);
        }
        return strs1;
    }
}
