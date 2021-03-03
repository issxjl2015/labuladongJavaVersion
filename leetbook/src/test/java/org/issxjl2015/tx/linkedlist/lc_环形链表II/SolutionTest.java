package org.issxjl2015.tx.linkedlist.lc_环形链表II;

import org.issxjl2015.common.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(3);
        head.next = head2;
        ListNode head3 = new ListNode(2);
        head.next.next = head3;
        ListNode head4 = new ListNode(7);
        head.next.next.next = head4;
        ListNode head5 = new ListNode(7);
        head.next.next.next = head5;
        head.next.next.next.next = head3;

        ListNode ans = solution.detectCycle(head);
        Assert.assertEquals(2, ans.val);
    }


    @Test
    public void test2() {
        Solution solution = new Solution();
        ListNode head = new ListNode(0);
        ListNode head2 = new ListNode(3);
        head.next = head2;
        head.next.next = head;

        ListNode ans = solution.detectCycle(head);
        Assert.assertEquals(0, ans.val);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);

        // 无环的情况下，会返回null
        ListNode ans = solution.detectCycle(head);
        Assert.assertNull(ans);
    }
}
