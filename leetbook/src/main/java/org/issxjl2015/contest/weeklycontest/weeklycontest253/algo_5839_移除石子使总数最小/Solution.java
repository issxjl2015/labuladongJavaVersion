package org.issxjl2015.contest.weeklycontest.weeklycontest253.algo_5839_移除石子使总数最小;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/12:14
 * @Description:
 */
public class Solution {
    public int minStoneSum(int[] piles, int k) {
        // 排序
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);
        // 加入队列
        for (int pile : piles) {
            queue.add(pile);
        }

        while (k-- > 0 && !queue.isEmpty()) {
            int cur = queue.poll();
            // 对最大值进行处理
            cur -= cur / 2;
            // 加入到队列中
            queue.add(cur);
        }

        int ans = 0;
        while (!queue.isEmpty()) {
            ans += queue.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] piles = {5, 4, 9};
        int k = 2;
        int ans = solution.minStoneSum(piles, k);
        System.out.println(ans);
        System.out.println("-----------------------------");
        int[] piles1 = {4, 3, 6, 7};
        int k1 = 3;
        int ans1 = solution.minStoneSum(piles1, k1);
        System.out.println(ans1);
        System.out.println("-----------------------------");
        int[] piles2 = {10, 4, 3, 6, 7};
        int k2 = 3;
        int ans2 = solution.minStoneSum(piles2, k2);
        System.out.println(ans2);
    }
}
