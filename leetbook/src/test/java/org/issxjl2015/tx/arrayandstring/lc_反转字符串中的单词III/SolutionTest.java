package org.issxjl2015.tx.arrayandstring.lc_反转字符串中的单词III;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "Let's take LeetCode contest";
        String ans = solution.reverseWords(s);
        Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", ans);
    }
}
