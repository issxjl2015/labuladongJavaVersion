package org.issxjl2015.algorithm.Lc_337_打家劫舍III;

import org.issxjl2015.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/28/22:27
 * @Description:
 */
public class Solution {

    public int rob(TreeNode root) {
        Map<TreeNode, Integer> memo = new HashMap<>();
        return robAction(root, memo);
    }

    private int robAction(TreeNode root, Map<TreeNode, Integer> memo) {
        if (root == null) {
            return 0;
        }
        if (memo.containsKey(root)) {
            return memo.get(root);
        }

        // 抢，然后去下下家
        int do_it = root.val
                + (root.left == null ?
                    0 : robAction(root.left.left, memo) + robAction(root.left.right, memo))
                + (root.right == null ?
                    0 : robAction(root.right.left, memo) + robAction(root.right.right, memo));

        // 不抢，然后去下家
        int not_do = robAction(root.left, memo) + robAction(root.right, memo);
        // 取最大值
        int res = Math.max(do_it, not_do);
        memo.put(root, res);
        return res;
    }

}
