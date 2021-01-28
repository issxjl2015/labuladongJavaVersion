package org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp;

public class ListNodeBaseOp {

    public void traverse(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            System.out.println(p.val);
        }
    }
}
