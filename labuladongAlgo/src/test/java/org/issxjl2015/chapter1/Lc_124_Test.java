package org.issxjl2015.chapter1;

import lombok.extern.slf4j.Slf4j;
import org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_算法刷题指南.Lc_124_二叉树中的最大路径和;
import org.issxjl2015.common.TreeNode;
import org.junit.Test;

@Slf4j
public class Lc_124_Test {
    @Test
    public void test1() {
        Lc_124_二叉树中的最大路径和 solution = new Lc_124_二叉树中的最大路径和();
        TreeNode root = new TreeNode();
        root.val = 1;
        root.left = new TreeNode();
        root.left.val = 2;
        root.right = new TreeNode();
        root.right.val = 3;

        int ans = solution.maxPathSum(root);
        System.out.println(ans);
    }

}
