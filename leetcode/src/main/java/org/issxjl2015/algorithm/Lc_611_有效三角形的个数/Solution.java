package org.issxjl2015.algorithm.Lc_611_有效三角形的个数;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/04/19:28
 * @Description: 超时了
 */
public class Solution {
    int res = 0;
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        dfs(nums,0, 0, 0);
        return res;
    }

    private void dfs(int[] nums, int cnt, int index, int sum) {
        // 终止条件：有三条边了
        if (cnt == 3) {
            res++;
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (cnt == 2) {
                // 判断当前组成的三条边是否合法
                if (sum <= nums[i]) {
                    break;
                }
            }
            // 回溯
            dfs(nums, cnt + 1, i + 1, sum + nums[i]);
        }
    }
}
