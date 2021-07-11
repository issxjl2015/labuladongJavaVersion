package org.issxjl2015.algorithm.Lc_49_字母异位词分组;

import org.junit.Test;

import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = solution.groupAnagrams(strs);
        System.out.println(ans);
    }
}
