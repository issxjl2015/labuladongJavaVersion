package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp;


import org.issxjl2015.common.ListNode;

public class ListNodeBaseOp {

    // 迭代遍历
    public void traverse(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            System.out.println(p.val);
        }
    }

    // 递归遍历
    public void traverse2(ListNode head) {
        // 前序遍历 head.val
        traverse2(head.next);
        // 后续遍历 head .val
    }
}
