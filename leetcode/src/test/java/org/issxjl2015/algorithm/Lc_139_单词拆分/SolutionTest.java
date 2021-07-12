package org.issxjl2015.algorithm.Lc_139_单词拆分;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");

        boolean ans = solution.wordBreak(s, wordDict);
        Assert.assertTrue(ans);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");

        boolean ans = solution.wordBreak(s, wordDict);
        Assert.assertTrue(ans);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");

        boolean ans = solution.wordBreak(s, wordDict);
        Assert.assertFalse(ans);
    }
}
