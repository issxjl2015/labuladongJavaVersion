package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_算法刷题指南;

import java.util.LinkedList;

/**
 * 回溯算法框架
 */
public class BacktrackingFrame {

    LinkedList<LinkedList<Integer>> res = new LinkedList<>();

    public void backtrack(int[] nums, LinkedList<Integer> track) {
        // 如果 track 长度 与 nums 的长度相等，则说明完成了一次遍历，可以将符合条件的路径加入到结果中
        if (track.size() == nums.length) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])) {
                continue;
            }
            // 加入未使用过的元素
            track.add(nums[i]);
            // 进入下一层决策树
            backtrack(nums, track);
            // 移出最后一个元素
            track.removeLast();
        }
    }

    // 提取 N叉树 遍历框架
    public void backtrackFrame(int[] nums, LinkedList<Integer> track) {
        for (int i = 0; i < nums.length; i++) {
            // 回溯， backtrackFrame 就是上面的 backtrack() 方法
            backtrackFrame(nums, track);
        }
    }
}
