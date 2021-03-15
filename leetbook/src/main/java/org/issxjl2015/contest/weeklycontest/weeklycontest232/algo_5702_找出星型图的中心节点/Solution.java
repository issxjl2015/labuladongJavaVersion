package org.issxjl2015.contest.weeklycontest.weeklycontest232.algo_5702_找出星型图的中心节点;

import java.util.Arrays;

public class Solution {

    public int findCenter(int[][] edges) {
        for (int[] edge : edges) {
            Arrays.sort(edge);
        }

        int node1 = edges[0][0];
        int node2 = edges[0][1];
        for (int i = 1; i < edges.length; i++) {
            if (edges[i][0] == node1) {
                return node1;
            } else if (edges[i][0] == node2) {
                return node2;
            } else if (edges[i][1] == node1) {
                return node1;
            } else {
                return node2;
            }
        }
        return node1;
    }
}
