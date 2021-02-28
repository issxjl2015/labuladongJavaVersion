package org.issxjl2015.tx.arrayandstring.lc_反转字符串;

public class Solution {
    public void reverseString(char[] s) {
        if (s == null || s.length < 2) {
            return;
        }
        // 双指针，相互交换即可
        int left = 0, right = s.length - 1;
        while (left < right) {
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;
        }
    }

}
