package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp;

import org.issxjl2015.common.NTreeNode;

/**
 * N叉树的遍历框架，同时，N叉树的遍历可以扩展为图的遍历
 * 因为图就是好几个N叉树的结合体
 */
public class NTreeNodeBaseOp {

    public void traverse(NTreeNode root) {
        for (NTreeNode child : root.children) {
            traverse(child);
        }
    }
}
