package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_7_滑动窗口算法解题套路框架.Lc_438_找到字符串中所有字母异位词;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class lc_438_找到字符串中所有字母异位词_test {

    @Test
    public void test1() {
        Lc_438_找到字符串中所有字母异位词 solution = new Lc_438_找到字符串中所有字母异位词();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = solution.findAnagrams(s, p);
        int[] ansInt = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansInt[i] = ans.get(i);
        }
        int[] expectedsInt = {0, 6};
        Assert.assertArrayEquals(expectedsInt, ansInt);
    }

    @Test
    public void test2() {
        Lc_438_找到字符串中所有字母异位词 solution = new Lc_438_找到字符串中所有字母异位词();
        String s = "abab";
        String p = "ab";
        List<Integer> ans = solution.findAnagrams(s, p);
        int[] ansInt = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansInt[i] = ans.get(i);
        }
        int[] expectedsInt = {0, 1, 2};
        Assert.assertArrayEquals(expectedsInt, ansInt);
    }

    @Test
    public void test3() {
        Lc_438_找到字符串中所有字母异位词 solution = new Lc_438_找到字符串中所有字母异位词();
        String s = "baa";
        String p = "aa";
        List<Integer> ans = solution.findAnagrams(s, p);
        int[] ansInt = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ansInt[i] = ans.get(i);
        }
        int[] expectedsInt = {1};
        Assert.assertArrayEquals(expectedsInt, ansInt);
    }
}
