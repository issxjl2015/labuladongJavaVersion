package org.issxjl2015.chapter1.algo_3_回溯算法解题套路框架;

import java.util.LinkedList;
import java.util.List;

public class Lc_46_全排列 {

    // 记录全排列的结果
    List<List<Integer>> ans = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        // 记录路径
        LinkedList<Integer> list = new LinkedList<>();
        // 回溯递归
        backtracak(list, nums);
        return ans;
    }

    private void backtracak(LinkedList<Integer> list, int[] nums) {
        // 结束条件：当路径的长度等于nums的长度时，就说明完成了一次全排列
        if (list.size() == nums.length) {
            // 潜在的错误点：加入到最终结果时，需要 重新 new 一个对象来接收
            ans.add(new LinkedList<>(list));
            return;
        }

        // 遍历 nums
        for (int i = 0; i < nums.length; i++) {
            // 使用过的数字，不能再次使用
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
