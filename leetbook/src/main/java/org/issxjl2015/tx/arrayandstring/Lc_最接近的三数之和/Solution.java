package org.issxjl2015.tx.arrayandstring.Lc_最接近的三数之和;

import java.util.Arrays;

/**
 * 三指针解法：遍历nums，下标为第一个指针，下边的右侧再定义一个指针是第二个指针，nums的最后一个数的下标是第三个指针
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // 定义一个较大的数
        int sum = Integer.MAX_VALUE / 2;
        // 从小到大排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // 第二个指针和第三个指针
            int l = i + 1, r = nums.length - 1;
            while ((l < nums.length - 1) && (r > 1) && (l < r)) {
                // 三数之和
                int tmp = nums[i] + nums[l] + nums[r];
                if (tmp == target) {
                    // 如果存在刚好等于target，那么直接返回
                    return target;
                } else {
                    // 比较三数之和与target的距离，谁大谁小，取小值
                    sum = Math.abs(sum - target) > Math.abs(tmp - target) ? tmp : sum;
                    // 判断 tmp 与 target 的大小，大的话，第三个指针减减；小的话，第二个指针加加
                    // 这样可以保证 三数之和 更接近 target
                    if (tmp > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return sum;
    }
}
