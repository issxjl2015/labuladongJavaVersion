package org.issxjl2015.algorithm.Lc_424_替换后的最长重复字符;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/21:46
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "ABAB";
        int k = 2;
        int ans = solution.characterReplacement(s, k);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "AABABBA";
        int k = 1;
        int ans = solution.characterReplacement(s, k);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "AAAA";
        int k = 2;
        int ans = solution.characterReplacement(s, k);
        Assert.assertEquals(4, ans);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        String s = "BAAA";
        int k = 0;
        int ans = solution.characterReplacement(s, k);
        Assert.assertEquals(3, ans);
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        String s = "BAAA";
        int k = 2;
        int ans = solution.characterReplacement(s, k);
        Assert.assertEquals(4, ans);
    }
}
