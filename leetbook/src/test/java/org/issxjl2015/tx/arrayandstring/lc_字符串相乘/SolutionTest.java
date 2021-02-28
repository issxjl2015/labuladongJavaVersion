package org.issxjl2015.tx.arrayandstring.lc_字符串相乘;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String num1 = "2";
        String num2 = "3";
        String ans = solution.multiply(num1, num2);
        Assert.assertEquals(ans, "6");
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String num1 = "123";
        String num2 = "456";
        String ans = solution.multiply(num1, num2);
        Assert.assertEquals(ans, "56088");
    }
}
