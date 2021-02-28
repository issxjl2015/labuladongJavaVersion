package org.issxjl2015.tx.arrayandstring.lc_反转字符串;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        char[] s = {'H','a', 'n','n','a','h'};
        solution.reverseString(s);
    }

}
