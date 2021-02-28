package org.issxjl2015.tx.arrayandstring.lc_存在重复元素;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /**
     * 利用set中没有重复元素的特点来判断是否存在重复元素
     * @param nums nums
     * @return 返回
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
