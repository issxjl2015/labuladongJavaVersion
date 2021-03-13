package org.issxjl2015.chapter1.algo_3_回溯算法解题套路框架;

import java.util.LinkedList;
import java.util.List;

public class Lc_46_全排列 {

    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        // 记录路径
        LinkedList<Integer> list = new LinkedList<>();
        // 回溯
        backtracak(list, nums);
        return ans;
    }

    private void backtracak(LinkedList<Integer> list, int[] nums) {
        // 结束条件
        if (list.size() == nums.length) {
            ans.add(new LinkedList<>(list));
            return;
        }

        //
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }

            // 做选择
            list.add(nums[i]);
            // 进入下一层决策树
            backtracak(list, nums);
            // 撤销选择
            list.removeLast();
        }
    }
}
