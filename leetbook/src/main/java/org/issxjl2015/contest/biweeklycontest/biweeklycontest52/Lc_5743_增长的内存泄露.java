package org.issxjl2015.contest.biweeklycontest.biweeklycontest52;

public class Lc_5743_增长的内存泄露 {
    public int[] memLeak(int memory1, int memory2) {
        int m1 = memory1, m2 = memory2;
        int cnt = 1;
        while (m1 >= 0 && m2 >= 0) {
            if (m1 >= m2) {
                if (m1 < cnt) {
                    break;
                }
                m1 -= cnt;
                cnt++;
            } else {
                if (m2 < cnt) {
                    break;
                }
                m2 -= cnt;
                cnt++;
            }
        }
        return new int[] {cnt, m1, m2};
    }
}
