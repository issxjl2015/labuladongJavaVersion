package org.issxjl2015.contest.weeklycontest.weeklycontest236.algo_5726._数组元素积的符号;

public class Solution {
    public int arraySign(int[] nums) {
        int ngative = 0;

        for (int i : nums) {
            if (i == 0) {
                return 0;
            } else if (i < 0) {
                ngative++;
            }
        }

        return ngative % 2 == 1 ? -1 : 1;
    }
}
