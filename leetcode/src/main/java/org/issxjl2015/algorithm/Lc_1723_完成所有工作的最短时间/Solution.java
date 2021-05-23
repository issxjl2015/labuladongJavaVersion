package org.issxjl2015.algorithm.Lc_1723_完成所有工作的最短时间;

public class Solution {

    int[] jobs;
    int n, k;
    int ans = 0x3f3f3f3f;
    public int minimumTimeRequired(int[] _jobs, int _k) {
        jobs = _jobs;
        n = _jobs.length;
        k = _k;
        int[] sum = new int[k];
        dfs(sum, 0, 0, 0);
        return ans;
    }

    /**
     *
     * @param sum 工人的当前分配情况
     * @param u 当前处理到哪个 job
     * @param used 当前分配给了多少个工人了
     * @param max 当前的 最大工作时间
     */
    private void dfs(int[] sum, int u, int used, int max) {
        if (max >= ans) {
            return;
        }
        if (u == n) {
            ans = max;
            return;
        }
        // 优先分配给 空闲工人
        if (used < k) {
            sum[used] = jobs[u];
            dfs(sum, u + 1, used + 1, Math.max(sum[used], max));
            sum[used] = 0;
        }

        for (int i = 0; i < used; i++) {
            sum[i] += jobs[u];
            dfs(sum, u + 1, used, Math.max(sum[i], max));
            sum[i] -= jobs[u];
        }
    }
}
