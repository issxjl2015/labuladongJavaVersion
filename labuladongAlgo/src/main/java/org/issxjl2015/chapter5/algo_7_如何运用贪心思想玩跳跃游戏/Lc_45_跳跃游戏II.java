package org.issxjl2015.chapter5.algo_7_如何运用贪心思想玩跳跃游戏;

public class Lc_45_跳跃游戏II {

    public int jump(int[] nums) {
        int len = nums.length;
        // 站在索引 i，最多能跳到索引 end
        int end = 0;
        // 从索引 [i..end] 起跳，最远能到的距离
        int farthest = 0;
        // 记录跳跃的次数
        int jumps = 0;
        for (int i = 0; i < len - 1; i++) {
            farthest = Math.max(farthest, nums[i] + i);
            if (end == i) {
                jumps++;
                // 记录最远能到的索引
                end = farthest;
            }
        }
        return jumps;
    }
}
