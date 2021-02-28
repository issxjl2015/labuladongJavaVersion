package org.issxjl2015.tx.arrayandstring.lc_盛最多水的容器;

public class Solution {

    public int maxArea(int[] height) {
        // 双指针用来确定容器的边界
        int left = 0, right = height.length - 1;
        int ans = 0;

        while (left < right) {
            int tmpAns = 1;
            // 根据 双指针上的值的大小来确定指针的走向
            if (height[left] <= height[right]) {
                tmpAns = height[left] * (right - left);
                left++;
            } else {
                tmpAns = height[right] * (right - left);
                right--;
            }
            // 确定当前容纳的水 与 ans 的 区别
            ans = Math.max(ans, tmpAns);
        }
        return ans;
    }
}
