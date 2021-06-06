package org.issxjl2015.algorithm.Lc_21_合并两个有序链表;

import org.issxjl2015.common.ListNode;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l = solution.mergeTwoLists(l1, l2);
        System.out.println(l);
    }
}
