package org.issxjl2015.chapter1;

import org.issxjl2015.chapter1.algo_1_算法刷题框架思维.algo_datastrucBaseOp.ListNodeBaseOp;
import org.issxjl2015.common.ListNode;
import org.junit.Test;

public class ListNodeBaseOpTest {
    @Test
    public void test1() {
        ListNodeBaseOp listNodeBaseOp = new ListNodeBaseOp();
        ListNode head = new ListNode(-1);
        listNodeBaseOp.traverse(head);
    }
}
