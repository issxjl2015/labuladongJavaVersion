package org.issxjl2015.algorithm.Lc_784_字母大小写全排列;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/10/22:41
 * @Description:
 */
public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String s = "a1b2";
        List<String> ans = solution.letterCasePermutation(s);
        List<String> expectArr = Arrays.asList("A1B2", "A1b2", "a1B2", "a1b2");
        for (int i = 0; i < ans.size(); i++) {
            Assert.assertEquals(expectArr.get(i), ans.get(i));
        }
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        String s = "3z4";
        List<String> ans = solution.letterCasePermutation(s);
        List<String> expectArr = Arrays.asList("3Z4", "3z4");
        for (int i = 0; i < ans.size(); i++) {
            Assert.assertEquals(expectArr.get(i), ans.get(i));
        }
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        String s = "12345";
        List<String> ans = solution.letterCasePermutation(s);
        List<String> expectArr = Collections.singletonList("12345");
        for (int i = 0; i < ans.size(); i++) {
            Assert.assertEquals(expectArr.get(i), ans.get(i));
        }
    }
}
