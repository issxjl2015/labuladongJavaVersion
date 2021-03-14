package org.issxjl2015.contest.weeklycontest.weeklycontest232.algo_5701_仅执行一次字符串交换能否使两个字符串相等;

public class Solution {

    public boolean areAlmostEqual(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2) {
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (int i = 0; i < len1; i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (s1Arr[i] != s2Arr[i]) {
                return false;
            }
        }

        int count = 0;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                // 为啥是 2 呢？ 因为交换两个字符，交换一次，其实就是有两个字符不一样
                if (count > 2) {
                    return false;
                }
            }
        }
        return true;

    }









    public boolean areAlmostEqual1(String s1, String s2) {
        int len1 = s1.length();
        if (len1 < 2) {
            return false;
        }
        if (isNotSameCount(s1, s2)) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;

                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isNotSameCount(String s1, String s2) {
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i) - 'a']++;
            s2Arr[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (s1Arr[i] != s2Arr[i]) {
                return false;
            }
        }
        return true;
    }
}
