package org.issxjl2015.chapter1.algo_2_动态规划解题套路框架;

public class Lc_509_斐波那契数 {

    /**
     * 暴力递归，毫无疑问，无法AC
     * 原因在于，当 n 很大时，会存在很大的重复计算
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fib1(n - 1) + fib1(n - 2);
    }

    /********************带备忘录的递归解法-start********************/

    /**
     * 带备忘录的递归解法, 也叫 自顶向下
     * 自顶向下：从上向下延伸，都是从一个规模较大的原问题，f(n)，
     * 向下逐渐分解规模，直到 f(1) 和 f(2) 这两个 base case，然后逐层返回答案
     * @param n n
     * @return 返回 dp[n]
     */
    private int helper2(int[] dp, int n) {
        // base case
        if (n == 1 || n == 2) return 1;
        // 已经计算过
        if (dp[n] != 0) return dp[n];
        dp[n] = helper2(dp, n - 1) + helper2(dp, n - 2);
        return dp[n];
    }

    public int fib2(int n) {
        if (n == 0) return 0;
        // 使用一个数组作为 “备忘录”
        int[] dp = new int[n + 1];
        return helper2(dp, n);
    }

    /********************带备忘录的递归解法-end********************/

    /******************** dp 数组的迭代解法-start********************/

    /**
     * dp 数组的迭代解法， 也叫 自底向上
     * 自底向上：直接从最下面、最简单、问题规模最小的 f(1) 和 f(2) 开始往上推，直到推到我们想要的答案 f(n)。
     * 这也是为什么动态规划一般都脱离了递归，而是由循环迭代完成计算的关键所在
     * @param n n
     * @return 返回dp[n]
     */
    public int fib3(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] dp = new int[n + 1];
        // base case
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /******************** dp 数组的迭代解法-end********************/

    /******************** dp 数组的迭代解法-再优化-start********************/

    /**
     * dp 数组的迭代解法——再优化
     * 观察 fib3() 可以看出， dp[n] 其实只跟 dp[n - 1] 以及 dp[n - 2] 有关
     * 因此，可以采用 “状态压缩”, 即 将 数组 dp 的大小 从 N 缩小到 2
     * @param n n
     * @return f(n)
     */
    public int fib4(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
    }

    /******************** dp 数组的迭代解法-再优化-end********************/
}
