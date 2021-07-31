package org.issxjl2015.algorithm.Lc_392_判断子序列;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/31/21:48
 * @Description:
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenS = s.length();
        int lenT = t.length();
        if (lenS > lenT) {
            return false;
        }

        int index = 0;
        for (int i = index; i < lenT && index < lenS; i++) {
            if (s.charAt(index) == t.charAt(i)) {
                index++;
            }
        }
        return index == lenS;
    }
}
