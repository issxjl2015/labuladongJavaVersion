package org.issxjl2015.contest.weeklycontest.weeklycontest241.algo_5759_找出所有子集的异或总和再求和;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public int subsetXORSum(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(nums, 0);
        int result = 0;
        for (List<Integer> tmpLst : ans) {
            if (tmpLst.size() == 0) {
                continue;
            }
            int rst = tmpLst.get(0);
            for (int ii  = 1; ii < tmpLst.size(); ii++) {
                rst ^= tmpLst.get(ii);
            }
            result += rst;
        }
        return result;
    }

    public void backtrack(int[] nums, int index) {
        if (index == nums.length) {
            ans.add(new LinkedList<>(list));
            return;
        }
        list.add(nums[index]);
        backtrack(nums, index + 1);
        list.remove(list.size() - 1);
        backtrack(nums, index + 1);
    }
}
