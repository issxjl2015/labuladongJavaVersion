package org.issxjl2015.chapter5.algo_2_如何高效进行模幂运算;

public class Lc_372_超级次方 {
    int base = 1337;
    public int superPow(int a, int[] b) {
        // 递归的 base case
        if (b.length == 0) {
            return 1;
        }
        int len = b.length;
        // 取出最后一个数
        int last = b[len - 1];
        int[] bback = new int[len - 1];
        for (int i = 0; i < len - 1; i++) {
            bback[i] = b[i];
        }

        // 将原问题化简，缩小规模递归求解
        int part1 = myPow(a, last);
        int part2 = myPow(superPow(a, bback), 10);
        // 合并结果
        return (part1 * part2) % base;
    }

    public int myPow(int a, int k) {
        // 对因子求模
        a %= base;
        int res = 1;
        for (int i = 0; i < k; i++) {
            // 这里有乘法，是潜在的溢出点
            res *= a;
            // 对乘法结果求模
            res %= base;
        }
        return res;
    }
}
