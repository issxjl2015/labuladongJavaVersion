package org.issxjl2015.chapter3.algo_7_特殊数据结构_单调栈;

import java.util.Stack;

public class Lc_739_每日温度 {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[T.length];
        for (int i = T.length - 1; i >= 0; i--) {
            // 把温度低的元素索引pop出来
            while (!stack.isEmpty() && T[stack.peek()] <= T[i]) {
                stack.pop();
            }
            // 得到索引间距
            ans[i] = stack.empty() ? 0 : (stack.peek() - i);
            // 加入索引
            stack.push(i);
        }
        return ans;
    }
}
