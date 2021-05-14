package org.issxjl2015.algorithm.Lc_215_数组中的第K大最大元素;

import java.util.PriorityQueue;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            if (queue.size() < k) {
                queue.add(num);
            } else {
                if (queue.size() > 0 && queue.peek() < num) {
                    queue.remove();
                    queue.add(num);
                }
            }
        }
        return queue.size() > 0 ? queue.peek() : 0;
    }

}
