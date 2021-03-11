package org.issxjl2015.chapter5.algo_7_如何运用贪心思想玩跳跃游戏;

public class Lc_55_跳跃游戏 {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (farthest <= i) {
                return false;
            }
        }
        return farthest >= n - 1;
    }
}
